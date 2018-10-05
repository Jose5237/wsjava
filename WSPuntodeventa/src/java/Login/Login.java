/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import Conexion.cnMySQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author mara_
 */
public class Login {
    public ResultSet Buscar(int id, String password) throws Exception{
        return queryr("select idUsuario, password, permiso, nombre from usuario where idUsuario = "+id+" and password ='"+password+"';");
    }
    
    public ResultSet queryr(String q) throws Exception{
        Connection connection = cnMySQL.getInstance().getConnection();
        PreparedStatement query = connection.prepareStatement(q);
        ResultSet datos = query.executeQuery();
        return datos;
    }
}
