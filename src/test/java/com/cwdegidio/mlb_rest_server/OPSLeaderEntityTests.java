package com.cwdegidio.mlb_rest_server;

import com.cwdegidio.mlb_rest_server.entities.OPSLeader;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(properties = {"spring.datasource.url=jdbc:postgresql://66.228.48.112:8001/springboot_test_baseball"})
public class OPSLeaderEntityTests {
    @Test
    void shouldCreateNewOPSLeader() throws Exception {
        OPSLeader opsLeader = new OPSLeader(
                1, "19-CLE", "CLE", "Jose", "Ramirez", "S", 103, 446, 106, 4.2075471698113208f, 410, 0.276f, 0.856f
        );

        assertThat(opsLeader).isNotNull();
        assertThat(opsLeader.getId()).isEqualTo(1);
        assertThat(opsLeader.getPlayerId()).isEqualTo("19-CLE");
        assertThat(opsLeader.getTeam()).isEqualTo("CLE");
        assertThat(opsLeader.getFirstName()).isEqualTo("Jose");
        assertThat(opsLeader.getLastName()).isEqualTo("Ramirez");
        assertThat(opsLeader.getBats()).isEqualTo("S");
        assertThat(opsLeader.getGamesPlayed()).isEqualTo(103);
        assertThat(opsLeader.getPlateAppearances()).isEqualTo(446);
        assertThat(opsLeader.getTeamGamesPlayed()).isEqualTo(106);
        assertThat(opsLeader.getAppPerGame()).isEqualTo(4.2075471698113208f);
        assertThat(opsLeader.getAtBats()).isEqualTo(410);
        assertThat(opsLeader.getBattingAverage()).isEqualTo(0.276f);
        assertThat(opsLeader.getOnBasePlusSlugging()).isEqualTo(0.856f);
    }

    @Test
    void shouldSetId() throws Exception {
        OPSLeader opsLeader = new OPSLeader();
        opsLeader.setId(1);
        assertThat(opsLeader.getId()).isEqualTo(1);
    }

    @Test
    void shouldSetPlayerId() throws Exception {
        OPSLeader opsLeader = new OPSLeader();
        opsLeader.setPlayerId("CLE-1");
        assertThat(opsLeader.getPlayerId()).isEqualTo("CLE-1");
    }

    @Test
    void shouldSetTeam() throws Exception {
        OPSLeader opsLeader = new OPSLeader();
        opsLeader.setTeam("CLE");
        assertThat(opsLeader.getTeam()).isEqualTo("CLE");
    }

    @Test
    void shouldSetFirstName() throws Exception {
        OPSLeader opsLeader = new OPSLeader();
        opsLeader.setFirstName("Jose");
        assertThat(opsLeader.getFirstName()).isEqualTo("Jose");
    }

    @Test
    void shouldSetLastName() throws Exception {
        OPSLeader opsLeader = new OPSLeader();
        opsLeader.setLastName("Ramirez");
        assertThat(opsLeader.getLastName()).isEqualTo("Ramirez");
    }

    @Test
    void shouldSetBats() throws Exception {
        OPSLeader opsLeader = new OPSLeader();
        opsLeader.setBats("R");
        assertThat(opsLeader.getBats()).isEqualTo("R");
    }

    @Test
    void shouldSetGamesPlayed() throws Exception {
        OPSLeader opsLeader = new OPSLeader();
        opsLeader.setGamesPlayed(113);
        assertThat(opsLeader.getGamesPlayed()).isEqualTo(113);
    }

    @Test
    void shouldSetPlateAppearances() throws Exception {
        OPSLeader opsLeader = new OPSLeader();
        opsLeader.setPlateAppearances(12);
        assertThat(opsLeader.getPlateAppearances()).isEqualTo(12);
    }

    @Test
    void shouldSetTeamGamesPlayed() throws Exception {
        OPSLeader opsLeader = new OPSLeader();
        opsLeader.setTeamGamesPlayed(13);
        assertThat(opsLeader.getTeamGamesPlayed()).isEqualTo(13);
    }

    @Test
    void shouldSetAppPerGame() throws Exception {
        OPSLeader opsLeader = new OPSLeader();
        opsLeader.setAppPerGame(2.75f);
        assertThat(opsLeader.getAppPerGame()).isEqualTo(2.75f);
    }

    @Test
    void shouldSetAtBats() throws Exception {
        OPSLeader opsLeader = new OPSLeader();
        opsLeader.setAtBats(12);
        assertThat(opsLeader.getAtBats()).isEqualTo(12);
    }

    @Test
    void shouldSetBattingAverage() throws Exception {
        OPSLeader opsLeader = new OPSLeader();
        opsLeader.setBattingAverage(0.310f);
        assertThat(opsLeader.getBattingAverage()).isEqualTo(0.310f);
    }

    @Test
    void shouldSetOnBasePlusSlugging() throws Exception {
        OPSLeader opsLeader = new OPSLeader();
        opsLeader.setOnBasePlusSlugging(0.856f);
        assertThat(opsLeader.getOnBasePlusSlugging()).isEqualTo(0.856f);
    }
}
