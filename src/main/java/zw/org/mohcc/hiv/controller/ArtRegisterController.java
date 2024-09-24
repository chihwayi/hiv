package zw.org.mohcc.hiv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import zw.org.mohcc.hiv.model.ArtRegister;
import zw.org.mohcc.hiv.dto.ArtRegisterGrouped;
import zw.org.mohcc.hiv.service.ArtRegisterService;

@RestController
@RequestMapping("/api/art-register")
public class ArtRegisterController {

    private final ArtRegisterService artRegisterService;

    @Autowired
    public ArtRegisterController(ArtRegisterService artRegisterService) {
        this.artRegisterService = artRegisterService;
    }

    @GetMapping("/get-all")
    public ResponseEntity<Page<ArtRegister>> findAll(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "100") int size) {

        Pageable pageable = PageRequest.of(page, size);
        Page<ArtRegister> artRegisterPage = artRegisterService.findAll(pageable);
        return ResponseEntity.ok(artRegisterPage);
    }

    @GetMapping("/get-all-grouped")
    public ResponseEntity<Page<ArtRegisterGrouped>> findAllGrouped(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "100") int size) {

        Pageable pageable = PageRequest.of(page, size);
        Page<ArtRegisterGrouped> artRegisterPage = artRegisterService.findAllGroupedBySiteIdAndYear(pageable);
        return ResponseEntity.ok(artRegisterPage);
    }

}
