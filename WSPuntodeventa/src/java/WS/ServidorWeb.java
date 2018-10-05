/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WS;

import Catalogos.Departamento;
import Catalogos.Departamento_datos;
import Catalogos.Medida;
import Catalogos.Medida_datos;
import Catalogos.Proveedor;
import Catalogos.Proveedor_datos;
import Login.Login;
import Login.User;
import Producto.CRUD_Producto;
import Producto.Producto;
import Proveedor.CRUD_Proveedores;
import Proveedor.Proveedores;
import Usuario.CRUD_Usuario;
import Usuario.Usuario;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import static java.lang.Float.parseFloat;
import static java.lang.Integer.parseInt;
import java.lang.reflect.Type;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Jose Antonio
 */
@WebService(serviceName = "ServidorWeb")
public class ServidorWeb {
    //////////////////////////CATALOGOS///////////////////////////////
    @WebMethod(operationName = "cargarCatDepartamento")
    public String cargarCatDepartamento() {
        return getDatarCatDepartamento("Cargar","0");
    }
    @WebMethod(operationName = "cargarCatMedida")
    public String cargarCatMedida() {
        return getDatarCatMedida("Cargar","0");
    }
    @WebMethod(operationName = "cargarCatProveedor")
    public String cargarCatProveedor() {
        return getDatarCatProveedor("Cargar","0");
    }
    
    public String getDatarCatDepartamento(String accion,String id){
        Gson gson = new Gson();
        ResultSet rs=null;
        Departamento_datos db = new Departamento_datos();
        try{
            if(accion == "Cargar")
                rs = db.Cargar();
            ArrayList<Departamento> anim = new ArrayList();
            Departamento var_temp;
            while(rs.next()){
                var_temp = new Departamento(parseInt(rs.getString(1)),rs.getString(2));
                anim.add(var_temp);
            }
            String formatoJSON = gson.toJson(anim);
            return formatoJSON;
        }
        catch(Exception ex){
            return ex.getMessage();
        }
    }
    public String getDatarCatMedida(String accion,String id){
        Gson gson = new Gson();
        ResultSet rs=null;
        Medida_datos db = new Medida_datos();
        try{
            if(accion == "Cargar")
                rs = db.Cargar();
            ArrayList<Medida> anim = new ArrayList();
            Medida var_temp;
            while(rs.next()){
                var_temp = new Medida(parseInt(rs.getString(1)),rs.getString(2));
                anim.add(var_temp);
            }
            String formatoJSON = gson.toJson(anim);
            return formatoJSON;
        }
        catch(Exception ex){
            return ex.getMessage();
        }
    }
    
    public String getDatarCatProveedor(String accion,String id){
        Gson gson = new Gson();
        ResultSet rs=null;
        Proveedor_datos db = new Proveedor_datos();
        try{
            if(accion == "Cargar")
                rs = db.Cargar();
            ArrayList<Proveedor> anim = new ArrayList();
            Proveedor var_temp;
            while(rs.next()){
                var_temp = new Proveedor(parseInt(rs.getString(1)),rs.getString(2));
                anim.add(var_temp);
            }
            String formatoJSON = gson.toJson(anim);
            return formatoJSON;
        }
        catch(Exception ex){
            return ex.getMessage();
        }
    }
    //////////////////////////CATALOGOS///////////////////////////////
    @WebMethod(operationName = "cargarUsuario")
    public String cargar() {
        return getDatarUsuarios("Cargar","0");
    }
     @WebMethod(operationName = "altaUsuario")
    public String insertar(@WebParam(name="json")String json) {
        return getDataUsuarios("Insertar",json);
    }
    @WebMethod(operationName = "bajaUsuario")
    public String eliminar(@WebParam(name="json")String json) {
        return getDataUsuarios("Eliminar",json);
    }
    @WebMethod(operationName = "actualizarUsuario")
    public String actualizar(@WebParam(name="json")String json) {
        return getDataUsuarios("Actualizar",json);
    }
    @WebMethod(operationName = "buscarUsuario")
    public String buscarUsuario(@WebParam(name="nombre")String nombre) {
        return getBuscarUsuarios("Buscar", nombre);
    }
    
