package com.dominguez.exercise4;
//Bryan Dominguez
//February 8th, 2018
import java.util.*;

public class Main {
    static String[] add(String[] toDos, String newCity)
    {
        String[] newTodos = new String[toDos.length + 1];
        for (int i = 0; i < toDos.length; i++) {
            newTodos[i] = toDos[i];
        }
        newTodos[(newTodos.length - 1)] = newCity;
        return newTodos;
    }
    public static void main(String[] args) {
        List completeList = new ArrayList();
        List cities = new ArrayList();
        List<String> toDos = new ArrayList<String>();
        List<Double> avgTemp = new ArrayList();
        double i = 0, temp, avg = 0;
        Scanner scanner = new Scanner(System.in);
        String newCity = "";
        int city = 0;
        while (0==0) {
            System.out.println("Enter a city name, if you're done type END.");
            newCity = scanner.nextLine();
            newCity.trim();
            if (newCity.equals("END")){
                break;
            }else{
                if(newCity.equals("")){

                }
                else{
                    toDos.add(newCity);
                    completeList.add(newCity);
                }
            }

        }

        while (city < toDos.size()) {
            collectTemps(avgTemp, toDos, city);
            completeList.add(avgTemp);
            city++;
            avg = calculateAvg(avgTemp);
            completeList.add(avg);
            avgTemp = new ArrayList();
        }
        printAvg(city, completeList);
    }
        public static List collectTemps(List avgTemp, List cities, int city){
            double temp;
            int i =0;
            String option;
            while(i<5){
                Scanner transform = new Scanner(System.in);
                
                try{
                    System.out.println("Give a temperature for " + (i+1) + " in the city " + cities.get(city));
                    temp = transform.nextDouble();
                    avgTemp.add(temp);
                    i++;
                }
                catch (InputMismatchException ex){
                    System.out.println("Type in an actual number this time. Push enter to continue.");
                    option = transform.nextLine();
                }
            }
            return avgTemp;
        }
        
        public static double calculateAvg(List<Double> avgTemp){
            double avg = 0;

            for(int i = 0; i < avgTemp.size(); i++){
                avg += avgTemp.get(i);
            }
            avg = avg/5;
            return avg;

        }


    public static void printAvg(int city, List completeList) {
        for(int i = 0; i < city; i++){
            System.out.println("For the city " + completeList.get(i) + " the average was: " + completeList.get(city + i*2 + 1));
        }
    }
}


