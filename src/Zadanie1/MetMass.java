package Zadanie1;


public class MetMass {
        public void Met (int[] chislo) {

        for (int i = 0; i < chislo.length; i = i+ 1) {
            if (chislo[i] % 2 == 0) {
                System.out.println("Число четное: " + chislo[i]);
                }
        }
        for (int i = 0; i < chislo.length; i = i + 1){
            if (chislo[i] % 2 != 0){
                System.out.println("Число нечетное: " + chislo[i]);
            }

        }
    }
}
