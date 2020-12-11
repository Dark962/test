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
			train = new Train(gares.get(0), gares.get(1), "01:14 02/01/2021", "22:25 02/01/2021");
			trains.add(train);
			train = new Train(gares.get(1), gares.get(0), "14:10 03/01/2021", "17:18 03/01/2021");
			trains.add(train);
			train = new Train(gares.get(2), gares.get(3), "06:10 04/01/2021", "16:56 04/01/2021");
			trains.add(train);
			train = new Train(gares.get(2), gares.get(3), "11:15 05/01/2021", "23:56 05/01/2021");
			trains.add(train);
			train = new Train(gares.get(1), gares.get(2), "10:14 05/01/2021", "20:35 05/01/2021");
			trains.add(train);
			train = new Train(gares.get(1), gares.get(2), "05:35 06/01/2021", "13:15 06/01/2021");
			trains.add(train);
			train = new Train(gares.get(3), gares.get(0), "11:56 04/01/2021", "15:24 04/01/2021");
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
