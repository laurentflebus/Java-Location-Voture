package mesclasses;
public class Client {
    private String nom;
    private String prenom;
    private String rue;
    private String n_rue;
    private int code_postal;
    private String ville;
    private String telephone;
    private String email;
    private String sexe;
    private String date_inscription;

    public Client(String nom, String prenom, String rue, String n_rue, int code_postal, String ville, String telephone, String email, String sexe, String date_inscription) {
        this.nom = nom;
        this.prenom = prenom;
        this.rue = rue;
        this.n_rue = n_rue;
        this.code_postal = code_postal;
        this.ville = ville;
        this.telephone = telephone;
        this.email = email;
        this.sexe = sexe;
        this.date_inscription = date_inscription;
    }
    public void supprimer() {
        // supprimer en base de données
       //DELETE FROM Client WHERE date_inscription = this.date_inscription;
       
    }
    public void modifier(String nom, String prenom, String rue, String n_rue, int code_postal, String ville, String telephone, String email, String sexe, String date_inscription) {
        this.nom = nom;
        this.prenom = prenom;
        this.rue = rue;
        this.n_rue = n_rue;
        this.code_postal = code_postal;
        this.ville = ville;
        this.telephone = telephone;
        this.email = email;
        this.sexe = sexe;
        this.date_inscription = date_inscription;
    }
    @Override
    public String toString() {
        return "Nom : " + nom + "\n" + 
                "Prénom :  " + prenom + "\n" + 
                "Adresse : " + rue + " " + n_rue + ", " + code_postal + " " + ville + "\n" +
                "Téléphone : " + telephone + "\n" +
                "E-mail : " + email + "\n" +
                "Sexe : " + sexe + "\n" + 
                "Date d'inscription : " + date_inscription;
                
    } 
}
