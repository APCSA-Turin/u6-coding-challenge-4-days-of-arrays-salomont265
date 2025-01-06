package com.example.project;
import java.util.Random;

public class Day4 {
    
    private static String[] reindeer_names = {"Dasher", "Dancer", "Prancer", "Vixen", "Comet", "Cupid", "Donner", "Blitzen"};
    public static class Reindeer { // you must have at least a name, distance travelled, speed, run duration, and rest duration attribute

        private int distance;
        private int speed;
        private int runDuration;
        private int restDuration;
        private int time;
        private String name;
        // Constructor 
        public Reindeer(String name, int speed, int runDuration, int restDuration) {
            distance = 0;
            time = 0;
            this.speed = speed;
            this.runDuration = runDuration;
            this.restDuration = restDuration;
            this.name = name;
        }

        public int getDistanceTraveled(){ // this method is required
            return distance;
        }

        public String getName(){
            return name;
        }
        

        public void simulateSecond(){ //this method is required but not tested
            time++;
            if(time<=runDuration){
                distance += speed;
            }
            if(time== runDuration+restDuration){
                time =0;
            }
        }

    }

    public static String simulateRace(int time, Reindeer[] reindeers){ //you will be tested on this method
        int max = 0;
        String maxName = "";
        String name = "";
        int distance = 0;
        for(int i=0;i<reindeers.length;i++){
            for(int j=0;j<time;j++){
            reindeers[i].simulateSecond();
             distance = reindeers[i].getDistanceTraveled();
             name = reindeers[i].getName();
            }
            if(distance>max){
                max = distance;
                maxName = name;
            }
        }
        return maxName;
    }

    
    public static void main(String[] args) { // for testing purposed

    }

 
}



