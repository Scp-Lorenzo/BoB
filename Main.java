package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        char [] [] terrain = new char [10] [11];
        int i = 0;
        int a = 0;
        int x1 = 5;
        int y1= 5;
        int x2 = 3;
        int y2 = 5;
        int xb1, yb1, xb2, yb2;


        char move;
        Scanner sc = new Scanner(System.in);

        for (a=0; a<11; a++){
            for (i = 0; i<10; i++) {
                terrain [i] [a] = 'O';

            }
            i=0;
            }

        terrain [x1] [y1] = 'B';
        terrain [x2] [y2] = 'R';

do{


for (a=0; a<11; a++){
    for (i = 0; i<10; i++){
        System.out.print("\t"+terrain [i] [a] +" ");

    }
    System.out.println("");
    i=0;
}
xb1 = x1;
yb1 = y1;


System.out.println("joueur 1 direction (z q s d) : ");
move = sc.next().charAt(0);


if (move == 's'){
    y1 = y1 + 1;
    }

if (move == 'z'){
        y1 = y1 - 1;
    }

if (move == 'd'){
    x1 = x1 + 1;
    }

if (move == 'q'){
    x1 = x1 - 1;
    }
xb2 = x2;
yb2 = y2;

    System.out.println("joueur 2 direction (z q s d) : ");
    move = sc.next().charAt(0);


    if (move == 's'){
        y2 = y2 + 1;
    }

    if (move == 'z'){
        y2 = y2 - 1;
    }

    if (move == 'd'){
        x2 = x2 + 1;
    }

    if (move == 'q'){
        x2 = x2 - 1;
    }

    terrain [x1] [y1] = 'B';
    terrain [x2] [y2] = 'R';
    terrain [xb1] [yb1] = 'x';
    terrain [xb2] [yb2] ='x';
}
while(a != i);

    }
}


