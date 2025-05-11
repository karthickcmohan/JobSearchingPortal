// src/App.js
import React from 'react';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import Navbar from './components/Navbar';
import Footer from './components/Footer';
import Homepage from './components/HomePage';
import LoginPage from './components/LoginPage';
import SignupPage from './components/SignupPage';
import CompanyDashboard from './components/CompanyDashboard';
import AboutPage from './components/AboutPage';
import ContactPage from './components/ContactPage';
import JobList from './components/JobList';
import AdminDashboard from './components/AdminDashboard';
import ApplyPage from './components/ApplyPage';



import './styles.css';




function App() {
  return (
    <Router>
      <Navbar />
      <div className="main-content">
        <Routes>
          <Route path="/" element={<Homepage />} />
          <Route path="/login" element={<LoginPage />} />
          <Route path="/signup" element={<SignupPage />} />
          <Route path="/about" element={<AboutPage />} />
          <Route path="/contact" element={<ContactPage />} />
          <Route path="/jobs" element={<JobList />} />
          
        <Route path="/admin-dashboard" element={<AdminDashboard />} />
        <Route path="/company-dashboard" element={<CompanyDashboard />} />
        <Route path="/apply" element={<ApplyPage />} />
   
        
        </Routes>
      </div>
      <Footer />
    </Router>
  );
}

export default App;
