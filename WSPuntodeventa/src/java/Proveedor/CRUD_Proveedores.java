/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proveedor;

import Conexion.cnMySQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Jose Antonio
 */
public class CRUD_Proveedores {
     public ResultSet consulta() throws Exception{
     return queryr("call ver_proveedor");
     }
     public ResultSet buscarProveedor(String busqueda) throws Exception{
         
         return  queryr("call r_proveedor('" +'%' + busqueda + '%'+ "')");   
     }
     public void AltaProveedor(Proveedores p) throws Exception{
         query("call c_proveedor("  + "'"+p.getRazonSocial() +"'"+ inS(p.getDomicilioFiscal()) + inS(p.getTelefono()) + inS(p.getCorreo()) + inS(p.getRfc())+")");
         
     }
     public void bajaProveedor(Proveedores p) throws Exception{ 
           query("call d_proveedor('" + p.getIdProvedor() + "')");     
     }
     public void actualizarProveedor(Proveedores p) throws Exception{
         query("call u_proveedor('"+ p.getIdProvedor()+"'"+ inS(p.getRazonSocial()) + inS(p.getDomicilioFiscal()) + inS(p.getTelefono()) + inS(p.getCorreo()) + inS(p.getRfc()) +")");
          
     }
     public ResultSet queryr(String q) throws Exception{
        Connection connection = cnMySQL.getInstance().getConnection();
        PreparedStatement query = connection.prepareStatement(q);
        ResultSet datos = query.executeQuery();
        return datos;
    }
    public void query(String q) throws Exception{
        Connection connection = cnMySQL.getInstance().getConnection();
        PreparedStatement query = connection.prepareStatement(q);
        query.execute();
    }
    public String inS(String valor){
        return ",'"+valor+"'";
    }
}
