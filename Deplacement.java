package com.company;
import java.util.Scanner;


public class Deplacement {

    static public void deplacementJ1(char [] [] terrain, int x1, int y1){

int xb1, yb1;


char move;
Scanner sc = new Scanner(System.in);

// chercher le joueur B sur le terrain
        for (int a=0; a<11; a++){
            for (int i = 0; i<10; i++){
                if(terrain [i] [a] == 'B'){
                    x1 = i;
                    y1 = a;
                }

            }
        }

    //demande au joueur B ou il souhaite aller
    System.out.println("joueur B direction (z q s d) : ");
    move = sc.next().charAt(0);

    //enregistre la position avent le mouvement
    xb1 = x1;
    yb1 = y1;



    //Change les coordonées en foction de la touche envoyer par le joueur B
        if (move == 's' && y1 + 1 != 11) {
            y1 = y1 + 1;

        }

        if (move == 'z' && y1 - 1 != -1) {
            y1 = y1 - 1;
        }

        if (move == 'd' && x1 + 1 != 10) {
            x1 = x1 + 1;
        }

        if (move == 'q' && x1 - 1 != -1) {
            x1 = x1 - 1;
        }




        else {
            System.out.println("mouvement interdit joueur B");
        }


        //Indique quand l joueur B n'aura pas le droit de bouer
            if (terrain [x1] [y1] == 'x' || terrain [x1] [y1] == 'R'){
                x1 = xb1;
                y1 = yb1;
                System.out.println("mouvement interdit joueur B");
            }

        //Met les blocks sur le terrain à l'emplacement precedent
            else{
                terrain [xb1] [yb1] = 'x';
            }

    //Place le joueur B sur le terrain
    terrain [x1] [y1] = 'B';

        System.out.println(x1);
        System.out.println(y1);



    }
}