import java.util.Scanner;

public class Pergunta3 {
    public static void main(String[] args) {
        Scanner inputUsuario = new Scanner(System.in);
        Double notaExercicios = notasExercicios(inputUsuario);
        Double notaProvas = notasProvas(inputUsuario);
        System.out.print("Qual foi a nota, de 0 a 20, do trabalho prático? ");
        double trabalhoPraticoNota = inputUsuario.nextDouble();
        inputUsuario.close();
        double notaFinal = notaExercicios + notaProvas + trabalhoPraticoNota;
        System.out.printf("A nota final do(a) aluno(a) é %.2f%n", notaFinal);
    }

    public static double notasExercicios(Scanner input) {
        double somaExercicios = 0;
        for (int e = 1; e <= 4; e++) {
            System.out.print("Qual foi a nota, de 0 a 100, do exercício " + e + "? ");
            somaExercicios += input.nextDouble();
        }
        return (somaExercicios / 4) * 0.20;
    }

    public static double notasProvas(Scanner input) {
        double somaProvas = 0;
        for (int p = 1; p <= 2; p++) {
            System.out.print("Qual foi a nota, de 0 a 100, da prova " + p + "? ");
            somaProvas += input.nextDouble();
        }
        return (somaProvas / 2) * 0.60;
    }
}
