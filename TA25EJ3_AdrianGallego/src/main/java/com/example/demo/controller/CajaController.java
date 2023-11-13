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

import com.example.demo.dto.Caja;
import com.example.demo.service.CajaServiceImpl;

@RestController
@RequestMapping("/api")
public class CajaController {
	
	@Autowired
	CajaServiceImpl cajaSer;
	
	@GetMapping("/caja")
	public List<Caja> listarCajas(){
		return cajaSer.listarCajas();
	}
	
	@GetMapping("/caja/{id}")
	public Caja listarCajaById(@PathVariable(name="id") Integer id) {
		return cajaSer.listarCajasById(id);
	}
	
	@PostMapping("/caja")
	public Caja guardarCaja(@RequestBody Caja caja) {
		return cajaSer.guardarNuevo(caja);
	}
	
	@PutMapping("/caja/{id}")
	public Caja actualizarCaja (@PathVariable(name="id")Integer id, @RequestBody Caja caja) {
		Caja c1 = cajaSer.listarCajasById(id);
		Caja c2 = new Caja();
		
		c1.setCodigo(caja.getCodigo());
		c1.setContenido(caja.getContenido());
		c1.setAlmacen(caja.getAlmacen());
		c1.setNum_referencia(caja.getNum_referencia());
		c1.setValor(caja.getValor());
		
		c2 = cajaSer.actualizarCaja(c1);
		return c2;
	}
	
	@DeleteMapping("/caja/{id}")
	public void deleteCaja(@PathVariable(name="id") Integer id) {
		cajaSer.deleteCaja(id);
	}

}
