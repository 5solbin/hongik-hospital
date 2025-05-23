package hongik.hospital.domain.hospital;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface HospitalRepository extends JpaRepository<Hospital, Long> {

    Optional<Hospital> findByUsername(String username);

    Optional<Hospital> findByName(String name);
}
