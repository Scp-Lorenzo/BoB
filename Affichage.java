package com.company;

public class Affichage {

    static public void afficheTableau (char[][] terrain) {

        int a;
        int i;

        for (a=0; a<11; a++){
            for (i = 0; i<10; i++){
                System.out.print("\t"+terrain [i] [a] +" ");

            }
            System.out.println();
        }

    }
}
