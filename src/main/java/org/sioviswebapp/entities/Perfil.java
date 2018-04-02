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
@Table(name = "PERFIL", uniqueConstraints = {
        @UniqueConstraint(columnNames = "perfil_pk")})
@Inheritance(strategy=InheritanceType.JOINED)
public class Perfil {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	@Column(name="perfil_pk")
	private int perfilPk;
	
	@Column(name = "nombre", nullable = false)
	private String nombre;
	
	@Column(name = "estado", nullable = true)
	private int estado;
	
	@Column(name = "usuario_registro", nullable = true)
	private int usuarioRegistro;
	
	@Column(name = "fecha_registro", nullable = true)
	private Date fechaRegistro;
	
	@Column(name = "usuario_modifico", nullable = true)
	private int usuarioModifico;
	
	@Column(name = "fecha_modifico", nullable = true)
	private Date fechaMdifico;
	
	@OneToMany(mappedBy="perfil")
    private Set<PerfilUsuario> perfilUsuario;
	
//	@OneToMany(mappedBy="perfil")
//    private Set<PerfilMenu> perfilMenu;

	public int getPerfilPk() {
		return perfilPk;
	}

	public void setPerfilPk(int perfilPk) {
		this.perfilPk = perfilPk;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public int getUsuarioRegistro() {
		return usuarioRegistro;
	}

	public void setUsuarioRegistro(int usuarioRegistro) {
		this.usuarioRegistro = usuarioRegistro;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public int getUsuarioModifico() {
		return usuarioModifico;
	}

	public void setUsuarioModifico(int usuarioModifico) {
		this.usuarioModifico = usuarioModifico;
	}

	public Date getFechaMdifico() {
		return fechaMdifico;
	}

	public void setFechaMdifico(Date fechaMdifico) {
		this.fechaMdifico = fechaMdifico;
	}
	
	
}
