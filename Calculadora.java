import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static double somar(double valorAtual, double segundoNumero){
        return valorAtual + segundoNumero;
    }

    public static double subtrair(double valorAtual, double segundoNumero){
        return valorAtual - segundoNumero;
    }

    public static double multiplicar(double valorAtual, double segundoNumero){
        return valorAtual * segundoNumero;
    }

    public static double dividir(double valorAtual, double segundoNumero){
        if (segundoNumero != 0 ){
            return valorAtual / segundoNumero;
        } else {
            System.out.println("nao e possivel dividir por zero");
            return valorAtual;
        }
    }

    public static void exibirResultado(double valorAtual){
        System.out.println("\nResultado: " + valorAtual);
    }

    public static void exibirMenu(){
        System.out.println("\n1. SOMAR");
        System.out.println("2. SUBTRAIR");
        System.out.println("3. MULTIPLICAR");
        System.out.println("4. DIVIDIR");
        System.out.println("5. SAIR");
    }



    public static int lerOpcao(Scanner sc){
        while(true){
            try{
                return sc.nextInt();
            }catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Digite um número.");
                sc.next();
            }
        }
    }

    public static double lerNumero(Scanner sc){
        while(true){
            try{
                return sc.nextDouble();
            }catch (InputMismatchException e){
                System.out.println("Entrada inválida! Digite um número.");
                sc.next();
            }
        }
    }

    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);

        double segundoNumero = 0;
        double valorAtual = 0;
        int opcao = 0;

        System.out.print("Digite o número 1: ");
        valorAtual = lerNumero(sc);
        
        do{
            exibirMenu();
            opcao = lerOpcao(sc);
            
            if (opcao >= 1 && opcao <= 4) {
                System.out.print("\nDigite o próximo número: ");
                segundoNumero = lerNumero(sc);
            } else {
                segundoNumero = 0;
            }

            switch(opcao){
                case 1 ->{
                    valorAtual = somar(valorAtual,segundoNumero);
                    exibirResultado(valorAtual);
                }
                case 2 ->{
                    valorAtual = subtrair(valorAtual,segundoNumero);
                    exibirResultado(valorAtual);
                }
                case 3 ->{
                    valorAtual = multiplicar(valorAtual,segundoNumero);
                    exibirResultado(valorAtual);
                }
                case 4 ->{
                    valorAtual = dividir(valorAtual,segundoNumero);
                    exibirResultado(valorAtual);
                }
                case 5 -> System.out.println("\nSair");       
                default -> System.out.println("Invalido");
          }
        }while(opcao !=5);
        sc.close();
    }
}
