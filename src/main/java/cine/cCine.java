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
    //Atributos
    private String sala;
    private double precioEntrada;
    private int numeroAsientos;
    private int asientosVendidos;
    
   //Metodo constructor  de la clase con 3 parámetros. El atributo de asientos vendidos se inicializa con cero
    public cCine(String sala, int numAsientos, double precioEntrada ) {
      this.sala = sala;
      this.numeroAsientos = numAsientos;
      this.precioEntrada = precioEntrada;
      this.asientosVendidos = 0;
    }
    //Se mostrará como boleta de venta:
    // toString, se le pasa por parametro el numero de asientos vendidos
    public String toStringAsientos(int asientosVendidos) {
        return  "Boleta de Venta\n" +
                "---------------" +
                "\nSala : " + sala +
                "\nPrecio unitario : " + precioEntrada +
                "\nNumero de asientos : " + asientosVendidos +
                "\nPrecio total : " + precioEntrada * asientosVendidos + "\n" ;
    }
    //Poner asientos vendidos
    public void setAsientosVendidos(int asientosVendidos) {
        this.asientosVendidos += asientosVendidos;
    }
    // get= Sacar
    public String getSala() {
        return sala;
    }
    public double getPrecioEntrada() {
        return precioEntrada;
    }

    public int getNumeroAsientos() {
        return numeroAsientos;
    }

    public int getAsientosVendidos(){
        return asientosVendidos;}

}