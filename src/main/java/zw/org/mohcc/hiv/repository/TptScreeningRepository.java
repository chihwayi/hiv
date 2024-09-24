package zw.org.mohcc.hiv.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import zw.org.mohcc.hiv.model.TptScreening;
import zw.org.mohcc.hiv.model.TptScreeningPK;

public interface TptScreeningRepository extends JpaRepository<TptScreening, TptScreeningPK> {

    @Override
    Page<TptScreening> findAll(Pageable pageable);
}
