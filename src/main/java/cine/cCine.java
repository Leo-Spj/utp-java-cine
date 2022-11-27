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
    private int cantNiños;
    private int cantAdultos;

    public cCine(String sala, int numAsientos, int cantNiños, int cantAdultos ) {
      this.sala = sala;
      this.numeroAsientos = numAsientos;
      this.cantNiños = cantNiños;
      this.cantAdultos = cantAdultos;      
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public void setNumeroAsientos(int numeroAsientos) {
        this.numeroAsientos = numeroAsientos;
    }

    public void setCantNiños(int cantNiños) {
        this.cantNiños = cantNiños;
    }

    public void setCantAdultos(int cantAdultos) {
        this.cantAdultos = cantAdultos;
    }
  
}
