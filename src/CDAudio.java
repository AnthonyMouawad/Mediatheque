public class CDAudio extends Document{
    private  String interprete;
    private  String compositeur;

    public String getInterprete() {
        return interprete;
    }

    public void setInterprete(String interprete) {
        this.interprete = interprete;
    }

    public String getCompositeur() {
        return compositeur;
    }

    public void setCompositeur(String compositeur) {
        this.compositeur = compositeur;
    }

    @Override
    public String toString() {
        return "CDAudio{" +
                "interprete='" + interprete + '\'' +
                ", compositeur='" + compositeur + '\'' +
                '}';
    }
}
