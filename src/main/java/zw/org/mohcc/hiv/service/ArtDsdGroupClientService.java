package zw.org.mohcc.hiv.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import zw.org.mohcc.hiv.model.ArtDsdGroupClient;

public interface ArtDsdGroupClientService {

    Page<ArtDsdGroupClient> findAll(Pageable pageable);
}
