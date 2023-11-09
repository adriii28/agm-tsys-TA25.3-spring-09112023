package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ICajaDAO;
import com.example.demo.dto.Caja;

@Service
public class CajaServiceImpl implements ICajaService{

	@Autowired
	ICajaDAO dao;
	
	@Override
	public List<Caja> listarCajas() {
		return dao.findAll();
	}

	@Override
	public Caja listarCajasById(Integer id) {
		return dao.findById(id).get();
	}

	@Override
	public Caja guardarNuevo(Caja caja) {
		return dao.save(caja);
	}

	@Override
	public Caja actualizarCaja(Caja caja) {
		return dao.save(caja);
	}

	@Override
	public void deleteCaja(Integer id) {
		dao.deleteById(id);
		
	}

}
