package cursojava;
/**
 * @author Carlos Pascual
 * @version 12.1
 */
public class Empleado extends Persona{
    private int numeroEmpleado;

private String departamento;

private String puesto;

/**
 *Constructor de Empleado 
 */
public Empleado(){
                      
}

/**
 * Constructor Empleado con los parámetros a usar
 * @param nombre 
 * @param edad
 * @param sexo
 * @param numeroEmpleado
 * @param departamento
 * @param puesto 
 */ 

public Empleado(

String nombre,

int edad,

char sexo,

int numeroEmpleado,

String departamento,


String puesto)
{
super ();

this.numeroEmpleado = numeroEmpleado;

this.departamento = departamento;

this.puesto = puesto;

}
/**
 * Metodo que nos devuelve un numero entero
 * @return Devuelve un numero de Empleados
 */


public int getNumeroEmpleado() {

return numeroEmpleado;

}


/**
 * Metodo que almacena el numero de empleados
 * @param numeroEmpleado 
 */
public void setNumeroEmpleado(int numeroEmpleado) {

this.numeroEmpleado = numeroEmpleado;

}


/**
 * Metodo que devuelve un String
 * @return 
 */

public String getDepartamento() {

return departamento;

}


/**
 * Metodo que almacena un String
 * @param departamento 
 */
public void setDepartamento(String departamento) {

this.departamento = departamento;

}



/**
 * 
 * @return Devuelve un string
 */

public String getPuesto() {

return puesto;

}


/**
 * Almacena un tipo string en la variable puesto
 * @param puesto 
 */
public void setPuesto(String puesto) {

this.puesto = puesto;
}
}
