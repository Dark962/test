package transport.voyageEnTrain;

import java.util.ArrayList;
import java.util.Date;

public class Trains {

    ArrayList<String> gares = new ArrayList<String>();
    ArrayList<Train> trains = new ArrayList<Train>();

    public Trains(){
        gares.add("Ici c'est Paris");
        gares.add("Marseille");
        gares.add("Lille");
        gares.add("Lyon");
        
        try {
			Train train = new Train(gares.get(0), gares.get(1), "23:59 01/01/2021", "10:18 02/01/2021");
			trains.add(train);
		} catch (Exception e) {
			e.printStackTrace();
		}
    }

    public ArrayList<String> listeDesGares(){
        return gares;
    }

    public ArrayList<Train> chercherParLieuDeDepart(String nomVille){
        return trains;
    }

    public ArrayList<Train> chercherParLieuDArriveee(String nomVille){
        return trains;
    }


}
