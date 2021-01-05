package transport.voyageEnTrain;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

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
	
	@Test
	void chercheTrain(){	
		try {
			String villeDeDepart = trains.listeDesGares().get(0);
			ArrayList<Train> listeTrains = trains.chercherTrainParLieuDeDepart(villeDeDepart);
			assertNotNull(listeTrains);
			SimpleDateFormat df = new SimpleDateFormat("hh:mm dd/MM/yy");
			Date dateDepart = df.parse("23:59 01/01/2021");
			int i = 0;
			while(i<listeTrains.size() && listeTrains.get(i).getDateDeDepart().compareTo(dateDepart)!=0) {
				i++;
			}
			if(i == listeTrains.size()) {
				fail("Date départ non trouvée");
			}
			Train train = listeTrains.get(i);
			Date date = train.getDateDArrivee();
			assertTrue(date.compareTo(df.parse("10:18 02/01/2021")) == 0);
			assertEquals(train.getLieuDeDepart(), "Ici c'est Paris");
			assertEquals(train.getLieuDArrivee(), "Marseille");
		} catch (Exception e) {
			fail("Erreur");
		}
	}
	
	@Test
	void ordreDesDates() {
		ArrayList<String> gares = trains.listeDesGares();
		assertNotNull(gares);
		ArrayList<Train> listeTrains;
		for(String gare: gares) {
			try {
				listeTrains = trains.chercherTrainParLieuDeDepart(gare);
				assertNotNull(listeTrains);
				for(Train train: listeTrains) {
					assertTrue(train.getDateDeDepart().compareTo(train.getDateDArrivee()) < 0);
				}
			} catch(Exception e) {
				fail("Gare null");
			}

		}	
	}
	
	@Test
	void garesParLieuDeDepart() {
		try {
			ArrayList<Train> listeTrains = trains.chercherTrainParLieuDeDepart("Ici c'est Paris");
			assertNotNull(listeTrains);
			for(Train train: listeTrains) {
				assertEquals(train.getLieuDeDepart(), "Ici c'est Paris");
			}
		} catch(Exception e){
			fail("Gare null");
		}
	}
	
	@Test
	void garesParLieuDArrivee() {
		try {
			ArrayList<Train> listeTrains = trains.chercherTrainParLieuDArrivee("Ici c'est Paris");
			assertNotNull(listeTrains);
			for(Train train: listeTrains) {
				assertEquals(train.getLieuDArrivee(), "Ici c'est Paris");
			}
		} catch(Exception e){
			fail("Gare null");
		}
	}
	
	@Test
	void gareDeDepartNulle() {
		try {
			trains.chercherTrainParLieuDeDepart(null);
			fail("Exception attendue");
		} catch(Exception e){
		}
	}
	
	@Test
	void gareDArriveeNulle() {
		try {
			trains.chercherTrainParLieuDArrivee(null);
			fail("Exception attendue");
		} catch(Exception e){
		}
	}
	
	@Test
	void test1() {
		try {
			ArrayList<Train> trainsTrouves = trains.chercherTrain("Ici c'est Paris", "Marseille", "23:50 01/01/2021");
			assertTrue(trainsTrouves.size() == 2);
			Train train = trainsTrouves.get(0);
			assertTrue(train.getNumero() == 1);
			train = trainsTrouves.get(1);
			assertTrue(train.getNumero() == 2);
		} catch(Exception e) {
			fail("Exception non attendue");
		}
	}

}
