package modelo;

import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);


        int material = 0;
        double gramas = 0;
        double segundos = 0, minutos = 0, horas = 0;
        System.out.println("Digite o valor da massa: ");
        gramas = read.nextDouble();

        while (gramas > 0.5){
            gramas /= 2;
            material ++;
        }
        segundos = material * 50;
        minutos = segundos / 60;
        horas = minutos / 60;

        System.out.println("Tempo para atingir valor menor que 0.5g:" +
                "\nSegundos: "+segundos+
                "\nMinutos: "+minutos+
                "\nHoras: "+horas);
    }
}
