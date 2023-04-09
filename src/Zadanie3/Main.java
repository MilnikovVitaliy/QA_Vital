package Zadanie3;
//Создать класс Tree с перегруженными конструкторами.
//   В классе есть Tree есть поля:
//   String type; int height, int coutOfsticks, String colour;
//
//   Конструктор1 принимающий в параметры String type; int height
//   и присваивающий значение полям coutOfsticks значение 13,
//   colour "Зеленый".
//
//   Конструктор2 принимающий в параметры int height, int coutOfsticks,
//   String colour и присваивающий значение полю type "пихта".
//
//   Констуктор по умолчанию 3, который присваивает height = 350, coutOfsticks = 29,
//   сolour = "Желтый".
//
//   Конструктор4 который принимает в параметры String type,
//   и вызывает внутри себя конструктор 3.
//
//   Создать в отдельном классе main 4 объекта класса Tree используя 4 созданных конструктора.
public class Main {
    public static void main(String[] args) {
        Tree constr1 = new Tree("Сосна", 3);
        System.out.println("==========================");
        Tree constr2 = new Tree(5,200, "оранжевый");
        System.out.println("==========================");
        Tree constr3 = new Tree();
        System.out.println("==========================");
        Tree constr4 = new Tree("Туя");

    }
}
