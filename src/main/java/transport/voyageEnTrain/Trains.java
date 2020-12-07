package transport.voyageEnTrain;

import java.util.ArrayList;
import java.util.Date;

public class Trains {

    ArrayList<String> gares = new ArrayList<String>();

    public Trains(){
        gares.add("Ici c'est Paris");
        gares.add("Marseille");
        gares.add("Lille");
        gares.add("Lyon");
    }

    public ArrayList<String> listeDesGares(){
        return gares;
    }

    public ArrayList<Train> chercherParLieuDeDepart(String nomVille){
        return null;
    }

    public ArrayList<Train> chercherParLieuDArriveee(String nomVille){
        return null;
    }


}
