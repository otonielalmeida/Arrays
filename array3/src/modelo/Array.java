package modelo;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.Arrays;
public class Array {
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);

        ArrayList<Integer> list  = new ArrayList<>();
        for(int i = 0; i<15;){
            System.out.println("Digite um numero:" );
            int numero = read.nextInt();
            if(numero ==0){
                break;
            }
            list.add(numero);
            int soma = IntStream.of(numero).sum();
            System.out.println("Soma dos valores digitados: "+soma);
        }


    }

}
