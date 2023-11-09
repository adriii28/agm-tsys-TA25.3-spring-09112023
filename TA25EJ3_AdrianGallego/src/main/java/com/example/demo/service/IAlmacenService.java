package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Almacen;

public interface IAlmacenService {
	
	public List<Almacen> listarAlmacenes();
	
	public Almacen listarAlmacenById(Integer id);
	
	public Almacen guardarNuevo(Almacen a);

	public Almacen actualizarAlmacen(Almacen a);

	public void deleteAlmacen(Integer id);
}
