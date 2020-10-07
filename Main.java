package com.company;

public class Main {

    public static void main(String[] args) {

        int i = 0;
        int a = 0;
        char [] [] terrain = new char [10] [11];


        for (a=0; a<11; a++){
            for (i = 0; i<10; i++) {
                terrain [i] [a] = 'O';

            }
            i=0;
            }
        terrain [5] [5] = 'B';
        terrain [3] [5] = 'R';


for (a=0; a<11; a++){
    for (i = 0; i<10; i++){
        System.out.print("\t"+terrain [i] [a] +" ");

    }
    System.out.println("");
    i=0;
}

terrain [5] [5] = 1;

    }
}