    @WebMethod(operationName = "cargarProveedor")
    public String cargarProveedor() {
        return getDatarProveedor("Cargar","0");
    }
     @WebMethod(operationName = "altaProveedor")
    public String insertarProveedor(@WebParam(name="json")String json) {
        return getDataProveedor("Insertar",json);
    }
    @WebMethod(operationName = "bajaProveedor")
    public String eliminarProveedor(@WebParam(name="json")String json) {
        return getDataProveedor("Eliminar",json);
    }
    @WebMethod(operationName = "actualizarProveedor")
    public String actualizarProveedor(@WebParam(name="json")String json) {
        return getDataProveedor("Actualizar",json);
    }
    @WebMethod(operationName = "buscarProveedor")
    public String buscarProveedor(@WebParam(name="nombre")String nombre) {
        return getBuscarProveedor("Buscar", nombre);
    }
    
    @WebMethod(operationName = "cargarProducto")
    public String cargarProducto() {
        return getDatarProducto("Cargar","0");
    }
     @WebMethod(operationName = "altaProducto")
    public String insertarProducto(@WebParam(name="json")String json) {
        return getDataProducto("Insertar",json);
    }
    @WebMethod(operationName = "bajaProducto")
    public String eliminarProducto(@WebParam(name="json")String json) {
        return getDataProducto("Eliminar",json);
    }
    @WebMethod(operationName = "actualizarProducto")
    public String actualizarProducto(@WebParam(name="json")String json) {
        return getDataProducto("Actualizar",json);
    }
    @WebMethod(operationName = "buscarProducto")
    public String buscarProducto(@WebParam(name="nombre")String nombre) {
        return getBuscarProducto("Buscar", nombre);
    }
    
