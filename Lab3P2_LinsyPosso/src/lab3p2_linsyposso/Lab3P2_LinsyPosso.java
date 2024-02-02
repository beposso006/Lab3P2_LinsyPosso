/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p2_linsyposso;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 29164
 */
public class Lab3P2_LinsyPosso {

    private static ArrayList<Pokemon> listaPokemon = new ArrayList<>();
    private static ArrayList<Pokeball> listaPokebolas = new ArrayList<>();
    public static Scanner Leer = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            System.out.println("--Menu--");
            System.out.println("1. Crear Pokemon");
            System.out.println("2. Crear Pokebola");
            System.out.println("3. Listar Pokemon");
            System.out.println("4. Eliminar Pokemon");
            System.out.println("5. Capturar Pokemon");
            System.out.println("6. Modificar");
            System.out.println("7. Salir");
            System.out.print("Ingrese una opcion: ");
            int opcion = Leer.nextInt();
            switch (opcion) {
                case 1: {
                    crearPokemon();
                }

            }
        }
    }

    public static void crearPokemon() {
        boolean seguir = true;
        while (seguir) {
            System.out.println("--Crear Pokemon--");
            System.out.println("Opciones...");
            System.out.println("1. Fire Type");
            System.out.println("2. Water Type");
            System.out.println("3. Grass Type");
            System.out.print("Ingrese la opcion que desea: ");
            int opPokemon = Leer.nextInt();
            switch (opPokemon) {
                case 1:
                    System.out.print("Ingrese el nombre del Pokemon: ");
                    String nombre = Leer.next();
                    System.out.print("Ingrese numero de entrada en la Pokedex: ");
                    int numE = Leer.nextInt();
                    System.out.print("Ingrese la naturaleza del Pokemon naturaleza(Tímido, Energético, Misterioso): ");
                    String natu = Leer.next();
                    if (!natu.equalsIgnoreCase("Timido") && !natu.equalsIgnoreCase("Energetico") && !natu.equalsIgnoreCase("Misterioso")) {
                        System.out.println("Naturaleza no valida");
                        return;
                    }
                    System.out.print("Ingrese la potencia de llamas del Pokemon: ");
                    int potencia = Leer.nextInt();
                    Pokemon nuevoPokemon = new FireType(nombre, numE, natu, potencia);
                    seguir = false;
                    break;

                case 2:
                    System.out.print("Ingrese el nombre del Pokemon: ");
                    String nombreW = Leer.next();
                    System.out.print("Ingrese numero de entrada en la Pokedex: ");
                    int numEW = Leer.nextInt();
                    System.out.print("Ingrese la naturaleza del Pokemon naturaleza(Tímido, Energético, Misterioso): ");
                    String natuW = Leer.next();
                    if (!natuW.equalsIgnoreCase("Timido") && !natuW.equalsIgnoreCase("Energetico") && !natuW.equalsIgnoreCase("Misterioso")) {
                        System.out.println("Naturaleza no valida");
                        return;
                    }
                    System.out.print("El Pokemon puede vivir en el agua? (true/false): ");
                    boolean vidaAgua = Leer.nextBoolean();
                    System.out.print("Ingrese la rapidez al nadar del Pokemon: ");
                    int nadar = Leer.nextInt();
                    nuevoPokemon = new WaterType(nombreW, numEW, natuW, vidaAgua, nadar);
                    seguir = false;
                    break;

                case 3:
                    System.out.print("Ingrese el nombre del Pokemon: ");
                    String nombreG = Leer.next();
                    System.out.print("Ingrese numero de entrada en la Pokedex: ");
                    int numEG = Leer.nextInt();
                    System.out.print("Ingrese la naturaleza del Pokemon naturaleza(Tímido, Energético, Misterioso): ");
                    String natuG = Leer.next();
                    if (!natuG.equalsIgnoreCase("Timido") && !natuG.equalsIgnoreCase("Energetico") && !natuG.equalsIgnoreCase("Misterioso")) {
                        System.out.println("Naturaleza no valida");
                        return;
                    }
                    System.out.print("Ingrese el habitat del Pokemon: ");
                    String habitat = Leer.next();
                    System.out.print("Ingrese el dominio sobre las plantas del Pokemon: ");
                    int dominio = Leer.nextInt();
                    if (dominio < 1 || dominio > 100) {
                        System.out.println("El dominio sobre las plantas debe estar en un rango de 1 a 100. Inténtalo de nuevo.");
                    }
                    nuevoPokemon = new GrassType(nombreG, numEG, natuG, habitat, dominio);
                    seguir = false;
                    break;
            }
        }
    }

    public static void crearPokebola() {

    }
}
