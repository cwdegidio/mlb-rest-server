package com.cwdegidio.mlb_rest_server.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ops_leaders")
public class OPSLeader {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @Column(name="player_id")
    private String playerId;

    @Column
    private String team;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column
    private String bats;

    @Column(name="games_played")
    private Integer gamesPlayed;

    @Column(name="plate_appearances")
    private Integer plateAppearances;

    @Column(name="team_games_played")
    private Integer teamGamesPlayed;

    @Column(name="app_per_game")
    private Float appPerGame;

    @Column(name="at_bats")
    private Integer atBats;

    @Column(name="batting_average")
    private Float battingAverage;

    @Column(name="on_base_plus_slugging")
    private Float onBasePlusSlugging;

    public OPSLeader() {

    }

    public OPSLeader(
            Integer id, String playerId, String team, String firstName, String lastName,
            String bats, Integer gamesPlayed, Integer plateAppearances, Integer teamGamesPlayed,
            Float appPerGame, Integer atBats, Float battingAverage, Float onBasePlusSlugging
    ) {
        this.id = id;
        this.playerId = playerId;
        this.team = team;
        this.firstName = firstName;
        this.lastName = lastName;
        this.bats = bats;
        this.gamesPlayed = gamesPlayed;
        this.plateAppearances = plateAppearances;
        this.teamGamesPlayed = teamGamesPlayed;
        this.appPerGame = appPerGame;
        this.atBats = atBats;
        this.battingAverage = battingAverage;
        this.onBasePlusSlugging = onBasePlusSlugging;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlayerId() {
        return playerId;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBats() {
        return bats;
    }

    public void setBats(String bats) {
        this.bats = bats;
    }

    public Integer getGamesPlayed() {
        return gamesPlayed;
    }

    public void setGamesPlayed(Integer gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    public Integer getPlateAppearances() {
        return plateAppearances;
    }

    public void setPlateAppearances(Integer plateAppearances) {
        this.plateAppearances = plateAppearances;
    }

    public Integer getTeamGamesPlayed() {
        return teamGamesPlayed;
    }

    public void setTeamGamesPlayed(Integer teamGamesPlayed) {
        this.teamGamesPlayed = teamGamesPlayed;
    }

    public Float getAppPerGame() {
        return appPerGame;
    }

    public void setAppPerGame(Float appPerGame) {
        this.appPerGame = appPerGame;
    }

    public Integer getAtBats() {
        return atBats;
    }

    public void setAtBats(Integer atBats) {
        this.atBats = atBats;
    }

    public Float getBattingAverage() {
        return battingAverage;
    }

    public void setBattingAverage(Float battingAverage) {
        this.battingAverage = battingAverage;
    }

    public Float getOnBasePlusSlugging() {
        return onBasePlusSlugging;
    }

    public void setOnBasePlusSlugging(Float onBasePlusSlugging) {
        this.onBasePlusSlugging = onBasePlusSlugging;
    }
}
