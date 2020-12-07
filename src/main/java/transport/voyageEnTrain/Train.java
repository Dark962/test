package transport.voyageEnTrain;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Train {
	
	String lieuDeDepart;
	String lieuDArrivee;
	Date dateDeDepart;
	Date dateDArrivee;
	
	public Train(String lieuDeDepart, String lieuDArrivee, String dateDeDepart, String dateDArrivee) throws Exception {
		super();
		this.lieuDeDepart = lieuDeDepart;
		this.lieuDArrivee = lieuDArrivee;
		SimpleDateFormat df = new SimpleDateFormat("hh:mm dd/MM/yy");
		this.dateDeDepart = df.parse(dateDeDepart);
		this.dateDArrivee = df.parse(dateDArrivee);
	}

	public String getLieuDeDepart() {
		return lieuDeDepart;
	}
	
	public void setLieuDeDepart(String lieuDeDepart) {
		this.lieuDeDepart = lieuDeDepart;
	}
	
	public String getLieuDArrivee() {
		return lieuDArrivee;
	}
	
	public void setLieuDArrivee(String lieuDArrivee) {
		this.lieuDArrivee = lieuDArrivee;
	}
	
	public Date getDateDeDepart() {
		return dateDeDepart;
	}
	
	public void setDateDeDepart(Date dateDeDepart) {
		this.dateDeDepart = dateDeDepart;
	}
	
	public Date getDateDArrivee() {
		return dateDArrivee;
	}
	
	public void setDateDArrivee(Date dateDArrivee) {
		this.dateDArrivee = dateDArrivee;
	}
	
	
}
