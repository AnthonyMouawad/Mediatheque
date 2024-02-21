public class Adherent {

    private int idAdherent;
    private String prenom;
    private String nom;
    private String email;

    public int getIdAdherent() {
        return idAdherent;
    }

    public void setIdAdherent(int idAdherent) {
        this.idAdherent = idAdherent;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Adherent( int idAdherent, String prenom , String nom , String email){
        this.idAdherent = idAdherent;
        this.prenom = prenom;
        this.nom = nom;
        this.email = email;
    }
}
