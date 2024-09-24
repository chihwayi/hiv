package zw.org.mohcc.hiv.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import zw.org.mohcc.hiv.model.ArtDsdGroupAppointment;
import zw.org.mohcc.hiv.repository.ArtDsdGroupAppointmentRepository;
import zw.org.mohcc.hiv.service.ArtDsdGroupAppointmentService;

@Service
public class ArtDsdGroupAppointmentServiceImpl implements ArtDsdGroupAppointmentService {

    private final ArtDsdGroupAppointmentRepository artDsdGroupAppointmentRepository;

    @Autowired
    public ArtDsdGroupAppointmentServiceImpl(ArtDsdGroupAppointmentRepository artDsdGroupAppointmentRepository) {
        this.artDsdGroupAppointmentRepository = artDsdGroupAppointmentRepository;
    }

    @Override
    public Page<ArtDsdGroupAppointment> findAll(Pageable pageable) {
        return artDsdGroupAppointmentRepository.findAll(pageable);
    }
}
