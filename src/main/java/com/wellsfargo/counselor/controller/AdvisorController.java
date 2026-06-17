package com.wellsfargo.counselor.controller;

import com.wellsfargo.counselor.entity.Advisor;
import com.wellsfargo.counselor.service.AdvisorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/advisors")
public class AdvisorController {

    @Autowired
    private AdvisorService advisorService;

    // CREATE
    @PostMapping
    public Advisor createAdvisor(@RequestBody Advisor advisor) {
        return advisorService.saveAdvisor(advisor);
    }

    // GET ALL
    @GetMapping
    public List<Advisor> getAllAdvisors() {
        return advisorService.getAllAdvisors();
    }

    // GET BY ID
    @GetMapping("/{id}")
    public Advisor getAdvisorById(@PathVariable Long id) {
        return advisorService.getAdvisorById(id);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void deleteAdvisor(@PathVariable Long id) {
        advisorService.deleteAdvisor(id);
    }
}