package com.cod_carlospascual;


/**
 * Clase para manejar las entradas de un blog.
 * @author Carlos Pascual
 * @version 2.3
 */

public class EntradaBlogCPG {
    
      
     

    public static char separador = ':';
    private int id;
    private String texto;
    private String autor;

   
    /**
     * Constructor de la clase. recibe el número de entrada, el nombre del autor 
     * de la entrada y el texto que contiene la entrada. Si el número de entrada
     * es negativo, lanza una excepción
     * @param id tipo int
     * @param autor tipo string
     * @param texto tipo string
     * @throws IllegalArgumentException 
     */
    public EntradaBlogCPG(int id, String autor, String texto) throws IllegalArgumentException {
        if (id <= 0) {
            throw new IllegalArgumentException("El id no puede ser negativo");
        }
        this.id = id;
        this.autor = autor;
        this.texto = texto;
    }

    /**
     * Método que devuelve una cadena
     * @return devuelve la cadena
     */
    @Override
    public String toString() {
        String cad = "";
        cad += "\nENTRADA DE" + separador + autor;
        cad += "\n " + texto;
        return cad;
    }

    
    /**
     * Método que de vuelve el numero de entrada
     * @return Devuelve el número de la entrada
     */
    public int getId() {
        return this.id;
    }

   
    /**
     * Método que devuelve el texto completo de la entrada
     * @return devuelve el texto completo de la entrada
     */
    public String getTexto() {
        return this.texto;
    }

    
    /**
     * Método que devuelve el nombre del autor
     * @return devuelve el nombre del autor de la entrada en mayúsculas
     */
    public String getAutor() {
        return this.autor.toUpperCase();
    }

    
    /**
     * Método que devuelve el nombre del autor
     * @return devuelve el nombre del autor
     */
    public String devuelveAutor() {
        return this.autor;
    }

    
    /**
     * Método que no contiene argumentos y devuelve una cadena
     */
    public static void main(String[] args) {
        //Modificar.
        EntradaBlogCPG e1 = new EntradaBlogCPG(-3, "TU_NOMBRE", "Últimas noticias, está disponible BixBy 2.0");
        System.out.println(e1);
    }

}
