package crm.example.crm.leads;
import org.springframework.stereotype.Service;
@Service
public class LeadService {
    private final LeadsRepo leadsRepo;
    public LeadService(LeadsRepo leadsRepo) {
        this.leadsRepo = leadsRepo;
    }
    public leads createLead(leads lead){
        return leadsRepo.save(lead);
    }
}
