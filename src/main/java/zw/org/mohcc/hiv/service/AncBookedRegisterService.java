package zw.org.mohcc.hiv.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import zw.org.mohcc.hiv.model.AncBookedRegister;

import java.util.Optional;

public interface AncBookedRegisterService {
    Page<AncBookedRegister> findAll(Pageable pageable);
    Optional<AncBookedRegister> getById(String ancId, String patientId);
}
