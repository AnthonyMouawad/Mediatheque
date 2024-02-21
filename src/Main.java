public class Main {
    public static void main(String[] args) {

    Mediatheque mediatheque = new Mediatheque();
    Livre livre = new Livre();
    livre.setTitre("test");
    livre.setAuteur("Baudelaire");
    mediatheque.add(livre);
        System.out.println(livre);


    }
}