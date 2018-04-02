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
@Table(name = "OPCION", uniqueConstraints = {
        @UniqueConstraint(columnNames = "opcion_pk")})
@Inheritance(strategy=InheritanceType.JOINED)
public class Opcion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	@Column(name="opcion_pk")
	private int opcion_pk;
	
	@Column(name = "nombre", nullable = false)
	private String nombre;
	
	@Column(name = "tipo", nullable = true)
	private int tipo;
	
	@Column(name = "usuario_registro", nullable = false)
	private String usuarioRegistro;
	
	@Column(name = "fecha_registro", nullable = false)
	private Date fechaRegistro;
	
	@Column(name = "usuario_modifico", nullable = true)
	private String usuarioModifico;
	
	@Column(name = "fecha_modifico", nullable = true)
	private Date fechaModifico;
	
	@Column(name = "estado", nullable = false)
	private int estado;
	
	@OneToMany(mappedBy="opcion")
    private Set<MenuOpcion> menuOpcion;

	public int getOpcion_pk() {
		return opcion_pk;
	}

	public void setOpcion_pk(int opcion_pk) {
		this.opcion_pk = opcion_pk;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
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

	public Date getFechaModifico() {
		return fechaModifico;
	}

	public void setFechaModifico(Date fechaModifico) {
		this.fechaModifico = fechaModifico;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}
	
}
