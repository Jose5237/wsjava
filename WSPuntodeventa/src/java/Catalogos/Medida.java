/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Catalogos;

/**
 *
 * @author mara_
 */
public class Medida {
    private int idMedida;
    private String Nombre;

    public Medida(int idMedida, String Nombre) {
        this.idMedida = idMedida;
        this.Nombre = Nombre;
    }

    public int getIdMedida() {
        return idMedida;
    }

    public void setIdMedida(int idMedida) {
        this.idMedida = idMedida;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    
}
