package zw.org.mohcc.hiv.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import zw.org.mohcc.hiv.model.ArtRegister;
import zw.org.mohcc.hiv.dto.ArtRegisterGrouped;

public interface ArtRegisterService {

    Page<ArtRegister> findAll(Pageable pageable);
    Page<ArtRegisterGrouped> findAllGroupedBySiteIdAndYear(Pageable pageable);
}
