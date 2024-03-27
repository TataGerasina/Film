public class Film {

    private final int id;
    private final String filmName; // название фильма
    private final String filmGenre; // жанр фильма
    private boolean premiereDate; //когда состоится премьера "премьера завтра"


    public Film(int id, String filmName, String filmGenre, boolean premiereDate) {

        this.id = id;
        this.filmName = filmName;
        this.filmGenre = filmGenre;
        this.premiereDate = premiereDate;
    }
}
