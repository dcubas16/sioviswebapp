package org.sioviswebapp.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "perfil_usuario", uniqueConstraints = {
        @UniqueConstraint(columnNames = "perfil_usuario_pk")})
@Inheritance(strategy=InheritanceType.JOINED)
public class PerfilUsuario {

	@ManyToOne
    @JoinColumn(name="usuario_pk", nullable=false)
    private Usuario usuario;
 
	@ManyToOne
    @JoinColumn(name="perfil_pk", nullable=false)
    private Perfil perfil;
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	@Column(name = "perfil_usuario_pk", nullable = false)
	private int perfilUsuarioPk;
	
	@Column(name = "estado", nullable = false)
	private int estado;
	
	@Column(name = "usuario_registro", nullable = false)
	private int usuarioRegistro;
	
	@Column(name = "fecha_registro", nullable = false)
	private Date fechaRegistro;
	
	@Column(name = "usuario_modifico", nullable = true)
	private int usuarioModifico;
	
	@Column(name = "fecha_modifico", nullable = true)
	private Date fechaModifico;
	

	public int getPerfilUsuarioPk() {
		return perfilUsuarioPk;
	}

	public void setPerfilUsuarioPk(int perfilUsuarioPk) {
		this.perfilUsuarioPk = perfilUsuarioPk;
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

	public Date getFechaModifico() {
		return fechaModifico;
	}

	public void setFechaModifico(Date fechaModifico) {
		this.fechaModifico = fechaModifico;
	}
	
}
