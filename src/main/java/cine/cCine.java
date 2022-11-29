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
    private int precioEntrada;


    public cCine(String sala, int numAsientos, int precioEntrada ) {
      this.sala = sala;
      this.numeroAsientos = numAsientos;
      this.precioEntrada = precioEntrada;
       
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public void setNumeroAsientos(int numeroAsientos) {
        this.numeroAsientos = numeroAsientos;
    }

    public void setPrecioEntrada(int precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    @Override
    public String toString() {
        return "cCine{" + "sala=" + sala + ", numeroAsientos=" + numeroAsientos + ", precioEntrada=" + precioEntrada + '}';
    }

   

   
}