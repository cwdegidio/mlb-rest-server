package com.cwdegidio.mlb_rest_server.conrollers;

import com.cwdegidio.mlb_rest_server.entities.OPSLeader;
import com.cwdegidio.mlb_rest_server.services.OPSLeaderService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class OPSLeaderControllerImpl implements OPSLeaderController {
    private final OPSLeaderService opsLeaderService;

    public OPSLeaderControllerImpl(OPSLeaderService opsLeaderService) {
        this.opsLeaderService = opsLeaderService;
    }

    @CrossOrigin
    @GetMapping("/ops_leaders")
    public ResponseEntity<List<OPSLeader>> getOPSLeaders() {
        List<OPSLeader> opsLeaderList = opsLeaderService.getAllOPSLeaders();
        return new ResponseEntity<>(opsLeaderList, HttpStatus.OK);
    }

    @CrossOrigin
    @GetMapping("/ops_leaders/{id}")
    public ResponseEntity<OPSLeader> getOPSLeaderById(@PathVariable String id) {
        Optional<OPSLeader> opsLeader = opsLeaderService.getOPSLeaderById(Integer.parseInt(id));
        if(opsLeader.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(opsLeader.get(), HttpStatus.OK);
        }
    }
}
