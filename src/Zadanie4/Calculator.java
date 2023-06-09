package Zadanie4;

import java.util.Scanner;

public class Calculator {
    public void sum(double a, double b){
        System.out.println("Ответ: " + (a + b));
    }
    public void minus(double a, double b){
        System.out.println("Ответ: " + (a - b));
    }
    public void multiply(double a, double b){
        System.out.println("Ответ: " + (a * b));
    }
    public void division(double a, double b){
        System.out.println("Ответ: " + (a / b));
    }

    public void start(){
        System.out.println("Калькулятор запущен.");
        Scanner sc = new Scanner(System.in);
        String action;
        System.out.println("Введите ваше деяствие");
        action = sc.nextLine();
        while (!action.equalsIgnoreCase("STOP")){
            if(action.contains("+")){
                double number1 = Double.parseDouble(action.split("\\+")[0]);
                double number2 = Double.parseDouble(action.split("\\+")[1]);
                sum(number1,number2);
            } else if (action.contains("-")) {
                double number1 = Double.parseDouble(action.split("\\-")[0]);
                double number2 = Double.parseDouble(action.split("\\-")[1]);
                minus(number1, number2);
            } else if (action.contains("*")) {
                double number1 = Double.parseDouble(action.split("\\*")[0]);
                double number2 = Double.parseDouble(action.split("\\*")[1]);
                multiply(number1, number2);
            } else if (action.contains("/")) {
                double number1 = Double.parseDouble(action.split("\\/")[0]);
                double number2 = Double.parseDouble(action.split("\\/")[1]);
                division(number1, number2);
            } else {
                System.out.println("введено некорректное значение");
            }
            System.out.println("Введите ваше действие");
            action = sc.nextLine();
        }
        System.out.println("Калькулятор закрыт");


    }

}
