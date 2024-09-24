package zw.org.mohcc.hiv.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import zw.org.mohcc.hiv.model.TptScreening;

public interface TptScreeningService {

    Page<TptScreening> findAll(Pageable pageable);
}
