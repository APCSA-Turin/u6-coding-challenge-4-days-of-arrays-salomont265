package com.example.project;

public class Day3 {
      public static String[][] generateSnowflake(int size) { //you will be tested on this method
        String[][] grid = new String[size][size];
        int space = (size -3 )/2 +1;
        for(int i=0;i<size/2;i++){
          
          for(int j=0;j<size;j++){
          if((j== (size/2) - space) || (j== size/2) || (j==(size/2) +space)){
            grid[i][j] = "*";
            System.out.println(j==(size/2) -space );
            System.out.println(j==(size/2));
            System.out.println(j==(size/2) +space);
          }else{
            grid[i][j] = " ";
          }
        }
        space--;
       
    }
      for(int i=0;i<size;i++){
        grid[size/2][i] = "*";
      }
      int second = size/2 -1;
      for(int i=size/2 +1;i <size;i++){
        for(int j=0;j<size;j++){
          grid[i][j] = grid[second][j];
        }
        second--;
      }
    return grid;
  }

    // Prints the snowflake  will be useful if tests fail (you will not be tested on this method)
    public static void printSnowflake(String[][] snowflake) {
        for(int i=0;i<snowflake.length;i++){
          for(int j=0;j<snowflake.length;j++){
            System.out.print(snowflake[i][j]);
          }
          System.out.println( );
        }
    }

    // Test for the snowflake generation
    public static void main(String[] args) {
     printSnowflake(generateSnowflake(9));
    }
}
