package zw.org.mohcc.hiv.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import zw.org.mohcc.hiv.model.ArtAppointment;
import zw.org.mohcc.hiv.model.ArtAppointmentPK;
import zw.org.mohcc.hiv.repository.ArtAppointmentRepository;
import zw.org.mohcc.hiv.service.ArtAppointmentService;

import java.util.List;
import java.util.Optional;

@Service
public class ArtAppointmentServiceImpl implements ArtAppointmentService {

    private final ArtAppointmentRepository artAppointmentRepository;

    @Autowired
    public ArtAppointmentServiceImpl(ArtAppointmentRepository artAppointmentRepository) {
        this.artAppointmentRepository = artAppointmentRepository;
    }

    @Override
    public List<ArtAppointment> findArtAppointmentBySiteId(String id) {
        return artAppointmentRepository.findArtAppointmentBySiteId(id);
    }

    @Override
    public Page<ArtAppointment> findAll(Pageable pageable) {
        return artAppointmentRepository.findAll(pageable);
    }

    @Override
    public Optional<ArtAppointment> getById(String artAppointmentRegisterId, String artId) {
        ArtAppointmentPK id = new ArtAppointmentPK();
        id.setArtAppointmentRegisterId(artAppointmentRegisterId);
        id.setArtId(artId);
        return artAppointmentRepository.findById(id);
    }
}
