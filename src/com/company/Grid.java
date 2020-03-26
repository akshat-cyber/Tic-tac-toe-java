package com.company;

import java.io.FileNotFoundException;

public class Grid {
    public static int [][] Grid_elements = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    public static void Display_Grid(int Number,int turn) throws FileNotFoundException {
       //screen(); for demo
       int [] val = new int[2];
        val = Number_Converter.convert(Number);
       int ValueForX =  val[0];
       int ValueForY = val[1];
       Record_entry.look(ValueForX,ValueForY);
       if(turn%2==0) {
           Grid_elements[ValueForX][ValueForY] = 1; // for player one
       }
       else if(turn%2!=0){
           Grid_elements[ValueForX][ValueForY] = 0;  // player two
       }
        System.out.println("\n\n");
           screen();
       System.out.println("\n\n");
    //   Check_winner.watch(new Grid()); // check the winner
        /// display

    }
  public static void screen(){
      for (int i = 0; i < 3; i++) {
          for (int j = 0; j < 3; j++) {
              if(i == 0){
                  System.out.println(Integer.toString(Grid_elements[0][j])+" | " + Integer.toString(Grid_elements[0][j+1])+" | "+Integer.toString(Grid_elements[0][j+2]));
                  break;
              }
              else if ( i == 1){
                  System.out.println("--"+"|" +"---"+"|" + "--");
                  System.out.println(Integer.toString(Grid_elements[1][j])+" | " + Integer.toString(Grid_elements[1][j+1])+" | "+Integer.toString(Grid_elements[1][j+2]));
                  break;
              }
              else if(i==2){
                  System.out.println("--"+"|" +"---"+"|" + "--");
                  System.out.println(Integer.toString(Grid_elements[2][j])+" | " + Integer.toString(Grid_elements[2][j+1])+" | "+Integer.toString(Grid_elements[2][j+2]));

                  break;
              }
          }
      }
  }


}