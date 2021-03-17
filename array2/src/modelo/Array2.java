package modelo;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Array2 {
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);



        int [] numeros = new int[51];
        for(int i = 0; i <= 50; i++){
            numeros[i] = i;
        }
        for (int i = 0; i <51; i++){
            System.out.println("posicao: "+ (i+1));
            System.out.println(numeros[i]);
        }
        System.out.println("Tamanho da lista: " + numeros.length);
        int sum = IntStream.of(numeros).sum();
        System.out.println("Soma dos elementos " + sum);
        int [] numero = new int[51];
        for(int i = 0; i <= 50; i++){
            numeros[i] = i;
        }
        for (int i = 0; i <51; i++){
            System.out.print(numeros[i]);
        }
    }
}


