package modelo;
import java.util.Arrays;
import java.util.Scanner;
public class Array {

        public static void main(String[] args)
        {
            int n = 0;
            int soma = 0;
            double media;
            Scanner read = new Scanner(System.in);
            System.out.print("Numero de elementos desejado: ");
            n = read.nextInt();
            int a[] = new int[n];
            System.out.println("Digite cada elemento:");
            for(int i = 0; i < n ; i++)
            {
                 a[i] = read.nextInt();
                soma = soma + a[i];
            }
            System.out.println("Soma:"+soma);
            media = (double)soma / n;
            System.out.println("Media:"+media);
            System.out.println("Numero de elementos: "+a.length);
        }
    }
