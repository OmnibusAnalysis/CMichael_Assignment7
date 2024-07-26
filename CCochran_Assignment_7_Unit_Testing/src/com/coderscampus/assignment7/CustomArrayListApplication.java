package com.coderscampus.assignment7;

public class CustomArrayListApplication {

    public static void main(String[] args) {

    }

    private static void songBank() {
        String[] songsKnown = {"Master of Puppets", "Holy Wars", "Tornado of Souls", "The Great Southern Trendkill", "Cowboys From Hell",
                "Primal Cocncrete Sledge", "Battery", "The entire and justice for all album", "The Art of Shredding", "You never even called me by my name"};

        CustomArrayList<String> songs = new CustomArrayList<>();
        for (int i = 0; i < songsKnown.length; i++) {
            songs.add(songsKnown[i]);
        }

        for (int i = 0; i < songs.getSize(); i++) {
            System.out.println(songs.get(i));
        }
    }

    private static void numberOfSongs() {
        CustomArrayList<Integer> numberOfSongs = new CustomArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numberOfSongs.add(Integer.valueOf(i));
        }

        for (int i = 0; i < numberOfSongs.getSize(); i++) {
            System.out.println(numberOfSongs.get(i));
        }
    }

    private static void addMoreSongs() {
        CustomArrayList<Integer> addMoreSongs = new CustomArrayList<>();
        for (int i = 0; i < 20; i++) {
            addMoreSongs.add(i, Integer.valueOf(i));
        }

        addMoreSongs.add(9, 18);

        for (int i = 0; i < 20; i++) {
            System.out.println(addMoreSongs.get(i));
        }
    }

    private static void letsPlayWeddings() {
        CustomArrayList<Integer> playWeddings = new CustomArrayList<>();
        for (int i = 0; i < 20; i++) {
            playWeddings.add(i, Integer.valueOf(i));
        }

        playWeddings.add(1, 100);
        for (int i = 0; i < 20; i++) {
            System.out.println(playWeddings.get(i));
        }
    }

}
