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

    public int getCode_postal() {
        return code_postal;
    }

    public String getEmail() {
        return email;
    }

    public String getDate_inscription() {
        return date_inscription;
    }

    public String getN_rue() {
        return n_rue;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getRue() {
        return rue;
    }

    public String getSexe() {
        return sexe;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getVille() {
        return ville;
    }

    public void setCode_postal(int code_postal) {
        this.code_postal = code_postal;
    }

    public void setDate_inscription(String date_inscription) {
        this.date_inscription = date_inscription;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setN_rue(String n_rue) {
        this.n_rue = n_rue;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setVille(String ville) {
        this.ville = ville;
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
