package com.example.diegogallegos.service;

import java.util.List;

import com.example.diegogallegos.model.PicoPlaca;

public interface IPicoPlacaService {

	void save(PicoPlaca picoPlaca);
	void delete(Long id);
	List<PicoPlaca> listAll();
	PicoPlaca searchById(Long id);
}
