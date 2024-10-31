package zw.org.mohcc.hiv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zw.org.mohcc.hiv.dto.ArtStatus;
import zw.org.mohcc.hiv.service.ArtCurrentStatusRegisterService;

import java.util.List;

@RestController
@RequestMapping("/api/art-status")
public class ArtCurrentStatusRegisterController {

    private final ArtCurrentStatusRegisterService artCurrentStatusRegisterService;

    @Autowired
    public ArtCurrentStatusRegisterController(ArtCurrentStatusRegisterService artCurrentStatusRegisterService) {
        this.artCurrentStatusRegisterService =  artCurrentStatusRegisterService;
    }

    @GetMapping("/over-time")
    public ResponseEntity<List<ArtStatus>> getArtStatusOverTime() {
        List<ArtStatus> data = artCurrentStatusRegisterService.getArtStatusOverTime();
        return new ResponseEntity<>(data, HttpStatus.OK);
    }
}
