package Models;

import Interfaces.Reproduction;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class PremiumList implements Reproduction {
    private String name;
    private LinkedList<Song> myPremiumList;

    public PremiumList(String name, LinkedList<Song> myPremiumList) {
        this.name = name;
        this.myPremiumList = myPremiumList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LinkedList<Song> getMyPremiumList() {
        return myPremiumList;
    }

    public void setMyPremiumList(LinkedList<Song> myPremiumList) {
        this.myPremiumList = myPremiumList;
    }

    @Override
    public Song play() {
        this.showMyList();

        System.out.println("Ingrese el titulo de la cancion que desea seleccionar : ");
        Scanner sc = new Scanner(System.in);
        String selection = sc.nextLine();

        return this.searchSong(selection);
    }

    @Override
    public void addSong(Song song) {
        myPremiumList.add(song);
    }

    @Override
    public void deleteSong(String title) {
        this.myPremiumList.remove(this.searchSong(title));
    }

    @Override
    public void showMyList() {
        int cont = 1;
        System.out.println("<<<<<<<<<<<<<<<<" + name + ">>>>>>>>>>>>>>>>>>>>>>");
        for (Song song : myPremiumList) {
            System.out.println("Cancion " + cont + " - " + song.toString());
            cont++;
        }
    }

    @Override
    public String toString() {
        return "PremiumList{" +
                "name='" + name + '\'' +
                ", myPremiumList=" + myPremiumList +
                '}';
    }

    public Song searchSong(String title) {
        for (Song x : myPremiumList) {
            if (myPremiumList != null && x.getName().equalsIgnoreCase(title)) {
                return x;
            }
        }
        return null;
    }
}
