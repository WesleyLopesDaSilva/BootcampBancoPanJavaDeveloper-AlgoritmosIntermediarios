import java.util.Scanner;

public class EspacoVogais {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a sua frase: ");
        String frase = leitor.nextLine();
        int vogais = 0, espacos = 0;
        int caracteres = frase.length(); //Método que retorna o número de caracteres em uma string ou seja ele retorna o comprimento da string.
        for(int i=0; i < frase.length(); i++){
            char posicao = frase.charAt(i); //Método que retorna o caractere na posição especificada pelo índice i em uma string frase ou seja ele pega o caractere na posição i da string frase.
            if(posicao == 'a' || posicao == 'e' || posicao == 'i' || posicao == 'o' || posicao == 'u' || posicao == 'A' || posicao == 'E' || posicao == 'I' || posicao == 'O' || posicao == 'U'){
                vogais++;
            }
            if(posicao == ' '){
                espacos++;
            }
        }

        System.out.println("Espacos em branco: " + espacos + " Vogais: " + vogais); 

    }
}

/*
--> Uma das maneiras aceita pela DIO

import java.util.Scanner;
public class EspacoVogais {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        String frase = leitor.nextLine();
        int vogais = 0, espacos = 0;
        int caracteres = frase.length(); //Método que retorna o número de caracteres em uma string ou seja ele retorna o comprimento da string.
        for(int i=0; i < frase.length(); i++){
            char posicao = frase.charAt(i); //Método que retorna o caractere na posição especificada pelo índice i em uma string frase ou seja ele pega o caractere na posição i da string frase.
            if(posicao == 'a' || posicao == 'e' || posicao == 'i' || posicao == 'o' || posicao == 'u' || posicao == 'A' || posicao == 'E' || posicao == 'I' || posicao == 'O' || posicao == 'U'){
                vogais++;
            }
            if(posicao == ' '){
                espacos++;
            }
        }
        System.out.println("Espacos em branco: " + espacos + " Vogais: " + vogais); 
    }
}
*/