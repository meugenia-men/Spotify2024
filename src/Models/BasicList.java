package Models;

import Interfaces.Reproduction;

import java.util.List;
import java.util.Stack;

public class BasicList implements Reproduction {
    private String name;
    private Stack<Song> myBasicList;

    public BasicList(String name, Stack<Song> myBasicList) {
        this.name = name;
        this.myBasicList = myBasicList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Stack<Song> getMyBasicList() {
        return myBasicList;
    }

    public void setMyBasicList(Stack<Song> myBasicList) {
        this.myBasicList = myBasicList;
    }

    @Override
    public Song play() {
        Stack<Song> aux = new Stack<>();
        while (!myBasicList.empty()) {
            aux.push(this.myBasicList.pop());
        }
        Song firstSong = aux.pop();
        while (!aux.empty()) {
            myBasicList.push(aux.pop());
        }
        myBasicList.push(firstSong);

        System.out.println("------------> " + myBasicList.peek() + " Reproduciendo...");
        System.out.println("__________________________________________________________________________");

        return myBasicList.peek();
    }

    @Override
    public void addSong(Song song) {
        myBasicList.push(song);
    }

    @Override
    public void deleteSong(String title) {
        System.out.println("Para acceder a estas opciones, compre el paquete PREMIUM");
    }

    @Override
    public void showMyList() {
        int cont = 1;
        System.out.println("<<<<<<<<<<<<<<<<" + name + ">>>>>>>>>>>>>>>>>>>>>>");
        for (Song song : myBasicList) {
            System.out.println("Cancion " + cont + " - " + song.getName());
            cont++;
        }
    }

    @Override
    public String toString() {
        return "Mi Lista " +
                "Cancion = '" + name + '\'' +
                ", myBasicList=" + myBasicList +
                '}';
    }
}
