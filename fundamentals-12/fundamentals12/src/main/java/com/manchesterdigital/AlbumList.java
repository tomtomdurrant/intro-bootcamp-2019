package com.manchesterdigital;

import java.util.List;

public class AlbumList {
    public static void main(String[] args) {
        Albums album1 = new Albums("Slaves of the Shadow Realm");
        Albums album2 = new Albums("Assume Form");
        Albums album3 = new Albums("sdhgasui");
        Albums album4 = new Albums("agsfsg");

        List<Albums> albums = List.of(album1, album2, album3, album4);

        albums.stream()
                .filter(album -> album.getName().startsWith("A"))
                .forEach(System.out::println);
    }
}
