//Escrever um programa que leia o nome e o sexo de 30 pessoas e informe o nome e se
//ela é homem ou mulher. No final informe total de homens e de mulheres.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int mulheres = 0;
        int homens = 0;

        for (int i = 1; i <= 30; i++) {
            System.out.println("Insira um nome: "+i);
            String nome = scanner.nextLine();

            System.out.println("Informe o sexo da pessoa: M- Masculino, F- Feminino"+i);
            String sexo = scanner.nextLine();

            if (sexo =="M") {
                System.out.println("A pessoa" + nome + " é um homem.");
                homens++;
            } else if (sexo == "F") {
                System.out.println("A pessoa" +nome + " é uma mulher.");
                mulheres++;
            }
        }
        System.out.println("O total de homens: "+homens);
        System.out.println("O total de mulheres: "+mulheres);
        }
    }
