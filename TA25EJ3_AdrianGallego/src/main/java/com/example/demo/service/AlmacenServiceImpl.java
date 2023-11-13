package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IAlmacenDAO;
import com.example.demo.dto.Almacen;

@Service
public class AlmacenServiceImpl implements IAlmacenService{

	@Autowired
	IAlmacenDAO dao;
	
	@Override
	public List<Almacen> listarAlmacenes() {
		return dao.findAll();
	}

	@Override
	public Almacen listarAlmacenById(Integer id) {
		return dao.findById(id).get();
	}

	@Override
	public Almacen guardarNuevo(Almacen a) {
		return dao.save(a);
	}

	@Override
	public Almacen actualizarAlmacen(Almacen a) {
		return dao.save(a);
	}

	@Override
	public void deleteAlmacen(Integer id) {
		dao.deleteById(id);
		
	}

}
