
package util;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ArquivoUtil {

    public static List<String> lerArquivo(String caminho) {

        List<String> linhas = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(caminho));
            String linha;

            while ((linha = br.readLine()) != null) {
                linhas.add(linha);
            }

            br.close();

        } catch (IOException e) {
            System.out.println("Arquivo não encontrado.");
        }

        return linhas;
    }

    public static void escreverArquivo(String caminho, List<String> linhas) {

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(caminho));

            for (String linha : linhas) {
                bw.write(linha);
                bw.newLine();
            }

            bw.close();

        } catch (IOException e) {
            System.out.println("Erro ao salvar arquivo.");
        }
    }
}
