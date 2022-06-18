package com.example.diegogallegos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.diegogallegos.model.PicoPlaca;
import com.example.diegogallegos.service.IPicoPlacaService;

@RestController
@RequestMapping(value = "/picoplaca")
@CrossOrigin(origins = "*")
public class PicoPlacaController {

	@Autowired
	private IPicoPlacaService picoPlacaService;

	@GetMapping("/listar")
	public List<PicoPlaca> findall() {
		return picoPlacaService.listAll();
	}

	@PostMapping("/registrar")
	public String save(@RequestBody PicoPlaca picoPlaca) {
		picoPlacaService.save(picoPlaca);
		return "registro guardado";
	}

	@DeleteMapping("/eliminar/{id}")
	public String delete(@PathVariable Long id) {
		try {
			picoPlacaService.delete(id);
			return "Registro Eliminado";
		} catch (Exception e) {
			return "ERROR no se puede eliminar";
		}
	}

}
