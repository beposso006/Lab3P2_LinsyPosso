/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_linsyposso;

/**
 *
 * @author 29164
 */
public class Pokeball {
    protected String color;
    protected int numserie;
    protected int eficienciaAtrapando;

    public Pokeball(String color, int numserie, int eficienciaAtrapando) {
        this.color = color;
        this.numserie = numserie;
        this.eficienciaAtrapando = eficienciaAtrapando;
    }

    public int getEficienciaAtrapando() {
        return eficienciaAtrapando;
    }

    public void setEficienciaAtrapando(int eficienciaAtrapando) {
        this.eficienciaAtrapando = eficienciaAtrapando;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumserie() {
        return numserie;
    }

    public void setNumserie(int numserie) {
        this.numserie = numserie;
    }
    
    
    
    
}
