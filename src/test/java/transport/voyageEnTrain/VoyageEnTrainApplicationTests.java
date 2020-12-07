package transport.voyageEnTrain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class VoyageEnTrainApplicationTests {

	Trains trains;
	SimpleDateFormat df;

	@BeforeAll
	void init(){
		trains = new Trains();
		df = new SimpleDateFormat("hh:mm dd/MM/yy");
	}

	@Test
	void listeDesGares(){
		ArrayList<String> gares = trains.listeDesGares();
		assertNotNull(gares);
	}
	
	@Test
	void chercheTrain(){
		String villeDeDepart = trains.listeDesGares().get(0);
		ArrayList<Train> listeTrains = trains.chercherParLieuDeDepart(villeDeDepart);
		assertNotNull(listeTrains);
		try {
			Date dateDepart = df.parse("23:59 01/01/2021");
			int i = 0;
			while(i<listeTrains.size() && listeTrains.get(i).getDateDeDepart().compareTo(dateDepart)!=0) {
				i++;
			}
			if(i == listeTrains.size()) {
				fail("Date départ non trouvée");
			}
		} catch (ParseException e) {
			fail("Erreur parsage date");
		}
	}
	
	

}
