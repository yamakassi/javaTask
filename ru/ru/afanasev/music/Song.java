package ru.afanasev.music;

public class Song {
    String name;
    String authors;
    Album albumSong;

    Song(String name) {
        this.name = name;
    }

    Song(String name, String... authors) {
        this.name = name;
        this.authors = "";
        for (String x : authors) {
            this.authors += "," + x;
        }
    }

    public Album getAlbumSong() {
        return albumSong;
    }

    public String getAuthors() {
        return authors;
    }

    public String getName() {
        return name;
    }

    public void addAlbum(Album albumSong) {
        if(this.albumSong != null) throw new IllegalArgumentException("данный трек уже относится к альбому"+ albumSong.getName());
        this.albumSong = albumSong;
        albumSong.addSong(this);
    }

    public String toString() {
        if (authors == null && albumSong.getAuthor() == null) return name + ", без автора ";
        return name + ",авторы: " + albumSong.getAuthor() + authors;
    }
}
