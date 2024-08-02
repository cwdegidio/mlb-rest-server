package com.cwdegidio.mlb_rest_server.services;

import com.cwdegidio.mlb_rest_server.entities.OPSLeader;

import java.util.List;
import java.util.Optional;

public interface OPSLeaderService {
    List<OPSLeader> getAllOPSLeaders();
    Optional<OPSLeader> getOPSLeaderById(Integer id);
}
