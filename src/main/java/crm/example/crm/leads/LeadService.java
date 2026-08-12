package crm.example.crm.leads;
import java.util.*;
import java.time.LocalDateTime;

import org.springframework.stereotype.Service;
@Service
public class LeadService {
    private final LeadsRepo leadsRepo;
    public LeadService(LeadsRepo leadsRepo) {
        this.leadsRepo = leadsRepo;
    }
    public Lead createLead(Lead lead){
        lead.setCreatedAt(LocalDateTime.now());
        lead.setUpdatedAt(LocalDateTime.now());

    return leadsRepo.save(lead);
    }
    public List<Lead> getAllLeads() {
    return leadsRepo.findAll();
}
public Lead updateLead(Long id, Lead lead) {
    Lead existingLead = leadsRepo.findById(id)
            .orElseThrow(() -> new RuntimeException("Lead not found"));

    existingLead.setName(lead.getName());
    existingLead.setEmail(lead.getEmail());
    existingLead.setPhone(lead.getPhone());
    existingLead.setCompany(lead.getCompany());
    existingLead.setStatus(lead.getStatus());

    return leadsRepo.save(existingLead);
}
}
