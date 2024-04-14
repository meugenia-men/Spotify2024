package Models;

public class Album {
    private Integer year;
    private String tittle;
    private Artist artist;

    public Album() {
    }

    public Album(Integer year, String tittle, Artist artist) {
        this.year = year;
        this.tittle = tittle;
        this.artist = artist;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
