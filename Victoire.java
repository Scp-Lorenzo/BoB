package com.company;

public class Victoire {

    static public void victoir(char[][] terrain) {

int x1 = 0;
int y1 = 0;
int x2 = 0;
int y2 = 0;

int [] coorXx = new int [50];
int [] coorXy = new int [50];

int z = 0;

        for (int a = 0; a < 11; a++) {
            for (int i = 0; i < 10; i++) {
                if (terrain[i][a] == 'B') {
                    x1 = i;
                    y1 = a;
                }

                if (terrain[i][a] == 'R') {
                    x2 = i;
                    y2 = a;
                }

                if(terrain[i][a] == 'x'){
                    coorXx [z] = i;
                    coorXy [z] = a;
                    z++;
                }
            }
        }

        for (int a = 0; a >= z; a++) {
           if(coorXx [a] == x1 + 1 && coorXx [a] == x1 - 1 && coorXy [a] == y1 + 1 && coorXy [a] == y1 - 1){
               System.out.println("le joueur R a gagner");
           }

           else if(x1 == 0 && coorXx [a] == x1 + 1 && coorXy [a] == y1 + 1 && coorXy [a] == y1 - 1){
               System.out.println("le joueur R a gagner");
           }

           else if(x1 == 9 && coorXx [a] == x1 - 1 && coorXy [a] == y1 + 1 && coorXy [a] == y1 - 1){
                System.out.println("le joueur R a gagner");
           }

           else if(y1 == 0 && coorXx [a] == x1 + 1 && coorXy [a] == y1 + 1 && coorXy [a] == x1 - 1){
               System.out.println("le joueur R a gagner");
           }

           else if(y1 == 10 && coorXx [a] == x1 + 1 && coorXy [a] == y1 - 1 && coorXy [a] == x1 - 1){
                System.out.println("le joueur R a gagner");
           }
           else {
               System.out.println("je me suis tromp dans lalg");
           }
        }

        for (int a = 0; a >= z; a++) {
            if(coorXx [a] == x2 + 1 && coorXx [a] == x2 - 1 && coorXy [a] == y2 + 1 && coorXy [a] == y2 - 1){
                System.out.println("le joueur B a gagner");
            }

            if(x2 == 0 && coorXx [a] == x2 + 1 && coorXy [a] == y2 + 1 && coorXy [a] == y2 - 1){
                System.out.println("le joueur B a gagner");
            }

            if(x2 == 9 && coorXx [a] == x2 - 1 && coorXy [a] == y2 + 1 && coorXy [a] == y2 - 1){
                System.out.println("le joueur B a gagner");
            }

            if(y2 == 0 && coorXx [a] == x2 + 1 && coorXy [a] == y2 + 1 && coorXy [a] == x2 - 1){
                System.out.println("le joueur B a gagner");
            }

            if(y2 == 10 && coorXx [a] == x2 + 1 && coorXy [a] == y2 - 1 && coorXy [a] == x2 - 1){
                System.out.println("le joueur B a gagner");
            }
        }
    }
}
