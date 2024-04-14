import Enums.Genre;
import Menus.Menu;
import Models.Album;
import Models.Artist;
import Models.Song;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main{
    public static void main(String[] args) {

        //region Lista de canciones
        List<Song> songs = new ArrayList<>();

        Artist queen = new Artist("Queen", 10, "British");
        Artist madona = new Artist("Madona", 65, "American");
        Artist becerra = new Artist("Maria Becerra", 22, "Argentinian");

        Album albumQueen = new Album(1975,"At night at the opera", queen);
        Album albumMadona = new Album(1984, "Like a Virgin", madona);
        Album albumBecerra = new Album(2023, "corazon vacio", becerra);
        Song song1 = new Song("Bohemian Rhapsody", 4, Genre.ROCK, albumQueen, queen);
        Song song2 = new Song("Material Girl", 4, Genre.POP, albumMadona, madona);
        Song song3 = new Song("Corazon vacio",3, Genre.TRAP, albumBecerra, becerra);

        songs.add(song1);
        songs.add(song2);
        songs.add(song3);

        Menu menu = new Menu();
        //endregion

        menu.menuGeneral();
    }
}
