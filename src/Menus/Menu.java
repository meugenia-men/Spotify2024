package Menus;

import Models.PremiumList;

import java.util.Scanner;

public class Menu {

    public void menuGeneral() {

        int opc;

        do {
            System.out.println("<<<<<<<<<<<<<<< Menu Spotify >>>>>>>>>>>>>>>>");
            System.out.println("1) Plan Premium");
            System.out.println("2) Plan Basic");
            System.out.println("3) Salir");

            System.out.println("Elija la opcion deseada...");
            Scanner sc = new Scanner(System.in);
            opc = sc.nextInt();

            switch (opc) {
                case 1:
                    this.menuPremium();
                    break;
                case 2:
                    this.menuBasic();
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Ingrese una opcion correcta");
                    break;
            }
        } while (opc != 3);
    }

    public void menuPremium() {

        String opc;

        do {
            System.out.println("<<<<<<<<<<<<<<< Menu Spotify Premium >>>>>>>>>>>>>>>>");
            System.out.println("R) Reproducir");
            System.out.println("A) Añadir a la lista");
            System.out.println("E) Eliminar de la lista");
            System.out.println("L) Lista de canciones");
            System.out.println("P) Pausa");
            System.out.println("S) Salir");


            System.out.println("Elija la opcion deseada...");
            Scanner sc = new Scanner(System.in);
            opc = sc.nextLine();

            switch (opc) {
                case "R":
                   /// PremiumList premiumList = new PremiumList("Lista Premium",);
                    break;
                case "A":
                    break;
                case "E":
                    break;
                case "L":
                    break;
                case "P":
                    break;
                case "S":
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Ingrese una opcion correcta");
                    break;
            }
        } while (opc != "S");
    }

    public void menuBasic() {

        String opc;

        do {
            System.out.println("<<<<<<<<<<<<<<< Menu Spotify Basic >>>>>>>>>>>>>>>>");
            System.out.println("R) Reproducir");
            System.out.println("A) Añadir a la lista");
            System.out.println("E) Eliminar de la lista");
            System.out.println("L) Lista de canciones");
            System.out.println("P) Pausa");
            System.out.println("S) Salir");

            System.out.println("Elija la opcion deseada...");
            Scanner sc = new Scanner(System.in);
            opc = sc.nextLine();

            switch (opc) {
                case "R":
                    break;
                case "A":
                    break;
                case "E":
                    break;
                case "L":
                    break;
                case "P":
                    break;
                case "S":
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Ingrese una opcion correcta");
                    break;
            }
        } while (opc != "S");
    }
}
