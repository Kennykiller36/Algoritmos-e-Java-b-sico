import java.util.Scanner;

public class Pergunta2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("1 - Somar dois números");
            System.out.println("2 - O maior de dois números");
            System.out.println("3 - Somar N números");
            System.out.println("4 - Contador de pares de uma sequência");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    somarDoisNumeros(scanner);
                    break;
                case 2:
                    maiorDeDoisNumeros(scanner);
                    break;
                case 3:
                    somarNNumeros(scanner);
                    break;
                case 4:
                    contadorPares(scanner);
                    break;
                case 0:
                    System.out.println("Adeus");
                    break;
                default:
                    System.out.println("Opção não existente");
            }
        } while (opcao != 0);
        scanner.close();
    }

    public static void somarDoisNumeros(Scanner numeroInputSoma) {
        System.out.print("Digite o primeiro número: ");
        int primeiroNum = numeroInputSoma.nextInt();
        System.out.print("Digite o segundo número: ");
        int segundoNum = numeroInputSoma.nextInt();
        System.out.println("O resultado da soma é: " + (primeiroNum + segundoNum));
    }

    public static void maiorDeDoisNumeros(Scanner numeroInputMinMax) {
        System.out.print("Digite o primeiro número: ");
        int primeiroNum = numeroInputMinMax.nextInt();
        System.out.print("Digite o segundo número: ");
        int segundoNum = numeroInputMinMax.nextInt();
        System.out.println("O maior número é: " + Math.max(primeiroNum, segundoNum));
    }

    public static void somarNNumeros(Scanner numeroSomaVarios) {
        System.out.print("Quantos números você deseja somar? ");
        int numeros = numeroSomaVarios.nextInt();
        int soma = 0;
        for (int i = 0; i < numeros; i++) {
            System.out.print("Digite um número: ");
            soma += numeroSomaVarios.nextInt();
        }
        System.out.println("O resultado da soma dos números é: " + soma);
    }

    public static void contadorPares(Scanner numeroPares) {
        System.out.print("Quantos números você deseja inserir? ");
        int numeros = numeroPares.nextInt();
        int contador = 0;
        for (int i = 0; i < numeros; i++) {
            System.out.print("Digite um número: ");
            if (numeroPares.nextInt() % 2 == 0) {
                contador++;
            }
        }
        System.out.println("A quantidade de números pares é: " + contador);
    }
}