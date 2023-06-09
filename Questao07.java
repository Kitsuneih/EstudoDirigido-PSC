//A concessionária de veículos “CARANGO VELHO” está vendendo os seus veículos com
//desconto. Faça um programa que calcule e exiba o valor do desconto e o valor a ser
//pago pelo cliente de vários carros. O desconto deverá ser calculado de acordo com o
//ano do veículo. Até 2010 - 12% e acima de 2010 - 7%. O sistema deverá perguntar se
//deseja continuar calculando desconto até que a resposta seja: “(N) Não” . Informar
//total de carros com ano até 2010 e total geral.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int carros2010 = 0;
        int total = 0;
        boolean continuar = true;

        while (continuar) {
            System.out.println("Informe o ano do carro: ");
            int ano = scanner.nextInt();
            System.out.println("Informe o preço do carro: R$");
            double preco = scanner.nextDouble();
            double desc;
            if (ano <= 2010) {
                desc = 0.12;
                carros2010++;
            } else {
                desc = 0.07;
            }
            double valorCdesc = preco - desc;
            double valorDesc = preco *(1- desc);
            total += valorCdesc;
            System.out.println("Desconto de: "+desc+"%");
            System.out.println("Valor a pagar: "+valorDesc);
            System.out.println("Gostaria de continuar calculando? (S/N)");
            char resp = scanner.next().charAt(0);
            continuar = resp=='S'||resp=='s';
        }
        System.out.println("Total carros até o ano 2010: " + carros2010);
        System.out.println("Total geral: " + total);
    }
}
