import java.util.Scanner;

public class Pergunta4 {
    public static void main(String[] args) {
        Scanner inputUsuario = new Scanner(System.in);
        System.out.print("Qual frase você quer criptografar? ");
        String fraseAEmbaralhar = inputUsuario.nextLine();
        inputUsuario.close();
        String criptografado = criptografar(fraseAEmbaralhar);
        System.out.println("A frase criptografada é: " + criptografado);

    }

    public static String criptografar(String s) {
        StringBuilder[] colunas = new StringBuilder[5];
        for (int i = 0; i < 5; i++) {
            colunas[i] = new StringBuilder();
        }
        for (int i = 0; i < s.length(); i++) {
            colunas[i % 5].append(s.charAt(i));
        }

        StringBuilder fraseCriptografada = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            fraseCriptografada.append(colunas[i]).append('*');
        }

        return fraseCriptografada.toString();
    }
}
