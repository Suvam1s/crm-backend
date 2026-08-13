package crm.example.crm.Opportunity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.*;
public interface Opportunityrepo extends JpaRepository<Opportunity, Long> {
    List<Opportunity> findByStatus(Oppstatus status);
    @Query("SELECT o.Amount FROM Opportunity o")
    List<Integer> findAmount();
}
