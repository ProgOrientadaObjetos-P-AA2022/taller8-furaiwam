/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.Locale;
import java.util.Scanner;

import paquete1.DocenteFactura;
import paquete1.DocenteNombramiento;
/**
 *
 * @author reroes
 */
public class Ejecutor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        DocenteFactura df = new DocenteFactura();
        DocenteNombramiento dn = new DocenteNombramiento();

        String nombre;
        String cedula;

        int op;

        System.out.println("Ingrese el numero correspondiente\n\n"
                + "Ingresar un Docente con factura           [1]\n"
                + "Ingresar un docente de nombramiento       [2]\n");
        op = sc.nextInt();
        sc.nextLine();

        if (op == 1 || op == 2) {

            System.out.println("Ingrese el nombre del Docente: ");
            nombre = sc.nextLine();
            System.out.println("Ingrese la cedula del Docente: ");
            cedula = sc.nextLine();

            switch (op) {
                case 1:
                    df.establecerNombre(nombre);
                    df.establecerCedula(cedula);

                    System.out.println("Ingrese el valor de factura: ");
                    df.establecerValorFactura(sc.nextDouble());
                    System.out.println("Ingrese el valor del iva: ");
                    df.establecerValorIva(sc.nextDouble());

                    df.establecerValorCancelado();

                    System.out.printf("%s\n",df);

                    break;
                case 2:
                    dn.establecerNombre(nombre);
                    dn.establecerCedula(cedula);

                    System.out.println("Ingrese el sueldo del Docente: ");
                    dn.establecerValorSueldo(sc.nextDouble());
                    System.out.println("Ingrese el valor por horas de sueldo: ");
                    dn.establecerValorPorHora(sc.nextDouble());
                    System.out.println("Ingrese el numero de horas trabajadas: ");
                    dn.establecerNumHoras(sc.nextInt());

                    dn.establecerSueldo();

                    System.out.printf("%s\n", dn);

                    break;
            }
        } else {
            System.out.println("Error, opción no válidad.");
        }
    }
}
