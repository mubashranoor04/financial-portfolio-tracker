package com.wellsfargo.counselor.service;

import com.wellsfargo.counselor.entity.Advisor;
import com.wellsfargo.counselor.repository.AdvisorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdvisorService {

    @Autowired
    private AdvisorRepository advisorRepository;

    // CREATE / SAVE
    public Advisor saveAdvisor(Advisor advisor) {
        return advisorRepository.save(advisor);
    }

    // GET ALL
    public List<Advisor> getAllAdvisors() {
        return advisorRepository.findAll();
    }

    // GET BY ID
    public Advisor getAdvisorById(Long id) {
        return advisorRepository.findById(id).orElse(null);
    }

    // DELETE
    public void deleteAdvisor(Long id) {
        advisorRepository.deleteById(id);
    }
}