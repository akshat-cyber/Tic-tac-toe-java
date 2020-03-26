package com.company;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
public static boolean runtime = true;
public static int iteration = 0;
    public static int turn = 1;
    public static void main(String[] args) throws FileNotFoundException {
	// write your code here

        while (runtime){
            iteration+=1;
            System.out.println("Iteration -->" + iteration);
            System.out.println("Player 1 turn");
            Scanner player1 = new Scanner(System.in);
            int pla1 = player1.nextInt();
            Grid.Display_Grid(pla1,turn);
            turn+=1;
            System.out.println("Player 2 turn");
            Scanner player2 = new Scanner(System.in);
            int pla2 = player2.nextInt();
            Grid.Display_Grid(pla2,turn);
            turn+=1;
            //runtime = false;
        }
    }
}
