package zw.org.mohcc.hiv.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zw.org.mohcc.hiv.model.ArtDsdGroup;
import zw.org.mohcc.hiv.model.ArtDsdGroupPK;

@Repository
public interface ArtDsdGroupRepository extends JpaRepository<ArtDsdGroup, ArtDsdGroupPK> {

    @Override
    Page<ArtDsdGroup> findAll(Pageable pageable);
}
