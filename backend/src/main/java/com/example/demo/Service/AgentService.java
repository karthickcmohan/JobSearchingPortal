package com.example.demo.Service;

import com.example.demo.Entity.Agent;
import com.example.demo.Repository.AgentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AgentService {
    @Autowired
    private AgentRepository agentRepository;

    public List<Agent> getAllAgents() {
        return agentRepository.findAll();
    }

    public Optional<Agent> getAgentById(Long id) {
        return agentRepository.findById(id);
    }

    public Optional<Agent> getAgentByEmail(String email) {
        return agentRepository.findByEmail(email);
    }

    public Agent saveAgent(Agent agent) {
        return agentRepository.save(agent);
    }

    public void deleteAgent(Long id) {
        agentRepository.deleteById(id);
    }
}
