package Zadanie1;
//Написать метод, принимающий в качестве параметра массив целых чисел.
// И выводит на экран все четные числа списком, а также нечетные числа списком.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество элементов массива");
        int q = sc.nextInt();
        int[] arr = new int[q];
        for (int i = 0; i < arr.length; i = i + 1) {
            System.out.println("Введите " + (i + 1) + " элемент");
            arr[i] = sc.nextInt();
        }

        MetMass mas = new MetMass();
        mas.Met(arr);
    }

}
