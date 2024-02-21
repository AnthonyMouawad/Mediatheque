public class Document {

    private int id;

    private String titre;

    private boolean isAvailable = true;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return "Document{" +
                "id=" + id +
                ", titre='" + titre + '\'' +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
