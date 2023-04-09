package Zadanie2;

public class PeregruzMetod {

    public void Peregruz(){
        System.out.println("Я пустой метод");
    }

    public void Peregruz(String stroka){
        System.out.println("Введенная строка: " + stroka);
    }

    public void Peregruz(String[] stroka1){
        System.out.println("Слова в строке: " + String.join(" ", stroka1));
    }

    public void Peregruz(int[] chisl){
        int sum = 0;
        for (int i = 0; i < chisl.length; i=i+1){
            sum = sum + chisl[i];
        }
        System.out.println("Сумма элементов массива = " + sum);
    }

    public void Peregruz(int A, String stroka){
        System.out.println("Ваше сообщение - " + stroka + ". Ваше число: " + A);
    }
}
