package com.company;
import java.util.Scanner;


public class Deplacement2 {

    static public void deplacementJ2(char [] [] terrain, int x2, int y2){

int xb2, yb2;


char move;
Scanner sc = new Scanner(System.in);

// chercher le joueur B sur le terrain
        for (int a=0; a<11; a++){
            for (int i = 0; i<10; i++){
                if(terrain [i] [a] == 'R'){
                    x2 = i;
                    y2 = a;
                }

            }
        }




    //demande au joueur R ou il souhaite aller
    System.out.println("joueur R direction (z q s d) : ");
    move = sc.next().charAt(0);

    //enregistre la position avent le mouvement
    xb2 = x2;
    yb2 = y2;


        //Change les coordonées en foction de la touche envoyer par le joueur B
        if (move == 's' && y2 + 1 != 11) {
            y2 = y2 + 1;

        }

        if (move == 'z' && y2 - 1 != -1) {
            y2 = y2 - 1;
        }

        if (move == 'd' && x2 + 1 != 11) {
            x2 = x2 + 1;
        }

        if (move == 'q' && x2 - 1 != -1) {
            x2 = x2 - 1;
        }
        else {
            System.out.println("mouvement interdit joueur R");
        }


        //Indique quand l joueur B n'aura pas le droit de bouer
            if (terrain [x2] [y2] == 'x' || terrain [x2] [y2] == 'B'){
                x2 = xb2;
                y2 = yb2;
                System.out.println("mouvement interdit joueur R");
            }

            //Met les blocks sur le terrain à l'emplacement precedent
            else{
                terrain [xb2] [yb2] = 'x';
            }


   //Place le joueur B sur le terrain
    terrain [x2] [y2] = 'R';



    }
}