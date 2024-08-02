package com.cwdegidio.mlb_rest_server.repositories;

import com.cwdegidio.mlb_rest_server.entities.OPSLeader;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface OPSLeaderRepository extends JpaRepository<OPSLeader, Integer> {
    List<OPSLeader> findAll();
    Optional<OPSLeader> findById(Integer id);
}
