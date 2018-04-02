package org.sioviswebapp.dto;

import java.util.ArrayList;
import java.util.List;

public class ListaMenuDto {

	private List<MenuDto> menus = new ArrayList<>();

	public List<MenuDto> getMenus() {
		return menus;
	}

	public void setMenus(List<MenuDto> menus) {
		this.menus = menus;
	}

	
}
