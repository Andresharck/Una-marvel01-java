import java.util.Scanner;

public class Alistamento {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in); 
        System.out.println("digite o nome do recruta: ");
        String nome = Scanner.nextLine();
        
        System.out.println("ola " + nome + "!");

        System.out.println("Digite o seu peso: ");
        double peso = Scanner.nextDouble();
        ;
        System.out.println("Seu peso é" + peso + "Kg");

     if (peso< 50) {
       System.out.println("Você está abaixo do peso ideal para o alistamento");
     } else if (peso >= 50 && peso <= 100) {

     } else {
        System.out.println("Você esta dentro do peso para o alistamento: ");  
     } 
       Scanner.close(); 
     }

        
    }

