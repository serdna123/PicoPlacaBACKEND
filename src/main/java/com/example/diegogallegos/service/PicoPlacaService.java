package com.example.diegogallegos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.diegogallegos.model.PicoPlaca;
import com.example.diegogallegos.repository.PicoPlacaRepository;

@Service
public class PicoPlacaService implements IPicoPlacaService{
	
	@Autowired
	private PicoPlacaRepository picoPlacaRepo;

	@Override
	public void save(PicoPlaca picoPlaca) {
		picoPlacaRepo.save(picoPlaca);
	}

	@Override
	public void delete(Long id) {
		picoPlacaRepo.deleteById(id);
	}

	@Override
	public List<PicoPlaca> listAll() {
		return picoPlacaRepo.findAll();
	}

	@Override
	public PicoPlaca searchById(Long id) {
		return picoPlacaRepo.findById(id).get();
	}
	
	

}
