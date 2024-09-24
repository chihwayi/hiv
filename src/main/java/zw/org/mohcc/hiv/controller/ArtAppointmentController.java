package zw.org.mohcc.hiv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import zw.org.mohcc.hiv.model.ArtAppointment;
import zw.org.mohcc.hiv.service.ArtAppointmentService;

import java.util.List;

@RestController
@RequestMapping("/api/art-appointments")
public class ArtAppointmentController {

    private final ArtAppointmentService artAppointmentService;

    @Autowired
    public ArtAppointmentController(ArtAppointmentService artAppointmentService) {
        this.artAppointmentService = artAppointmentService;
    }

    @GetMapping("/{artAppointmentRegisterId}/{artId}")
    public ResponseEntity<ArtAppointment> getArtAppointmentById(@PathVariable String artAppointmentRegisterId, @PathVariable String artId) {
        return artAppointmentService.getById(artAppointmentRegisterId, artId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/site-id/{id}")
    public ResponseEntity<List<ArtAppointment>> getArtAppointmentBySiteId(@PathVariable String id) {
        List<ArtAppointment> artAppointmentList = artAppointmentService.findArtAppointmentBySiteId(id);
        return ResponseEntity.ok(artAppointmentList);
    }

    @GetMapping("/entities")
    public ResponseEntity<Page<ArtAppointment>> findAll(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "100") int size) {

        Pageable pageable = PageRequest.of(page, size);
        Page<ArtAppointment> artAppointmentPage = artAppointmentService.findAll(pageable);
        return ResponseEntity.ok(artAppointmentPage);
    }

}

