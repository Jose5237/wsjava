/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Catalogos;

import Conexion.cnMySQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author mara_
 */
public class Departamento_datos {
    public ResultSet Cargar() throws Exception{
        return queryr("call catalogoDepartamento()");
    }
    
    public ResultSet queryr(String q) throws Exception{
        Connection connection = cnMySQL.getInstance().getConnection();
        PreparedStatement query = connection.prepareStatement(q);
        ResultSet datos = query.executeQuery();
        return datos;
    }
}
