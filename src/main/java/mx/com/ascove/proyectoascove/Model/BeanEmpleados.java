package mx.com.ascove.proyectoascove.Model;

import mx.com.ascove.proyectoascove.Model.Roles.BeanRoles;
import mx.com.ascove.proyectoascove.Model.Usuario.BeanUsuario;

public class BeanEmpleados {

    private int idEmpleados;
    private String nombreEmpleados;
    private String aPaterno;
    private String aMaterno;
    private String calle;
    private String colonia;
    private int municipio;
    private int usuario;
    private String correo;
    private String contra;
    private int idRoles;
    private int estado;

    public BeanEmpleados() {
    }

    public BeanEmpleados(int idEmpleados, String nombreEmpleados, String aPaterno, String aMaterno, String calle, String colonia, int municipio, int usuario, String correo, String contra, int idRoles, int estado) {
        this.idEmpleados = idEmpleados;
        this.nombreEmpleados = nombreEmpleados;
        this.aPaterno = aPaterno;
        this.aMaterno = aMaterno;
        this.calle = calle;
        this.colonia = colonia;
        this.municipio = municipio;
        this.usuario = usuario;
        this.correo = correo;
        this.contra = contra;
        this.idRoles = idRoles;
        this.estado = estado;
    }

    public int getIdEmpleados() {
        return idEmpleados;
    }

    public void setIdEmpleados(int idEmpleados) {
        this.idEmpleados = idEmpleados;
    }

    public String getNombreEmpleados() {
        return nombreEmpleados;
    }

    public void setNombreEmpleados(String nombreEmpleados) {
        this.nombreEmpleados = nombreEmpleados;
    }

    public String getaPaterno() {
        return aPaterno;
    }

    public void setaPaterno(String aPaterno) {
        this.aPaterno = aPaterno;
    }

    public String getaMaterno() {
        return aMaterno;
    }

    public void setaMaterno(String aMaterno) {
        this.aMaterno = aMaterno;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public int getMunicipio() {
        return municipio;
    }

    public void setMunicipio(int municipio) {
        this.municipio = municipio;
    }

    public int getUsuario() {
        return usuario;
    }

    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public int getIdRoles() {
        return idRoles;
    }

    public void setIdRoles(int idRoles) {
        this.idRoles = idRoles;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}
