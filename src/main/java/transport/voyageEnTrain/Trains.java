package transport.voyageEnTrain;

import java.text.SimpleDateFormat;
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
			Train train = new Train(1, gares.get(0), gares.get(1), "23:59 01/01/2021", "10:18 02/01/2021");
			trains.add(train);
			train = new Train(2, gares.get(0), gares.get(1), "01:14 02/01/2021", "22:25 02/01/2021");
			trains.add(train);
			train = new Train(3, gares.get(1), gares.get(0), "14:10 03/01/2021", "17:18 03/01/2021");
			trains.add(train);
			train = new Train(4, gares.get(2), gares.get(3), "06:10 04/01/2021", "16:56 04/01/2021");
			trains.add(train);
			train = new Train(5, gares.get(2), gares.get(3), "11:15 05/01/2021", "23:56 05/01/2021");
			trains.add(train);
			train = new Train(6, gares.get(1), gares.get(2), "10:14 05/01/2021", "20:35 05/01/2021");
			trains.add(train);
			train = new Train(7, gares.get(1), gares.get(2), "05:35 06/01/2021", "13:15 06/01/2021");
			trains.add(train);
			train = new Train(8, gares.get(3), gares.get(0), "11:56 04/01/2021", "15:24 04/01/2021");
			trains.add(train);
		} catch (Exception e) {
			e.printStackTrace();
		}
    }

    public ArrayList<String> listeDesGares(){
        return gares;
    }

    /**
     * Retourne la liste des trains ayant pour gare de départ nomVille
     * @param nomVille
     * @return liste de gares
     * @throws Exception si nomVille est nulle
     */
    public ArrayList<Train> chercherTrainParLieuDeDepart(String nomVille) throws Exception{
    	if(nomVille == null) {
    		throw new Exception("nomVille ne doit pas etre null");
    	}
    	ArrayList<Train> listeTrains = new ArrayList<Train>();
    	for(Train train: trains) {
    		if(train.getLieuDeDepart().equals(nomVille)) {
    			listeTrains.add(train);
    		}
    	}
        return listeTrains;
    }

    /**
     * Retourne la liste des trains ayant pour gare d'arrivée nomVille
     * @param nomVille
     * @return liste de gares
     * @throws Exception si nomVille est nulle
     */
    public ArrayList<Train> chercherTrainParLieuDArrivee(String nomVille) throws Exception{
    	if(nomVille == null) {
    		throw new Exception("nomVille ne doit pas etre null");
    	}
    	ArrayList<Train> listeTrains = new ArrayList<Train>();
    	for(Train train: trains) {
    		if(train.getLieuDArrivee().equals(nomVille)) {
    			listeTrains.add(train);
    		}
    	}
        return listeTrains;
    }
    
    /**
     * Retourne la liste des trains ayant pour ville de départ nomVilleDeDepart, 
     * pour ville d'arrivée nomVilleArrivee, 
     * et qui partent après la date dateDeDepart
     * @param nomVilleDeDepart
     * @param nomVilleArrivee
     * @param dateDeDepart au format hh:mm jj/mm/aaaa, exemple: "23:59 01/01/2021")
     * @throws Exception si un des paramètres est nul
     * @return la liste des trains trouvées
     */
    public ArrayList<Train> chercherTrain(String nomVilleDeDepart, String nomVilleArrivee, String dateDeDepart) throws Exception{
    	
    	ArrayList<Train> trainsTrouves = new ArrayList<Train>();
    	
    	SimpleDateFormat df = new SimpleDateFormat("hh:mm dd/MM/yy");
		Date dateDep = df.parse(dateDeDepart);			// lance une exception si la date est au mauvais format
		
		Train train = trains.get(0);
		if(train.getDateDeDepart().compareTo(dateDep) < 0){
			trainsTrouves.add(train);
		}
		
    	return trains;
    }


}
