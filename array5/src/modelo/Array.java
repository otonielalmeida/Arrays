package modelo;
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int mariazinha = 150;
        int maricota = 110;
        int anos = 0;
        while (mariazinha >= maricota){
            mariazinha = mariazinha +2;
            maricota = maricota +3;
            anos = anos +1;
        }
        System.out.println(anos);
    }
}
//Mariazinha tem 1,50m e cresce 2 centímetros por ano,
// enquanto Maricota
// tem 1,10m e cresce 3 centímetros por ano
//Construir um programa que calcule
// e imprima quantos anos serão
// necessários para que Maricota seja maior que Mariazinha.