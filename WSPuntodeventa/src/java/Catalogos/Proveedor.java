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
public class Proveedor {
    private int idProvedor;
    private String razonSocial;

    public Proveedor(int idProvedor, String razonSocial) {
        this.idProvedor = idProvedor;
        this.razonSocial = razonSocial;
    }

    public int getIdProvedor() {
        return idProvedor;
    }

    public void setIdProvedor(int idProvedor) {
        this.idProvedor = idProvedor;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }
    
    
}
