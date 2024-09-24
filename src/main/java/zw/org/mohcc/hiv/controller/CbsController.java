package zw.org.mohcc.hiv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import zw.org.mohcc.hiv.model.Cbs;
import zw.org.mohcc.hiv.service.CbsService;

@RestController
@RequestMapping("/api/cbs")
public class CbsController {

    private final CbsService cbsService;

    @Autowired
    public CbsController(CbsService cbsService) {
        this.cbsService = cbsService;
    }

    @GetMapping("/get-all")
    public ResponseEntity<Page<Cbs>> findAll(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "100") int size) {

        Pageable pageable = PageRequest.of(page, size);
        Page<Cbs> cbsPage = cbsService.findAll(pageable);
        return ResponseEntity.ok(cbsPage);
    }
}
