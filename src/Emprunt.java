import java.time.LocalDate;

public class Emprunt {

    Document document;

    Adherent adherent;

    private LocalDate date;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Emprunt(Document document, Adherent adherent){
        this.document = document;
        this.adherent = adherent;
        this.date = LocalDate.of(1999,5, 12);
    }
}
