package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Caja;

public interface ICajaService {

	public List<Caja> listarCajas();
	
	public Caja listarCajasById(Integer id);
	
	public Caja guardarNuevo(Caja caja);
	
	public Caja actualizarCaja(Caja caja);
	
	public void deleteCaja(Integer id);

}
