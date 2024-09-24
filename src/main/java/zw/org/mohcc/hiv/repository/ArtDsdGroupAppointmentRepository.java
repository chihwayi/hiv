package zw.org.mohcc.hiv.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zw.org.mohcc.hiv.model.ArtDsdGroupAppointment;
import zw.org.mohcc.hiv.model.ArtDsdGroupAppointmentPK;

@Repository
public interface ArtDsdGroupAppointmentRepository extends JpaRepository<ArtDsdGroupAppointment, ArtDsdGroupAppointmentPK> {

    @Override
    Page<ArtDsdGroupAppointment> findAll(Pageable pageable);
}
