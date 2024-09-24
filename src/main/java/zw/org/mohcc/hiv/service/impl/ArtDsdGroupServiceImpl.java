package zw.org.mohcc.hiv.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import zw.org.mohcc.hiv.model.ArtDsdGroup;
import zw.org.mohcc.hiv.repository.ArtDsdGroupRepository;
import zw.org.mohcc.hiv.service.ArtDsdGroupService;

@Service
public class ArtDsdGroupServiceImpl implements ArtDsdGroupService {

    private final ArtDsdGroupRepository artDsdGroupRepository;

    @Autowired
    public ArtDsdGroupServiceImpl(ArtDsdGroupRepository artDsdGroupRepository) {
        this.artDsdGroupRepository = artDsdGroupRepository;
    }

    @Override
    public Page<ArtDsdGroup> findAll(Pageable pageable) {
        return artDsdGroupRepository.findAll(pageable);
    }
}
