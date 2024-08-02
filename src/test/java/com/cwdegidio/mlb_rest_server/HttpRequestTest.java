package com.cwdegidio.mlb_rest_server;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import static org.assertj.core.api.Assertions.assertThat;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, properties = {"spring.datasource.url=jdbc:postgresql://66.228.48.112:8001/springboot_test_baseball"})
public class HttpRequestTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void shouldReturnPlayers() throws Exception {
        assertThat(
                this.restTemplate.getForObject("http://localhost:" + port + "/ops_leaders", String.class)
        ).isNotEmpty();
    }

    @Test
    void shouldReturnOneEntity() throws Exception {
        assertThat(
                this.restTemplate.getForObject("http://localhost:" + port + "/ops_leaders/238", String.class)
        ).isNotEmpty();
    }

    @Test
    void shouldReturnNoEntity() throws Exception {
        assertThat(
                this.restTemplate.getForObject("http://localhost:" + port + "/ops_leaders/000", String.class)
        ).isNull();
    }
}
