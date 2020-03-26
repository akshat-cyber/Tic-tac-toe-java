package com.company;

public class Check_winner {
    public static void watch(Grid d){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if((i == 0 || i == 2 || i == 1) && d.Grid_elements[i][j] == 0 ){
                    System.out.println("Player 2 won!!!!");
                }
                else if((j == 0 || j == 2 || j == 1) && d.Grid_elements[i][j] == 1){
                    System.out.println("Player 1 won!!!!");
                }
                // cross pending
            }
        }
    }
}
