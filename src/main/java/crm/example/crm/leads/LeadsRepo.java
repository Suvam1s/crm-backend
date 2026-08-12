package crm.example.crm.leads;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeadsRepo extends JpaRepository<Lead, Long> {
    
}
