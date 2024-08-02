package com.cwdegidio.mlb_rest_server.conrollers;

import com.cwdegidio.mlb_rest_server.entities.OPSLeader;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Map;

public interface OPSLeaderController {
    ResponseEntity<List<OPSLeader>> getOPSLeaders();
    ResponseEntity<OPSLeader> getOPSLeaderById(String id);
}
