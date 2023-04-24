import java.io.IOException;
import java.util.Scanner;

public class TaxIR {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o valor do seu salário: ");
        double sal = leitor.nextDouble();
        double imposto;
        double sal_imposto;
        double sal_imposto2;
        double imposto2;
        double sal_imposto3;
        double imposto3;

        if(sal <= 2000.00){
            System.out.println("Isento");
        } else if(sal <= 3000.00){
            sal_imposto = sal - 2000.00;
            imposto = 0.08 * sal_imposto;
            System.out.println(String.format("R$ %.2f", imposto));
        } else if(sal <= 4500.00){
            imposto = 0.08 * 1000.00;
            sal_imposto2 = sal - 3000.00;
            imposto2 = 0.18 * sal_imposto2;
            imposto = imposto + imposto2;
            System.out.println(String.format("R$ %.2f", imposto));
        } else {
            imposto = 0.08 * 1000.00;
            imposto2 = 0.18 * 1500;
            sal_imposto3 = sal - 4500;
            imposto3 = 0.28 * sal_imposto3;
            imposto = imposto + imposto2 + imposto3;
            System.out.println(String.format("R$ %.2f", imposto));
        }
    }
}

/*
--> Um dos modelos aceitos pela DIO
import java.io.IOException;
import java.util.Scanner;

public class TaxIR {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double sal = leitor.nextDouble();
        double imposto;
        double sal_imposto;
        double sal_imposto2;
        double imposto2;
        double sal_imposto3;
        double imposto3;

        if (sal <= 2000.00) {
            System.out.println("Isento");
        } else if (sal <= 3000.00) {
            sal_imposto = sal - 2000.00;
            imposto = 0.08 * sal_imposto;
            System.out.println(String.format("R$ %.2f", imposto));
        } else if (sal <= 4500.00) {
            imposto = 0.08 * 1000.00;
            sal_imposto2 = sal - 3000.00;
            imposto2 = 0.18 * sal_imposto2;
            imposto = imposto + imposto2;
            System.out.println(String.format("R$ %.2f", imposto));
        } else {
            imposto = 0.08 * 1000.00;
            imposto2 = 0.18 * 1500;
            sal_imposto3 = sal - 4500;
            imposto3 = 0.28 * sal_imposto3;
            imposto = imposto + imposto2 + imposto3;
            System.out.println(String.format("R$ %.2f", imposto));
        }
    }
}
*/