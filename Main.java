package Atividade8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Digite quanto você ganha por hora");
        double cash = sc.nextDouble();

        System.out.println("Digite quantas horas você trabalha no dia");
        double horas = sc.nextDouble();

        System.out.println("Digite 1 para 30 dias, 2 para 31 dias no mês");
        int mes = sc.nextInt();
            if (mes == 1) {
                mes = 30;
            } 
            if (mes == 2) {
                mes = 31;
            }
        
        double salario = mes * (cash * horas);
        System.out.println("Seu sálario no mês foi: R$" + salario);

        sc.close();

    } 

}