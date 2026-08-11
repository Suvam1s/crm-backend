package crm.example.crm.leads;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class LeadController {

    private final LeadService leadService;

    public LeadController(LeadService leadService) {
        this.leadService = leadService;
    }
}
