/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_linsyposso;

/**
 *
 * @author 29164
 */
public class WaterType extends Pokemon {
    protected boolean vidaEnAgua;
    protected int rapidezNado;

    public WaterType(String nombre, int numPokedex, String naturaleza, boolean vidaEnAgua, int rapidezNado) {
        super(nombre, numPokedex, naturaleza); 
        this.vidaEnAgua = vidaEnAgua;
        this.rapidezNado = rapidezNado;
    }
    
    
}
