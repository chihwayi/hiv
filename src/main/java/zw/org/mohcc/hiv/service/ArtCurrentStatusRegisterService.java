package zw.org.mohcc.hiv.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import zw.org.mohcc.hiv.dto.ArtStatus;
import zw.org.mohcc.hiv.model.ArtCurrentStatusRegister;

import java.util.List;

public interface ArtCurrentStatusRegisterService {

    Page<ArtCurrentStatusRegister> findAll(Pageable pageable);
    List<ArtStatus> getArtStatusOverTime();
}
