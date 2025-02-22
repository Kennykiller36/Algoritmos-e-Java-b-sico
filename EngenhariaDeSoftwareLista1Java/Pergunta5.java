import java.util.Scanner;

public class Pergunta5 {
    public static void main(String[] args) {
        Scanner inputUsuario = new Scanner(System.in);
        System.out.print("Qual frase você quer descriptografar? ");
        String fraseADescriptografar = inputUsuario.nextLine();
        inputUsuario.close();
        String descriptografado = descriptografar(fraseADescriptografar);
        System.out.println("A frase descriptografada é: " + descriptografado);
    }

    public static String descriptografar(String s) {
        String[] colunas = s.split("\\*");
        int tamanhoOriginal = 0;
        for (String coluna : colunas) {
            tamanhoOriginal += coluna.length();
        }

        StringBuilder fraseOriginal = new StringBuilder(tamanhoOriginal);
        int[] indices = new int[colunas.length];
        for (int i = 0; i < tamanhoOriginal; i++) {
            int colunaIndex = i % colunas.length;
            // Verifica se o índice da coluna está dentro do limite
            if (indices[colunaIndex] < colunas[colunaIndex].length()) {
                fraseOriginal.append(colunas[colunaIndex].charAt(indices[colunaIndex]));
                indices[colunaIndex]++;
            }
        }
        return fraseOriginal.toString();
    }
}
