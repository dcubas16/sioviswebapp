package org.sioviswebapp.dto;

import java.util.ArrayList;
import java.util.List;

public class MenusInicializadores {

	public MenuDto obtenerMenu1() {
		MenuDto menuDto = new MenuDto();
		menuDto.setMenuPk(1);
		menuDto.setVentana("Menu 1");
		menuDto.setUrl("sioviswebapp");
		return menuDto;
		
	}
	
	public MenuDto obtenerMenu1Hijo() {
		MenuDto menuDto = new MenuDto();
		menuDto.setMenuPk(3);
		menuDto.setVentana("Menu 1 Hijo");
		menuDto.setUrl("sioviswebapp");
		return menuDto;
		
	}
	
	public MenuDto obtenerMenu2() {
		MenuDto menuDto = new MenuDto();
		menuDto.setMenuPk(2);
		menuDto.setVentana("Menu 2");
		menuDto.setUrl("sioviswebapp");
		return menuDto;
	}
	
	public List<MenuDto> obtenerListaMenu(){
		List<MenuDto> menuDtos = new ArrayList<>();
		menuDtos.add(obtenerMenu1());
		menuDtos.add(obtenerMenu1Hijo());
		menuDtos.add(obtenerMenu2());
		
		return menuDtos;
	}
	
	
}
