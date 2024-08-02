package com.cwdegidio.mlb_rest_server;

import com.cwdegidio.mlb_rest_server.conrollers.OPSLeaderController;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(properties = {"spring.datasource.url=jdbc:postgresql://66.228.48.112:8001/springboot_test_baseball"})
class MlbRestServerApplicationTests {

	@Autowired
	private OPSLeaderController opsLeaderController;

	@Test
	void contextLoads() throws Exception {
		assertThat(opsLeaderController).isNotNull();
	}
}