    public String getDataUsuarios(String accion, String json){
        Gson gson = new Gson();
        CRUD_Usuario db = new  CRUD_Usuario();
        Type tipoObjeto = new TypeToken<List <Usuario>>(){}.getType();
        ArrayList<Usuario> usuario = gson.fromJson(json,tipoObjeto);
        Usuario p = usuario.get(0);
        try{
            if(accion == "Insertar")
                db.altaUsuario(p);
            else if (accion == "Eliminar")
                db.bajaUsuario(p);
            else if (accion == "Actualizar")
                db.actualizarUsuario(p);
            return "Accion exitosa.";
        }
        catch(Exception ex){
            return ex.getMessage();
        } 
    }
    public String getDatarUsuarios(String accion,String id){
        Gson gson = new Gson();
        ResultSet rs=null;
        CRUD_Usuario db = new CRUD_Usuario();
        try{
            if(accion == "Cargar")
                rs = db.consulta();
            ArrayList<Usuario> anim = new ArrayList();
            Usuario var_temp;
            while(rs.next()){
                var_temp = new Usuario(parseInt(rs.getString(1)),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),parseInt(rs.getString(9)));
                anim.add(var_temp);
            }
            String formatoJSON = gson.toJson(anim);
            return formatoJSON;
        }
        catch(Exception ex){
            return ex.getMessage();
        }
    }
     public String getBuscarUsuarios(String accion,String nombre){
        Gson gson = new Gson();
        ResultSet rs=null;
        CRUD_Usuario db = new CRUD_Usuario();
        try{
            if(accion == "Buscar")
                rs = db.buscarUsuario(nombre);
            ArrayList<Usuario> anim = new ArrayList();
            Usuario var_temp;
            while(rs.next()){
                var_temp = new Usuario(parseInt(rs.getString(1)),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),parseInt(rs.getString(9)));
                anim.add(var_temp);
            }
            String formatoJSON = gson.toJson(anim);
            return formatoJSON;
        }
        catch(Exception ex){
            return ex.getMessage();
        }
    }
    //////////////////////////
    @WebMethod(operationName = "buscarLogin")
    public String buscarLogin(@WebParam(name="id")int id,@WebParam(name="password")String password) {
        return getDatarLogin("Buscar",id, password);
    }
    public String getDatarLogin(String accion,int id, String password){
        Gson gson = new Gson();
        ResultSet rs=null;
        Login db = new Login();
        try{
            if(accion == "Buscar")
                rs = db.Buscar(id, password);
            ArrayList<User> anim = new ArrayList();
            User var_temp;
            while(rs.next()){
                var_temp = new User(parseInt(rs.getString(1)),rs.getString(3),parseInt(rs.getString(9)),rs.getString(4));
                anim.add(var_temp);
            }
            String formatoJSON = gson.toJson(anim);
            return formatoJSON;
        }
        catch(Exception ex){
            return ex.getMessage();
        }
    }
    
    ////////////////////////////////////////PROVEEDORES///////////////////7//////////////////
    
    public String getDataProveedor(String accion, String json){
        Gson gson = new Gson();
        CRUD_Proveedores db = new CRUD_Proveedores();
        Type tipoObjeto = new TypeToken<List <Proveedores>>(){}.getType();
        ArrayList<Proveedores> proveedor = gson.fromJson(json,tipoObjeto);
        Proveedores p = proveedor.get(0);
        try{
            if(accion == "Insertar")
                db.AltaProveedor(p);
            else if (accion == "Eliminar")
                db.bajaProveedor(p);
            else if (accion == "Actualizar")
                db.actualizarProveedor(p);
            return "Accion exitosa.";
        }
        catch(Exception ex){
            return ex.getMessage();
        } 
    }
    public String getDatarProveedor(String accion,String id){
        Gson gson = new Gson();
        ResultSet rs=null;
        CRUD_Proveedores db = new CRUD_Proveedores();
        try{
            if(accion == "Cargar")
                rs = db.consulta();
            ArrayList<Proveedores> anim = new ArrayList();
            Proveedores var_temp;
            while(rs.next()){
                var_temp = new Proveedores(parseInt(rs.getString(1)),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6));
                anim.add(var_temp);
            }
            String formatoJSON = gson.toJson(anim);
            return formatoJSON;
        }
        catch(Exception ex){
            return ex.getMessage();
        }
    }
    public String getBuscarProveedor(String accion,String nombre){
        Gson gson = new Gson();
        ResultSet rs=null;
        CRUD_Proveedores db = new CRUD_Proveedores();
        try{
            if(accion == "Buscar")
                rs = db.buscarProveedor(nombre);
            ArrayList<Proveedores> anim = new ArrayList();
            Proveedores var_temp;
            while(rs.next()){
                var_temp = new Proveedores(parseInt(rs.getString(1)),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6));
                anim.add(var_temp);
            }
            String formatoJSON = gson.toJson(anim);
            return formatoJSON;
        }
        catch(Exception ex){
            return ex.getMessage();
        }
    }

    //////////////////////
    
    public String getDataProducto(String accion, String json){
        Gson gson = new Gson();
        CRUD_Producto db = new CRUD_Producto();
        Type tipoObjeto = new TypeToken<List <Producto>>(){}.getType();
        ArrayList<Producto> producto = gson.fromJson(json,tipoObjeto);
        Producto p = producto.get(0);
        try{
            if(accion == "Insertar")
                db.AltaProducto(p);
            else if (accion == "Eliminar")
                db.bajaProducto(p);
            else if (accion == "Actualizar")
                db.actualizarProducto(p);
            return "Accion exitosa.";
        }
        catch(Exception ex){
            return ex.getMessage();
        } 
    }
    public String getDatarProducto(String accion,String id){
        Gson gson = new Gson();
        ResultSet rs=null;
        CRUD_Producto db = new CRUD_Producto();
        try{
            if(accion == "Cargar")
                rs = db.consultaProducto();
            ArrayList<Producto> anim = new ArrayList();
            Producto var_temp;
            while(rs.next()){
                var_temp = new Producto(parseInt(rs.getString(1)),rs.getString(2),rs.getString(3),rs.getString(4),parseFloat(rs.getString(5)),parseFloat(rs.getString(6)),rs.getString(7),parseInt(rs.getString(8)),parseInt(rs.getString(9)),parseInt(rs.getString(10)),parseInt(rs.getString(11)));
                anim.add(var_temp);
            }
            String formatoJSON = gson.toJson(anim);
            return formatoJSON;
        }
        catch(Exception ex){
            return ex.getMessage();
        }
    }
    public String getBuscarProducto(String accion,String nombre){
        Gson gson = new Gson();
        ResultSet rs=null;
        CRUD_Producto db = new CRUD_Producto();
        try{
            if(accion == "Buscar")
                rs = db.buscarProducto(nombre);
            ArrayList<Producto> anim = new ArrayList();
            Producto var_temp;
            while(rs.next()){
                var_temp = new Producto(parseInt(rs.getString(1)),rs.getString(2),rs.getString(3),rs.getString(4),parseFloat(rs.getString(5)),parseFloat(rs.getString(6)),rs.getString(7),parseInt(rs.getString(8)),parseInt(rs.getString(9)),parseInt(rs.getString(10)),parseInt(rs.getString(11)));
                anim.add(var_temp);
            }
            String formatoJSON = gson.toJson(anim);
            return formatoJSON;
        }
        catch(Exception ex){
            return ex.getMessage();
        }
    }
}
