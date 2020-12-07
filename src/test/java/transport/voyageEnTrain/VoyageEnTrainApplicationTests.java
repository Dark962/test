package transport.voyageEnTrain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class VoyageEnTrainApplicationTests {

	Trains trains;

	@BeforeAll
	void init(){
		trains = new Trains();
	}

	@Test
	void listeDesGares(){
		ArrayList<String> gares = trains.listeDesGares();
		assertNotNull(gares);
	}

}
