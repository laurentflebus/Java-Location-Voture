package mesclasses;
public class Location {
    private Voiture voiture;
    private Client client;
    private String dateDebut;
    private String dateFin;

    public Location(Voiture v, Client c,String dd, String df) {
        this.voiture = v;
        this.client = c;
        this.dateDebut = dd;
        this.dateFin = df;
    }
    // GETTERS & SETTERS
    public void setVoiture(Voiture voiture) {
        this.voiture = voiture;
    }

    public Voiture getVoiture() {
        return voiture;
    }

    public void setClient(Client client) {
        this.client = client;
    }
    public Client getClient() {
        return client;
    }
    public void setDateDebut(String dateDebut) {
        this.dateDebut = dateDebut;
    }
    public String getDateDebut() {
        return dateDebut;
    }
    public void setDateFin(String dateFin) {
        this.dateFin = dateFin;
    }
    public String getDateFin() {
        return dateFin;
    }
    @Override
    public String toString() {
        return "Nom: " + client.getNom()+ "\n" +
               "Prénom: " + client.getPrenom() + "\n" +
               "Numéro de chassis: " + voiture.getNumChassis() + "\n" + 
               "Immatriculation: " + voiture.getImmatriculation() + "\n"+
               "Couleur :" + voiture.getCouleur() + "\n";
    }
}
