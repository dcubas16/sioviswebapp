package org.sioviswebapp.entities;

import java.util.Date;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "USUARIO", uniqueConstraints = {
        @UniqueConstraint(columnNames = "usuario_pk")})
@Inheritance(strategy=InheritanceType.JOINED)
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	@Column(name="usuario_pk")
	private int usuarioPk;
	
	@Column(name = "usuario_registro", nullable = false)
	private String usuarioRegistro;
	
	@Column(name = "fecha_registro", nullable = false)
	private Date fechaRegistro;
	
	@Column(name = "usuario_modifico", nullable = true)
	private String usuarioModifico;
	
	@Column(name = "fecha_modifico", nullable = true)
	private Date fechaModifico;
	
	@Column(name = "estado", nullable = true)
	private int estado;
	
	@Column(name = "login", nullable = false)
	private String login;
	
	@Column(name = "contrasena", nullable = false)
	private String contrasenia;
	
	@Column(name = "apellido_pat", nullable = false)
	private String apellidoPat;
	
	@Column(name = "apellido_mat", nullable = false)
	private String apellidoMat;
	
	@Column(name = "nombre", nullable = false)
	private String nombre;
	
	@Column(name = "correo", nullable = false)
	private String correo;
	
	@Column(name = "telefono", nullable = true)
	private String telefono;
	
	@Column(name = "celular", nullable = false)
	private String celular;
	
	@Column(name = "fecha_nacimiento", nullable = false)
	private Date fechaNacimiento;
	
	@Column(name = "tipo", nullable = false)
	private int tipo;
	
	
	@OneToMany(mappedBy="usuario")
    private Set<PerfilUsuario> perfilUsuario;
	
	
	public int getUsuarioPk() {
		return usuarioPk;
	}
	public void setUsuarioPk(int usuarioPk) {
		this.usuarioPk = usuarioPk;
	}
	public String getUsuarioRegistro() {
		return usuarioRegistro;
	}
	public void setUsuarioRegistro(String usuarioRegistro) {
		this.usuarioRegistro = usuarioRegistro;
	}
	public Date getFechaRegistro() {
		return fechaRegistro;
	}
	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	public String getUsuarioModifico() {
		return usuarioModifico;
	}
	public void setUsuarioModifico(String usuarioModifico) {
		this.usuarioModifico = usuarioModifico;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getContrasenia() {
		return contrasenia;
	}
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
	public String getApellidoPat() {
		return apellidoPat;
	}
	public void setApellidoPat(String apellidoPat) {
		this.apellidoPat = apellidoPat;
	}
	public String getApellidoMat() {
		return apellidoMat;
	}
	public void setApellidoMat(String apellidoMat) {
		this.apellidoMat = apellidoMat;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}


}
