package com.manchesterdigital;

import java.util.*;

public class Scratch {
    public static void main(String[] args) {
        Artist adele = new Artist("Adele", 9_000_000L);
        Artist prince = new Artist("Prince", 20_000_000L);
        List<Artist> artists = Arrays.asList(
                adele,
                prince
        );

        for (Artist artist : artists) {
            System.out.println("artist = " + artist);
        }

        Map<Long, Artist> artistMap = new HashMap<>();
        artistMap.put(1L, adele);
        artistMap.put(2L, prince);

        for (Map.Entry<Long, Artist> entry : artistMap.entrySet()) {
            System.out.println("entry.getKey() = " + entry.getKey());
            System.out.println("entry.getValue() = " + entry.getValue());
        }

        //Iterate over keys
        for (Long key :
                artistMap.keySet()) {
            if (artistMap.containsKey(key)) {
                System.out.println("key = " + key + "exists");
            }
        }

        //To iterate over values, returns collection
        for (Artist artist :
                artistMap.values()) {
            System.out.println("artist = " + artist);
        }
        //Sets - to enable the values to become unique
        Set<Artist> artistSet = new HashSet<>(artistMap.values());

        //Iterate over unique values from artists
        for (Artist artist :
                artistSet) {
            System.out.println("artist = " + artist);
        }

        //Immutability
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        for (Integer ignored :
                numbers) {
            System.out.println("ignored = " + ignored);;
        }

        Set<Long> distances = Set.of(1L, 2L, 3L, 4L);
        for (Long ignored :
                distances) {
            System.out.println("ignored = " + ignored);
        }

        //Able to create an immutable map with preset values
        Map<Long, String> namesMap = Map.of(1L, "John", 2L, "April");

        for (Map.Entry<Long, String> nameEntry :
                namesMap.entrySet()
        ) {
            System.out.println("nameEntry = " + nameEntry);
        }
        List<Artist> allArtists = List.of(adele, prince);
        for (Artist n :
                allArtists) {
            System.out.println("n = " + n.getName());
        }
        allArtists.forEach(artist -> System.out.println("artist = " + artist.getName()));

        //As system.out returns a void you cannot call a getter on it. 
        allArtists.forEach(System.out::println);

    }
}
