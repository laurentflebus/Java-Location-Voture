package mesclasses;
public class Voiture {
    private String num_chassis;
    private String immatriculation;
    private String couleur;

    public Voiture(String num_chasis, String immatriculation, String couleur) {
        this.num_chassis = num_chasis;
        this.immatriculation = immatriculation;
        this.couleur = couleur;
    }
    
    public void modifier(String num_chasis, String immatriculation, String couleur) {
        this.num_chassis = num_chasis;
        this.immatriculation = immatriculation;
        this.couleur = couleur;
    }
    
    public void supprimer() {
        // supprimer en base de données
       //DELETE FROM Voiture WHERE num_chassis = num_chassis;
       
    }
    
    @Override
    public String toString() {
        return num_chassis + "\n" +
               immatriculation + "\n" +
               couleur + "\n";
    }
    
}
