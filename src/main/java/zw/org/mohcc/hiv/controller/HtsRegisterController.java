package zw.org.mohcc.hiv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import zw.org.mohcc.hiv.model.HtsRegister;
import zw.org.mohcc.hiv.service.HtsRegisterService;

@RestController
@RequestMapping("/api/hts-register")
public class HtsRegisterController {

    private final HtsRegisterService htsRegisterService;

    @Autowired
    public HtsRegisterController(HtsRegisterService htsRegisterService) {
        this.htsRegisterService = htsRegisterService;
    }

    @GetMapping("/get-all")
    public ResponseEntity<Page<HtsRegister>> findAll(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "100") int size) {

        Pageable pageable = PageRequest.of(page, size);
        Page<HtsRegister> htsRegisterPage = htsRegisterService.findAll(pageable);
        return ResponseEntity.ok(htsRegisterPage);
    }
}
