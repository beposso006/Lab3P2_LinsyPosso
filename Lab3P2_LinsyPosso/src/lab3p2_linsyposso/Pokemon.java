/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_linsyposso;

/**
 *
 * @author 29164
 */
public class Pokemon {
    private String nombre;
    private int numPokedex;
    private String naturaleza;
    private boolean atrapado;
    Pokeball pokebola;

    public Pokemon(String nombre, int numPokedex, String naturaleza) {
        this.nombre = nombre;
        this.numPokedex = numPokedex;
        this.naturaleza = naturaleza;
        this.atrapado = false;
        this.pokebola = null;
    }

    @Override
    public String toString() {
        return "Pokemon{" + "nombre=" + nombre + ", numPokedex=" + numPokedex + ", naturaleza=" + naturaleza + ", atrapado=" + atrapado + '}';
    }
    
    
}
