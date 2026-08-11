package crm.example.crm.leads;
import java.time.LocalDateTime;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "leads")
public class leads {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
private String name;
private String email;
private String phone;
private String source;
private String company;
@Enumerated(EnumType.STRING)
private LeadStatus status;
@Column(name = "created_at") 
private LocalDateTime createdAt;
@Column(name = "updated_at") 
private LocalDateTime updatedAt;
}
