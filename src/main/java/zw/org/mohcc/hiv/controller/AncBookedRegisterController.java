package zw.org.mohcc.hiv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import zw.org.mohcc.hiv.model.AncBookedRegister;
import zw.org.mohcc.hiv.service.AncBookedRegisterService;

@RestController
@RequestMapping("/api/art-booked")
public class AncBookedRegisterController {

    private final AncBookedRegisterService ancBookedRegisterService;

    @Autowired
    public AncBookedRegisterController(AncBookedRegisterService ancBookedRegisterService) {
        this.ancBookedRegisterService = ancBookedRegisterService;
    }

    @GetMapping("/get-all")
    public ResponseEntity<Page<AncBookedRegister>> findAll(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "100") int size) {

        Pageable pageable = PageRequest.of(page, size);
        Page<AncBookedRegister> ancBookedRegisterPage = ancBookedRegisterService.findAll(pageable);
        return ResponseEntity.ok(ancBookedRegisterPage);
    }

    @GetMapping("/{ancId}/{patientId}")
    public ResponseEntity<AncBookedRegister> getAncBookedRegisterById(@PathVariable String ancId, @PathVariable String patientId) {
        return ancBookedRegisterService.getById(ancId, patientId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
