package com.cwdegidio.mlb_rest_server.services;

import com.cwdegidio.mlb_rest_server.entities.OPSLeader;
import com.cwdegidio.mlb_rest_server.repositories.OPSLeaderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OPSLeaderServiceImpl implements OPSLeaderService {

    private final OPSLeaderRepository opsLeaderRepository;

    public OPSLeaderServiceImpl(OPSLeaderRepository opsLeaderRepository) {
        this.opsLeaderRepository = opsLeaderRepository;
    }

    @Override
    public List<OPSLeader> getAllOPSLeaders() {

        List<OPSLeader> opsLeaderList = opsLeaderRepository.findAll();
        return opsLeaderList;
    }

    @Override
    public Optional<OPSLeader> getOPSLeaderById(Integer id) {
        Optional<OPSLeader> opsLeader = opsLeaderRepository.findById(id);
        return opsLeader;
    }
}
