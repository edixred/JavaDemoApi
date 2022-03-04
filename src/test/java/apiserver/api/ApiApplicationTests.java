package apiserver.api;

import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApiApplicationTests {

	@Test
	void contextLoads() {
		
		Controller service = new Controller(); 
		assertNull(service.wellcome().isEmpty());
	}

}
