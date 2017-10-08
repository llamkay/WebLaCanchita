package com.llamkay.WebLaCanchita.dominio;

public class Usuario {
	
	private long IdUsuario;
	private String Apellido;
	private String Nombres;
	private String Alias;
	private String NroTelefono;
	
	
	public long getIdUsuario() {
		return IdUsuario;
	}
	public void setIdUsuario(long IdUsuario) {
		this.IdUsuario = IdUsuario;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	public String getNombres() {
		return Nombres;
	}
	public void setNombres(String nombres) {
		Nombres = nombres;
	}
	public String getAlias() {
		return Alias;
	}
	public void setAlias(String alias) {
		Alias = alias;
	}
	public String getNroTelefono() {
		return NroTelefono;
	}
	public void setNroTelefono(String nroTelefono) {
		NroTelefono = nroTelefono;
	}
	
	public Usuario() {
	
	}
	
	
	

}
