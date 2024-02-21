import java.util.ArrayList;

public class Mediatheque{


    ArrayList<Document> arrayList = new ArrayList<>();
    ArrayList<Adherent> adherent = new ArrayList<>();

    ArrayList<Document> emprunts =  new ArrayList<>();

    int compteurId;
    public void add(Document d){
        compteurId++;
        d.setId(compteurId);
        arrayList.add(d);


    }

    public Document recherche (String titre){
        for (Document document : arrayList){
            if(document.getTitre().equals(titre)){
                return document;
            }
        }
        return null;

    }

    public void addAdherent(Adherent a){
        compteurId++;
        a.setIdAdherent(compteurId);
        adherent.add(a);
    }

    public void emprunt(Adherent adherent ,Document document){
        if(document.isAvailable()){
            document.setAvailable(false);
            emprunts.add(document);
        }
        else{
            System.out.println(document + "est déjà emprunté");
        }
    }
}




