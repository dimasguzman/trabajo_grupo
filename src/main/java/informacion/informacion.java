/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package informacion;

/**
 *
 * @author Dimas
 */
public class informacion {
   

    private String nombre;
    private String apellido;
    private String tipo_de_sangre;
    private String ID;
    private String edad;

    public informacion() {

    }

    public void establecernombre(String nombre) {
        this.nombre = nombre;

    }

    public void establecerapellido(String apellido) {
        this.apellido = apellido;
    }

    public void estableceratipo_de_sangre(String tipo_de_sangre) {
        this.tipo_de_sangre = tipo_de_sangre;
    }

    public void estableceraID(String ID) {
        this.ID = ID;
    }

    public void estableceraedad(String edad) {
        this.edad = edad;
    }

    public String getnombre() {
        return this.nombre;
    }

    public String getapellido() {
        return this.apellido;
    }

    public String gettipo_de_sangre() {
        return this.tipo_de_sangre;
    }

    public String getID() {
        return this.ID;
    }

    public String setedad() {
        return this.edad;
    }

    public void imprimir() {
        System.out.println("NOMBRE:"+nombre);
        System.out.println("Apellido:"+apellido);
        System.out.println("Tipo de Sangre:"+tipo_de_sangre);
        System.out.println("ID:"+ID);
        System.out.println("Edad:"+edad);
    }

    
    }

