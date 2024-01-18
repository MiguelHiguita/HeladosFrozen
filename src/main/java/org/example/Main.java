package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String tipoHelado;
        int totalVentaSimple;
        int totalVentaDoble;
        int totalVentaEspecial;
        double totalDia;
        int precioHeladoSimple;
        int precioHeladoDoble;
        int precioHeladoEspecial;

        Scanner keyboard=new Scanner(System.in);

        System.out.println("*****Helados Frozen*****");
        System.out.println("*****Bienvenido*****");


        System.out.println("Digite el precio del helado Simple: ");
        precioHeladoSimple=keyboard.nextInt();


        System.out.println("Digite el precio del helado Doble: ");
        precioHeladoDoble=keyboard.nextInt();

        System.out.println("Digite el precio del helado Especial: ");
        precioHeladoEspecial=keyboard.nextInt();

        System.out.println("Digite la cantidad de helados simples vendidos en el dia: ");
        totalVentaSimple=keyboard.nextInt();

        System.out.println("Digite la cantidad de helados dobles vendidos en el dia: ");
        totalVentaDoble=keyboard.nextInt();

        System.out.println("Digite la cantidad de helados Especiales vendidos en el dia: ");
        totalVentaEspecial= keyboard.nextInt();

        totalDia = (precioHeladoSimple * totalVentaSimple + precioHeladoDoble * totalVentaDoble + precioHeladoEspecial * totalVentaEspecial);

        System.out.println("El total de ventas del dia es: "+totalDia+"$");

        

    }
}