package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.PersonaDAO;
import com.example.model.Persona;

@Service
public class PersonaServiceImpl implements PersonaService {
	
	@Autowired
	private PersonaDAO dao;

	@Override
	public List<Persona> listar() {
		
		return dao.findAll();
	}

	@Override
	public Persona crear(Persona per) {
		
		return dao.save(per);
	}

	@Override
	public Persona modificar(Persona per) {

		return dao.save(per);
	}

	@Override
	public void eliminar(Integer id) {
		dao.deleteById(id);
		
	}


	@Override
	public Persona listarPorId(Integer id) {
		return dao.findById(id).get();
	}

	

	

}
