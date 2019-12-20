/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1parte3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author Yashin
 */
public class Ejercicio1parte3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int op;
       String nombre, RAM, DD, marca, SO, res;
       int capacidad;
       boolean respuesta;        
       Scanner Teclado = new Scanner(System.in);
       List<Computador> Computadores = new ArrayList<Computador>();
       
          do {
            System.out.println("    Opciones");
            System.out.println("    1) Ingresar Computador");
            System.out.println("    2) Mostrar los Computadores instanciados");
            System.out.println("    3) Salir");
            System.out.println("Digite una opción");

            op = Teclado.nextInt();
            Computador computador = new Computador();

            switch (op) {
                case 1:

                    System.out.println("Digite la marca del procesador");
                    nombre = Teclado.next();
                    computador.setProcesador(nombre);
                    System.out.println("Digite la capacidad de la memoria RAM (ejm 4GB)");
                    RAM = Teclado.next();
                    computador.setRAM(RAM);
                    System.out.println("Digite el tipo de disco duro (ATA, IDE, SATA, SSD)");
                    DD = Teclado.next();
                    computador.setDD(DD);
                    System.out.println("Digite la capacidad del Disco Duro (En GB)");
                    capacidad = Teclado.nextInt();
                    computador.setCapacidad(capacidad);
                    System.out.println("Digite la marca de la tarjeta madre");
                    marca = Teclado.next();
                    computador.SetMarca(marca);
                    
                    System.out.println("El computador dispone de TARJETA DE VIDEO? S/N");
                    res = Teclado.next();
                    if((res=="s")||(res=="S"))
                    {
                        respuesta=true;
                    }
                    else
                    {
                        respuesta=false;
                    }
                    computador.Settarjeta(respuesta);
                    System.out.println("Digite la marca de la tarjeta de video");
                    marca = Teclado.next();
                    computador.SetMarcaTV(marca);
                    
                    System.out.println("El computador dispone de lector de CD/DVD? S/N");
                    res = Teclado.next();
                    if((res=="s")||(res=="S"))
                    {
                        respuesta=true;
                    }
                    else
                    {
                        respuesta=false;
                    }
                    computador.SetLector(respuesta);
                    System.out.println("Digite el Sistema Operativo del computador");
                    SO = Teclado.next();
                    computador.SetOperativo(SO);
                    
                    Computadores.add(computador);
                    break;

                case 2:
                    printComputadores(Computadores);
            }
        } while (op != 3);

    }

    //************************************************************************************
    private static void printComputadores(List<Computador> Computadores) {
        for (Computador computador : Computadores) {   //for each
                System.out.println(computador.getProcesador() + " "
                        + computador.getRAM() + " "
                        + computador.getDD() + " "
                        + computador.getCapacidad() + " "
                        + computador.getMarca() + " "
                        + computador.getTarjeta() + " "
                        + computador.getLector() + " "
                        + computador.getOperativo());                 
    }
       
    }
    
}
