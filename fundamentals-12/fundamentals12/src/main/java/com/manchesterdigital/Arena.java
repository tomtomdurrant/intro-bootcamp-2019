package com.manchesterdigital;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Arena {
    public static void main(String[] args) {
        Artist arianaGrande = new Artist("Ariana Grande",
                List.of(new Members("Ariana Grande")),
                    "London");
        Artist beatles = new Artist("Beatles",
                List.of(new Members("John Lennon"),
                        new Members("Paul McCartney"),
                        new Members("Ringo Starr"),
                        new Members("George Harrison")),
                        "Liverpool");
        Artist coldplay = new Artist("Coldplay",
                List.of(new Members("Chris Martin"),
                        new Members("Guy Berryman"),
                        new Members("Will Champion"),
                        new Members("Phil Harvey")),
                "London");

        List<Artist> artists = List.of(arianaGrande, beatles, coldplay);
        long countFromLiverpool = 0;

        for (Artist artist :
                artists) {
            if (artist.isFrom("Liverpool")) {
                countFromLiverpool++;
            }
        }

        System.out.println("countFromLiverpool = " + countFromLiverpool);

        Long numberOfArtistsFromLiverpoolWhereGroupSizeIsGreaterThan2 = artists.stream()
                .filter(artist -> artist.isFrom("Liverpool"))
                .filter(artist -> artist.getMembersList().size() > 2)
                .count();

        System.out.println("numberOfArtistsFromLiverpoolWhereGroupSizeIsGreaterThan2 = " +
                numberOfArtistsFromLiverpoolWhereGroupSizeIsGreaterThan2);

        //Stream of strings, being specific about what the stream contains
        String result = Stream.of("A", "80", "C")
                .filter(s -> s.equalsIgnoreCase("a"))
                .findAny()
                .orElse(null);

        System.out.println("result = " + result);

        //Gathering matched criteria to be used somewhere else
        List<Artist> londonArtists = artists.stream()
                .filter(artist -> artist.isFrom("London"))
                .collect(Collectors.toList());

        //Extracting all artists who reside in London and then prints them
        londonArtists.stream()
                .map(Artist::getName)
                .forEach(System.out::println);

        // Creates a flat map of the members so you have a list of all members of all artists
        List<Members> artistMembers = artists.stream()
                .map(Artist::getMembersList)
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

        System.out.println("artistMembers = " + artistMembers);

        //Sorting - this is trying to sort through an immutable list.
//        Collections.sort(artists, new Comparator<Artist>() {
//                    @Override
//                    public int compare(Artist o1, Artist o2) {
//                        return o1.getName().compareTo(o2.getName());
//                    }
//                }
//        );
        Set<Artist> uniqueArtists = new HashSet<>(artists);

        Stream<Artist> sortedUniqueArtists = uniqueArtists.stream()
                .sorted(Comparator.comparing(Artist::getName));
        System.out.println("sortedUniqueArtists = " + sortedUniqueArtists);



    }

}
