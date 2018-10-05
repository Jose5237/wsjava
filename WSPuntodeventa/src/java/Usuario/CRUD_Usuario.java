/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuario;

import Conexion.cnMySQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Jose Antonio
 */
public class CRUD_Usuario {
    public ResultSet consulta() throws Exception{
     return queryr("call ver_usuario");
     }
    public ResultSet buscarUsuario(String busqueda) throws Exception{
         
         return  queryr("call r_usuario('" +'%' + busqueda + '%'+ "')");   
     }
      public void bajaUsuario(Usuario u) throws Exception{
          query("call d_usuario('" + u.getIdUsuario() + "')");     
     }
      public void actualizarUsuario(Usuario u) throws Exception{
          query("call u_usuario("  + "'"+u.getNombre() +"'"+ inS(u.getApellido()) + inS(u.getFecha_nacimiento()) + inS(u.getDireccion()) + inS(u.getTelefono()) + inS(u.getCorreo()) + inS(u.getPassword())  +","+ u.getPermiso() +","+ u.getIdUsuario()+")");
     }
      public void altaUsuario(Usuario u) throws Exception{
          query("call c_usuario("  + "'"+u.getNombre() +"'"+ inS(u.getApellido()) + inS(u.getFecha_nacimiento()) + inS(u.getDireccion()) + inS(u.getTelefono()) + inS(u.getCorreo()) + inS(u.getPassword())  +","+ u.getPermiso() +")");
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
