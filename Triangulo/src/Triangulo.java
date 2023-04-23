import java.io.IOException;
import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o valor de A: ");
		double A = leitor.nextDouble();
        System.out.println("Digite o valor de B: ");
		double B = leitor.nextDouble();
        System.out.println("Digite o valor de C: ");
		double C = leitor.nextDouble();
		double maior;
		double soma;
		if(A + B == C || A + C == B || B + C == A){
		  maior = ((A + B)* C)/2;
		  System.out.println("Area = " + maior);
		} else{
		  soma = A + B + C;
		  System.out.println("Perimetro = " + soma);
		}
    }
}

/*

--> Exemplo de Código aceito pela DIO
import java.io.IOException;
import java.util.Scanner;

public class Teste {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double A = leitor.nextDouble();
        double B = leitor.nextDouble();
        double C = leitor.nextDouble();
        double maior;
        double soma;
        boolean triangulo;
        if (A + B == C || A + C == B || B + C == A) {
            maior = ((A + B) * C) / 2;
            System.out.println("Area = " + maior);
        } else {
            soma = A + B + C;
            System.out.println("Perimetro = " + soma);
        }
    }
}

*/