/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Producto;

import Conexion.cnMySQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Jose Antonio
 */
public class CRUD_Producto {
     public ResultSet consultaProducto() throws Exception{
         return queryr("call ver_producto");
     }
     public ResultSet buscarProducto(String busqueda) throws Exception{
         return  queryr("call r_producto('" +'%' + busqueda + '%'+ "')");   
     }
     public void AltaProducto(Producto p) throws Exception{
         query("call c_producto("  + "'"+p.getNombre() +"'"+ inS(p.getMarca()) + inS(p.getDescripcion()) +","+ p.getPrecioVenta() +","+ p.getPrecioCompra()+ inS(p.getCaducidad())  +","+ p.getStock() +","+ p.getMedida_idMedida()+","+ p.getDepartamento_idDepartamento()+","+p.getProvedor_idProvedor()+")");
     }
     public void bajaProducto(Producto p) throws Exception{
         query("call d_producto('" + p.getIdProducto() + "')");
     }
     public void actualizarProducto(Producto p) throws Exception{
         query("call u_producto('"+ p.getIdProducto() + "'"+ inS(p.getNombre()) + inS(p.getMarca()) + inS(p.getDescripcion()) +","+ p.getPrecioVenta()+"," + p.getPrecioCompra()+ inS(p.getCaducidad())  +","+ p.getStock() +","+ p.getMedida_idMedida()+","+ p.getDepartamento_idDepartamento()+","+p.getProvedor_idProvedor()+")");
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
