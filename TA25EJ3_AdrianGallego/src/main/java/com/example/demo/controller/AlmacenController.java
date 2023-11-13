package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Almacen;
import com.example.demo.service.AlmacenServiceImpl;

@RestController
@RequestMapping("/api")
public class AlmacenController {
	
	@Autowired
	AlmacenServiceImpl almacenSer;
	
	@GetMapping("/almacenes")
	public List<Almacen> listarAlmacenes(){
		return almacenSer.listarAlmacenes();
	}
	
	@GetMapping("/almacenes/{id}")
	public Almacen listarAlmacenById(@PathVariable(name="id") Integer id) {
		return almacenSer.listarAlmacenById(id);
	}
	
	@PostMapping("/almacenes")
	public Almacen guardarNuevo(@RequestBody Almacen a) {
		return almacenSer.guardarNuevo(a);
	}
	
	@PutMapping("/almacenes/{id}")
	public Almacen actualizarAlmacen(@PathVariable(name="id") Integer id, @RequestBody Almacen a) {
		Almacen a1 = almacenSer.listarAlmacenById(id);
		Almacen a2 = new Almacen();
		
		a1.setCodigo(a.getCodigo());
		a1.setLugar(a.getLugar());
		a1.setCapacidad(a.getCapacidad());
		
		a2 = almacenSer.actualizarAlmacen(a1);
		
		return a2;
	}
	
	@DeleteMapping("/almacenes/{id}")
	public void deleteAlmacenes(@PathVariable(name="id") Integer id) {
		almacenSer.deleteAlmacen(id);
	}

}
