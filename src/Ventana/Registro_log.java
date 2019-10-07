/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventana;

/**
 *
 * @author kidiwnjt,Niclas
 * Se crean los datos del admin para luego trabajar con ellos
 * 
 */
public class Registro_log {

    /**
     * @return the usuario
     */
    public static String getUsuario() {
        return usuario;
    }

    /**
     * @param aUsuario the usuario to set
     */
    public static void setUsuario(String aUsuario) {
        usuario = aUsuario;
    }

    /**
     * @return the contraseña
     */
    public static String getContraseña() {
        return contraseña;
    }

    /**
     * @param aContraseña the contraseña to set
     */
    public static void setContraseña(String aContraseña) {
        contraseña = aContraseña;
    }
    
    private static String usuario="";
    private static String contraseña="";
    
    
}
