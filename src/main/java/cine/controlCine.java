package cine;

public class controlCine {

    // Atributos: arreglo de salas de cine cCine


    /* NO BORRAR, NO BORRAR, NO BORRAR:  <----
    //se podrá modificar o se podra tomar por parametro mediante el formulario, OJO:
    private cCine salasCine[];
    private int numSalas;

    // Constructor: controlCine toma por parametro numSalas, crea un arreglo de cCine
    public controlCine(int numSalas) {
        this.numSalas = numSalas;
        salasCine = new cCine[numSalas];
    } NO BORRAR, NO BORRAR, NO BORRAR   <----*/

    private cCine[] salasCine;//VALOR POR DEFECTO, 10 SALAS DE CINE
    // Constructor: controlCine crea un arreglo de cCine
    private int cont;

    public controlCine() {
        salasCine = new cCine[10000];
    }


    //Metodo: crea la sala de cine, recibe por parametro los datos de la sala de cine
    public void crearSalaCine(String sala, int numAsientos, double precioEntrada) {
        //crea la sala de cine
        cCine salaCine = new cCine(sala, numAsientos, precioEntrada);
        //agrega la sala al arreglo de salas de cine
        for (int i = 0; i < salasCine.length; i++) {
            if (salasCine[i] == null) {
                salasCine[i] = salaCine;
                break;
            }
        }
    }


    //Metodo: busca una sala de cine por su nombre de sala y devuelve la posicion en el arreglo:
    public int buscarSalaCine(String sala) {
        int posicion = 0;
        for (int i = 0; i < salasCine.length; i++) {
            if (salasCine[i] != null) {
                if (salasCine[i].getSala().equals(sala)) {
                    posicion = i;
                    break;
                }
            }
        }
        return posicion;
    }

    //Metodo: devuelvo el objeto de cCine mediante la posicion en el arreglo:
    public cCine obtenerSalaCinePosicion(int posicion) {
        return salasCine[posicion];
    }

    //Metodo: fusionando obtenerSalaCine y buscarSalaCine, devuelve el objeto de cCine mediante el nombre de la sala:
    public  cCine obtenerSalaCineNombre(String sala) {
        return salasCine[buscarSalaCine(sala)];
    }


    //Metodo: devuelvo el número de asientos disponibles de la sala:
    //Aqui reutilizo el metodo obtenerSalaCineNombre.
    public int obtenerAsientosDisponibles(String sala) {
        return salasCine[buscarSalaCine(sala)].getNumeroAsientos() - salasCine[buscarSalaCine(sala)].getAsientosVendidos();
    }

    //Metodo: devuelvo el número de asientos vendidos de la sala:
    //Aqui reutilizo el metodo obtenerSalaCineNombre.
    public int obtenerAsientosVendidos(String sala) {
        return salasCine[buscarSalaCine(sala)].getAsientosVendidos();
    }

    //Metodo: devuelvo el precio de la entrada de la sala:
    //Aqui reutilizo el metodo obtenerSalaCineNombre.
    public double obtenerPrecioEntrada(String sala) {
        return salasCine[buscarSalaCine(sala)].getPrecioEntrada();
    }

    //Metodo: devuelvo los ingresos de la sala usando los asientos vendidos, multiplicado por el precio de la entrada:
    //Aqui reutilizo el metodo obtenerSalaCineNombre.
    public double obtenerGanancias(String sala) {
        return salasCine[buscarSalaCine(sala)].getAsientosVendidos() * salasCine[buscarSalaCine(sala)].getPrecioEntrada();
    }

    //Metodo: setea los asientos vendidos de la sala mediante la posicion del arreglo:
    //Aqui reutilizo el metodo obtenerSalaCineNombre.
    public void setAsientosVendidos(int posicion, int asientosVendidos) {
        salasCine[posicion].setAsientosVendidos(asientosVendidos);
    }
    public String muestraSalas(){
        String cadena="";
        for(int i=0; i<=cont;i++){
            cadena+= salasCine[i].getSala()+"\t"+
                    salasCine[i].getNumeroAsientos()+"\t"+
                    salasCine[i].getPrecioEntrada()+"\t"+
                    salasCine[i].getAsientosVendidos();
                    
        }
        return cadena;
    }

    //Metodo que obtiene el precio de la entrada mediante el nombre de la sala:
    public double obtenerPrecioEntradaNombre(String sala) {
        return salasCine[buscarSalaCine(sala)].getPrecioEntrada();
    }
}

