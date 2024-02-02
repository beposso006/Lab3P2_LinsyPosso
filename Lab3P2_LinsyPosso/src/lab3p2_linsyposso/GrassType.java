/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_linsyposso;

/**
 *
 * @author 29164
 */
public class GrassType extends Pokemon {
    public String habitat;
    public int dominoPlantas;

    public GrassType(String nombre, int numPokedex, String naturaleza, String habitat, int dominioPlanta) {
        super(nombre, numPokedex, naturaleza);
        this.habitat = habitat;
        this.dominoPlantas = dominoPlantas;
    }
    
    
}
