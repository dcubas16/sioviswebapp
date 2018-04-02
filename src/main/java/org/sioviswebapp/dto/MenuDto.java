package org.sioviswebapp.dto;

import java.util.Date;

public class MenuDto {
	
	private int menuPk;
	private int codigoPadre;
	private String ventana;
	private String url;
	private String usuarioRegistro;
	private Date fechaRegistro;
	private String usuarioModifica;
	private Date fechaModifica;
	private int estado;
	
	public int getMenuPk() {
		return menuPk;
	}
	public int getCodigoPadre() {
		return codigoPadre;
	}
	public String getVentana() {
		return ventana;
	}
	public String getUsuarioRegistro() {
		return usuarioRegistro;
	}
	public Date getFechaRegistro() {
		return fechaRegistro;
	}
	public String getUsuarioModifica() {
		return usuarioModifica;
	}
	public Date getFechaModifica() {
		return fechaModifica;
	}
	public int getEstado() {
		return estado;
	}
	public void setMenuPk(int menuPk) {
		this.menuPk = menuPk;
	}
	public void setCodigoPadre(int codigoPadre) {
		this.codigoPadre = codigoPadre;
	}
	public void setVentana(String ventana) {
		this.ventana = ventana;
	}
	public void setUsuarioRegistro(String usuarioRegistro) {
		this.usuarioRegistro = usuarioRegistro;
	}
	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	public void setUsuarioModifica(String usuarioModifica) {
		this.usuarioModifica = usuarioModifica;
	}
	public void setFechaModifica(Date fechaModifica) {
		this.fechaModifica = fechaModifica;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
