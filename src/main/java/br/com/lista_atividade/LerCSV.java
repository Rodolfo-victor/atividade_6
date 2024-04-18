package br.com.lista_atividade;

import java.io.*;

public class LerCSV {
    public static void main(String[] args) {
        String csvFile = "dados.csv";
        String line;
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] fields = line.split(cvsSplitBy);
                System.out.println("Linha: " + line);
                for (int i = 0; i < fields.length; i++) {
                    System.out.println("Dados " + (i + 1) + ": " + fields[i]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
