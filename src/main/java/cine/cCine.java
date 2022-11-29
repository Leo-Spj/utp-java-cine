/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cine;

/**
 *
 * @author user
 */
public class cCine {
    
    private String sala;
    private int numeroAsientos;
    private int preciotNiños;
    private int precioAdultos;

    public cCine(String sala, int numAsientos, int preciotNiños, int precioAdultos ) {
      this.sala = sala;
      this.numeroAsientos = numAsientos;
      this.preciotNiños = preciotNiños;
      this.precioAdultos = precioAdultos;      
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public void setNumeroAsientos(int numeroAsientos) {
        this.numeroAsientos = numeroAsientos;
    }

    public void setPreciotNiños(int cantNiños) {
        this.preciotNiños = cantNiños;
    }

    public void setCantAdultos(int precioAdultos) {
        this.precioAdultos = precioAdultos;
    }

    @Override
    public String toString() {
        return  "sala = '" + sala + "'" + 
                "\nnumeroAsientos = " + numeroAsientos +
                "\npreciotNiños = " + preciotNiños +
                "\nprecioAdultos = " + precioAdultos ;
    }
}