package crm.example.crm.leads;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/leads")
public class LeadController {

    private final LeadService leadService;

    public LeadController(LeadService leadService) {
        this.leadService = leadService;
    }
    @PostMapping
    public Lead createLead(@RequestBody Lead lead){
        return leadService.createLead(lead);

    }
}
