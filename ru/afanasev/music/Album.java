package ru.afanasev.music;


import java.util.ArrayList;

public class Album {
    String name;
    String author;
    ArrayList<Song> songs = new ArrayList<>();

    Album(String name, String author, Song... songs) {
        this.name = name;
        this.author = author;
        for (Song song : songs) this.songs.add(song);
    }

    public void addSong(Song song) {
        if (song.albumSong != null) throw new IllegalArgumentException("Песня относится к другому альбому ");
        for(Song s:songs){
            if(s==song) throw new IllegalArgumentException("Данный трек уже есть в альбоме");
        }
        this.songs.add(song);
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public String toString() {
        String str = "";
        for (Song song : songs) str += song.getName() + ", ";
        return "альбом:" + name + " автор:" + author + "; Песни: " + str;
    }
}
