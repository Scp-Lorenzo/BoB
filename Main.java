package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //déclaration des variables

        char [] [] terrain = new char [10] [11];

        int i;
        int a;
        int x1 = 5;
        int y1= 5;
        int x2 = 3;
        int y2 = 5;

        boolean def1 = false;
        boolean def2 = false;

        char move;
        Scanner sc = new Scanner(System.in);

        //initialisation du terrain
            for (a=0; a<11; a++){
              for (i = 0; i<10; i++) {
                terrain [i] [a] = 'O';
              }
            }

         //initialisation place personnages
        terrain [x1] [y1] = 'B';
        terrain [x2] [y2] = 'R';

        //affichage du terrain
        Affichage.afficheTableau(terrain);

do{

    Deplacement.deplacementJ1(terrain ,x1 ,y1);


    Affichage.afficheTableau(terrain);


    Deplacement2.deplacementJ2(terrain ,x2 ,y2);


    Affichage.afficheTableau(terrain);


    Victoire.victoir(terrain);

} while(def1 != true || def2 != true);
    }
}