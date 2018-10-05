/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proveedor;

/**
 *
 * @author Jose Antonio
 */
public class Proveedores {
    private int idProvedor;
    private String razonSocial;
    private String domicilioFiscal;
    private String telefono;
    private String correo;
    private String rfc;

    public Proveedores(int idProvedor, String razonSocial, String domicilioFiscal, String telefono, String correo, String rfc) {
        this.idProvedor = idProvedor;
        this.razonSocial = razonSocial;
        this.domicilioFiscal = domicilioFiscal;
        this.telefono = telefono;
        this.correo = correo;
        this.rfc = rfc;
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

    public String getDomicilioFiscal() {
        return domicilioFiscal;
    }

    public void setDomicilioFiscal(String domicilioFiscal) {
        this.domicilioFiscal = domicilioFiscal;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }
    
}
