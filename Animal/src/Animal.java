import java.util.Scanner;

public class Animal {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        String AN1,AN2,AN3;
        System.out.println("Digite 1: ");
        AN1 = teclado.nextLine();
        System.out.println("Digite 2: ");
        AN2 = teclado.nextLine();
        System.out.println("Digite 3: ");
        AN3 = teclado.nextLine();

        if (AN1.equals("vertebrado")) {
            if (AN2.equals("ave")) {
                if (AN3.equals("carnivoro")) {
                    System.out.println("aguia");
                } else if (AN3.equals("onivoro")) {
                    System.out.println("pomba");
                }
            } else if (AN2.equals("mamifero")) {
                if (AN3.equals("onivoro")) {
                    System.out.println("homem");
                } else if (AN3.equals("herbivoro")) {
                    System.out.println("vaca");
                }
            }
        } else if (AN1.equals("invertebrado")) {
            if (AN2.equals("inseto")) {
                if (AN3.equals("hematofago")) {
                    System.out.println("pulga");
                } else if (AN3.equals("herbivoro")) {
                    System.out.println("lagarta");
                }
            } else if (AN2.equals("anelideo")) {
                if (AN3.equals("hematofago")) {
                    System.out.println("sanguessuga");
                } else if (AN3.equals("onivoro")) {
                    System.out.println("minhoca");
                }
            }
        }

    }
}

/*
--> código que a DIO aceita
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String AN1, AN2, AN3;

        AN1 = sc.nextLine();
        AN2 = sc.nextLine();
        AN3 = sc.nextLine();

        if (AN1.equals("vertebrado")) {
            if (AN2.equals("ave")) {
                if (AN3.equals("carnivoro")) {
                    System.out.println("aguia");
                } else if (AN3.equals("onivoro")) {
                    System.out.println("pomba");
                }
            } else if (AN2.equals("mamifero")) {
                if (AN3.equals("onivoro")) {
                    System.out.println("homem");
                } else if (AN3.equals("herbivoro")) {
                    System.out.println("vaca");
                }
            }
        } else if (AN1.equals("invertebrado")) {
            if (AN2.equals("inseto")) {
                if (AN3.equals("hematofago")) {
                    System.out.println("pulga");
                } else if (AN3.equals("herbivoro")) {
                    System.out.println("lagarta");
                }
            } else if (AN2.equals("anelideo")) {
                if (AN3.equals("hematofago")) {
                    System.out.println("sanguessuga");
                } else if (AN3.equals("onivoro")) {
                    System.out.println("minhoca");
                }
            }
        }
    }
}
*/