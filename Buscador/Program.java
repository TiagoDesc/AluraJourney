package Buscador;

import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        System.setErr(new PrintStream(System.err, true, StandardCharsets.UTF_8));

        Scanner sc = new Scanner(System.in, StandardCharsets.UTF_8);
        ConsultaCep consultaCep = new ConsultaCep();

        System.out.println("Digite o CEP para consulta: ");
        String user = sc.nextLine();

        try {
            Endereco novoEndereco = consultaCep.buscaEndereco(user);
            System.out.println(novoEndereco);

            GeradorDeArquivo geradorDeArquivo = new GeradorDeArquivo();
            geradorDeArquivo.salvaJson(novoEndereco);

        } catch (RuntimeException | IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizando a aplica\u00e7\u00e3o.");
        }
    }
}
