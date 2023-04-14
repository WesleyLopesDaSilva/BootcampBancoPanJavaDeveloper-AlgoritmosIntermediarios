import java.util.*;

public class Quitanda {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Quantos kg de morango você comprou? ");
        double kgmorango = teclado.nextDouble();
        System.out.println("Quantos kg de maça você comprou? ");
        double kgmaca = teclado.nextDouble();

        double valorMorango = 0;
        double valorMaca = 0;

        if(kgmorango <= 5){
            valorMorango = 2.5 * kgmorango;
        } else{
            valorMorango = 2.2 * kgmorango;
        }

        if(kgmaca <= 5){
            valorMaca = 1.8 * kgmaca;
        } else{
            valorMaca = 1.5 * kgmaca;
        }

        double kgFrutas = kgmorango + kgmaca;
        double valorCompra = valorMorango + valorMaca;
        
        if(kgFrutas > 8 || valorCompra > 25.00 ){
            valorCompra = valorCompra - (0.1 * valorCompra);
        }

        System.out.println("Valor a ser pago: R$" + valorCompra);

    }
}