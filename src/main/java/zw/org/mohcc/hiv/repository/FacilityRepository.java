package zw.org.mohcc.hiv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zw.org.mohcc.hiv.model.Facility;

@Repository
public interface FacilityRepository  extends JpaRepository<Facility, String> {
}
