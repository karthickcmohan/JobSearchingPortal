package com.example.demo.Controller;


import com.example.demo.Entity.Agent;
import com.example.demo.Service.AgentService;
import com.example.demo.Service.JwtService;
import com.example.demo.dto.AuthRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("/agents")
public class AgentController {
    @Autowired
    private AgentService agentService;
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private JwtService jwtService;

    @GetMapping
    public List<Agent> getAllAgents() {
        return agentService.getAllAgents();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Agent> getAgentById(@PathVariable Long id) {
        Optional<Agent> agent = agentService.getAgentById(id);
        return agent.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Agent createAgent(@RequestBody Agent agent) {
        return agentService.saveAgent(agent);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAgent(@PathVariable Long id) {
        agentService.deleteAgent(id);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/authenticate")
public ResponseEntity<?> authenticateAndGetToken(@RequestBody AuthRequest authRequest) {
    System.out.println("Received authentication request: " + authRequest);
    try {
        Authentication authentication = authenticationManager.authenticate(
            new UsernamePasswordAuthenticationToken(authRequest.getUsername(), authRequest.getPassword())
        );
        if (authentication.isAuthenticated()) {
            String token = jwtService.generateToken(authRequest.getUsername());
            return ResponseEntity.ok(token);
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
        }
    } catch (Exception e) {
        System.out.println("Authentication failed: " + e.getMessage());
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Authentication failed");
    }
}

}
