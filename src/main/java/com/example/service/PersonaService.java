package com.example.service;

import java.util.List;

import 	com.example.model.Persona;
public interface PersonaService {

	List<Persona> listar();
    Persona listarPorId(Integer id);
	Persona crear(Persona per);
	Persona modificar(Persona per);
	void eliminar(Integer id);
}