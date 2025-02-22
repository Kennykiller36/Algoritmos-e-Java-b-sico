import java.util.Scanner;

public class Pergunta1 {
    public static void main(String[] args) {
        Scanner inputUsuario = new Scanner(System.in);
        System.out.print("Qual é a largura desejada para o retangulo? ");
        int largura = inputUsuario.nextInt();

        System.out.print("Qual é a altura desejada para o retangulo? ");
        int altura = inputUsuario.nextInt();
        montaRetangulo(altura,largura);
        inputUsuario.close();
    }

    public static void montaRetangulo(int altura, int largura) {
        for (int i = 0; i < altura; i++) {
            for (int k = 0; k < largura; k++) {
                if (i == 0 || i == altura - 1 || k == 0 || k == largura - 1) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); 
        }
    }
}