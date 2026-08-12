package crm.example.crm.leads;
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
}
