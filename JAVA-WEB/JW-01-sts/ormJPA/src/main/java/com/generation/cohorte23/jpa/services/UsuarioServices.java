package com.generation.cohorte23.jpa.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation.cohorte23.jpa.models.UsuarioModel;
import com.generation.cohorte23.jpa.repositories.UsuarioRepositorio;

@Service
public class UsuarioServices {
	@Autowired
	UsuarioRepositorio usuariorepositorio;

	public ArrayList<UsuarioModel> busquedaPorPrioridad(Integer prioridad) {
		return usuariorepositorio.findByPrioridad(prioridad);
	}

	public ArrayList<UsuarioModel> ListarUsuarios() {
		return (ArrayList<UsuarioModel>) usuariorepositorio.findAll();
	}
	
	public UsuarioModel guardarUsuario(UsuarioModel usuario) {
		return usuariorepositorio.save(usuario);
	}
}
