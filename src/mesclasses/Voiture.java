package mesclasses;
public class Voiture {
    private String numChassis;
    private String immatriculation;
    private String couleur;

    public Voiture(String numChasis, String immatriculation, String couleur) {
        this.numChassis = numChasis;
        this.immatriculation = immatriculation;
        this.couleur = couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public String getCouleur() {
        return couleur;
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    public String getNumChassis() {
        return numChassis;
    }

    public void setNumChassis(String numChassis) {
        this.numChassis = numChassis;
    }
    
    
    
    public void supprimer() {
        // supprimer en base de données
       //DELETE FROM Voiture WHERE num_chassis = num_chassis;
       
    }
    
    @Override
    public String toString() {
        return numChassis + "\n" +
               immatriculation + "\n" +
               couleur + "\n";
    }
    
}
