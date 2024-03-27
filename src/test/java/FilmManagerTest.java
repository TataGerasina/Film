import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {

    Film film1 = new Film(1, "Бладшот", "боевик", false);
    Film film2 = new Film(2, "Вперёд", "мультфильм",false);
    Film film3 = new Film(3, "Отель Белград", "комедия",false);
    Film film4 = new Film(4, "Джентельмены", "боевик",false);
    Film film5 = new Film(5, "Человек-невидимка", "ужасы",false);
    Film film6 = new Film(6,"Тролли. Мировой тур", "мультфильм",true);
    Film film7 = new Film(7, "Номер один", "комедия", true);


    @Test
    public void setFilm0() {
        FilmManager manager = new FilmManager();

        String[] expected = {};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void setFilm1() {
        FilmManager manager = new FilmManager();

        manager.add("Бладшот");
        String[] expected = {"Бладшот"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void setFilm1234() {

        FilmManager manager = new FilmManager();
        manager.add("Бладшот");
        manager.add("Вперёд");
        manager.add("Отель Белград");
        manager.add("Джентельмены");



        String[] expected = {"Бладшот", "Вперёд", "Отель Белград", "Джентельмены"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void setFilm4321() {
        FilmManager manager = new FilmManager();

        manager.add("Бладшот");
        manager.add("Вперёд");
        manager.add("Отель Белград");
        manager.add("Джентельмены");

        String[] expected = {"Джентельмены", "Отель Белград", "Вперёд", "Бладшот"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void setFilmAllMax() {
        FilmManager manager = new FilmManager(7);

        manager.add("Бладшот");
        manager.add("Вперёд");
        manager.add("Отель Белград");
        manager.add("Джентельмены");
        manager.add("Человек-невидимка");
        manager.add("Тролли. Мировой тур");
        manager.add("Номер один");

        String[] expected = { "Бладшот", "Вперёд", "Отель Белград","Джентельмены","Человек-невидимка", "Тролли. Мировой тур", "Номер один"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void setFilmChangeOrder() {
        FilmManager manager = new FilmManager();

        manager.add("Джентельмены");
        manager.add("Бладшот");
        manager.add("Вперёд");
        manager.add("Отель Белград");
        manager.add("Человек-невидимка");
        manager.add("Тролли. Мировой тур");

        String[] expected = { "Джентельмены","Бладшот", "Вперёд", "Отель Белград","Человек-невидимка","Тролли. Мировой тур"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void setFilm7654321() {
        FilmManager manager = new FilmManager(7);

        manager.add("Бладшот");
        manager.add("Вперёд");
        manager.add("Отель Белград");
        manager.add("Джентельмены");
        manager.add("Человек-невидимка");
        manager.add("Тролли. Мировой тур");
        manager.add("Номер один");

        String[] expected = { "Номер один", "Тролли. Мировой тур", "Человек-невидимка", "Джентельмены", "Отель Белград", "Вперёд","Бладшот"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
