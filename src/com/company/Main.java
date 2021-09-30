package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(printPhrases(55,35));
    }
    public static String printPhrases(int age, int temp ){

        if (age >20 && age<45 || temp < -20 && temp < 30 ){
            return "Можно идти гулять";
        }else if(age >25 && age<35 || temp < -10 && temp < 20){
            return "error";
        }else if(age >20 && age<30 || temp < -15 && temp < 30){

            return " Круто идем гулять";
        }
        else {
            return "Остаемся дома";
        }

    }
}
