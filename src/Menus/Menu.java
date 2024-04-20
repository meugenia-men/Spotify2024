package Menus;

import Models.BasicList;
import Models.PremiumList;
import Models.Song;

import java.util.*;


public class Menu {

    public void menuGeneral(List<Song> songs) {

        int opc;

        do {
            System.out.println("<<<<<<<<<<<<<<< Menu Spotify >>>>>>>>>>>>>>>>");
            System.out.println("1) Plan Premium");
            System.out.println("2) Plan Basic");
            System.out.println("3) Salir");

            System.out.println("Elija la opcion deseada...");
            Scanner sc = new Scanner(System.in);
            opc = sc.nextInt();
            sc.nextLine();

            switch (opc) {
                case 1:
                    this.menuPremium(songs);
                    break;
                case 2:
                    this.menuBasic(songs);
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Ingrese una opcion correcta");
                    sc.nextLine();
                    break;
            }
        } while (opc != 3);
    }

    public void menuPremium(List<Song> songs) {

        String opc;

        LinkedList<Song> songsList = new LinkedList<>();

        PremiumList premiumList = new PremiumList("MyPremiumList", songsList);


        do {
            System.out.println("<<<<<<<<<<<<<<< Menu Spotify Premium >>>>>>>>>>>>>>>>");
            System.out.println("R) Reproducir");
            System.out.println("A) Añadir a la lista");
            System.out.println("E) Eliminar de la lista");
            System.out.println("L) Lista de canciones");
            System.out.println("S) Salir");


            System.out.println("Elija la opcion deseada...");
            Scanner sc = new Scanner(System.in);
            opc = sc.nextLine();

            switch (opc) {
                case "R":
                    //region PLAY
                    String pausa = "x";
                    while (!pausa.equalsIgnoreCase("p")) {
                        if (premiumList.play() != null) {
                            System.out.println("Presione P cuando desee pausar la reproduccion");
                            pausa = sc.nextLine();
                        } else {
                            System.out.println("No selecciono una cancion correcta, Intente de nuevo");
                        }
                    }
                    //endregion
                    break;
                case "A":
                    //region CREAR LISTA
                    String addMore;
                    do {
                        System.out.println("_________________________________Creando lista de canciones______________________________________");
                        System.out.println("Ingrese la cancion que desea sumar a su lista: ");
                        String title = sc.nextLine();

                        Song selectSong = null;

                        for (Song song : songs) {
                            if (song.getName().equalsIgnoreCase(title)) {
                                selectSong = song;
                                premiumList.addSong(selectSong);
                                System.out.println("Cancion agregada a la lista con exito!");
                                sc.nextLine();
                            }
                        }
                        if (selectSong == null) {
                            System.out.println("La cancion ingresada no se encuentra en los registros");
                            sc.nextLine();
                        }
                        System.out.println("Desea seguir agregando canciones a su lista? si / no ");
                        addMore = sc.nextLine();

                    } while (addMore.equalsIgnoreCase("si"));
                    //endregion
                    break;
                case "E":
                    //region ELIMINAR CANCION DE LA LISTA
                    if (!premiumList.getMyPremiumList().isEmpty()) {
                        System.out.println("Ingrese la cancion que desea eliminar de su lista: ");
                        String title = sc.nextLine();
                        for (Song song : premiumList.getMyPremiumList()) {
                            if (song.getName().equalsIgnoreCase(title)) {
                                premiumList.getMyPremiumList().remove(song);
                                System.out.println("Cancion eliminada con exito!");
                                sc.nextLine();
                                break;
                            }
                        }
                    } else {
                        System.out.println("Aun no a creado lista de canciones. Por favor ir al menu A para añadir canciones a su lista!");
                    }
                    //endregion
                    break;
                case "L":
                    premiumList.showMyList();
                    break;
                case "S":
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Ingrese una opcion correcta");
                    break;
            }
        } while (!opc.equalsIgnoreCase("s"));
    }

    public void menuBasic(List<Song> songs) {

        String opc;
        Stack<Song> myBasicList = new Stack<>();
        BasicList basicList = new BasicList("Mi lista de canciones", myBasicList);

        do {
            System.out.println("<<<<<<<<<<<<<<< Menu Spotify Basic >>>>>>>>>>>>>>>>");
            System.out.println("R) Reproducir");
            System.out.println("A) Añadir a la lista");
            System.out.println("E) Eliminar de la lista");
            System.out.println("L) Lista de canciones");
            System.out.println("S) Salir");

            System.out.println("Elija la opcion deseada...");
            Scanner sc = new Scanner(System.in);
            opc = sc.nextLine();

            switch (opc) {
                case "R":
                    //region PLAY
                    System.out.println("_______________________Reproduciendo Lista_______________________");
                    System.out.println("Presione P cuando desee pausar la reproduccion");
                    String pausa = "x";
                    while (!pausa.equalsIgnoreCase("p")) {
                        if (basicList.play() != null) {
                            pausa = sc.nextLine();
                        }
                    }
                    //endregion
                    break;
                case "A":
                    //region CREAR LISTA
                    String addMore;
                    do {
                        System.out.println("_________________________________Creando lista de canciones______________________________________");
                        System.out.println("Ingrese la cancion que desea sumar a su lista: ");
                        String title = sc.nextLine();

                        for (Song song : songs) {
                            if (song.getName().equalsIgnoreCase(title)) {
                                myBasicList.push(song);
                                System.out.println("Cancion agregada a la lista con exito!");
                                sc.nextLine();
                            }
                        }
                        if (myBasicList.isEmpty()) {
                            System.out.println("La cancion ingresada no se encuentra en los registros");
                            sc.nextLine();
                        }
                        System.out.println("Desea seguir agregando canciones a su lista? si / no ");
                        addMore = sc.nextLine();

                    } while (addMore.equalsIgnoreCase("si"));
                    //endregion
                    break;
                case "E":
                    //region ELIMINAR CANCION
                    if (basicList.getMyBasicList().isEmpty()){
                        System.out.println("Su lista esta vacia");
                    } else {
                        basicList.deleteSong("xxx");
                    }
                    //endregion
                    break;
                case "L":
                    basicList.showMyList();
                    break;
                case "S":
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Ingrese una opcion correcta");
                    break;
            }
        } while (!opc.equalsIgnoreCase("S"));
    }

}
