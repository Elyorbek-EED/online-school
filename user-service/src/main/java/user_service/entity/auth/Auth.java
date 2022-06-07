package user_service.entity.auth;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import online_school_jar.entity.Auditable;
import org.hibernate.annotations.Where;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.UUID;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
@Where(clause = "is_deleted is false")

public class Auth extends Auditable {

    @Column(name = "code", unique = true, nullable = false)
    private UUID code = UUID.randomUUID();

    @Column(name = "user_name", nullable = false, unique = true)
    private String userName;

    @Column(name = "phone", nullable = false, unique = true)
    private String phone;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

//    @Column(name = "language")
//    @Enumerated(EnumType.STRING)
//    private Language language;

//    @Column(name = "status")
//    @Enumerated(EnumType.STRING)
//    private Status status;

//    @Column(name = "gender", nullable = false)
//    @Enumerated(EnumType.STRING)
//    private Gender gender;

    @Column(name = "birthday", nullable = false)
    @DateTimeFormat(pattern = "dd-MMMM-yyyy")
    private LocalDate birthday;

//    @ManyToOne(fetch = FetchType.EAGER)
//    private Role role;

//    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    private Address address;

}
