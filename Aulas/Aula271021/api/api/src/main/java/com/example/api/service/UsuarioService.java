package com.example.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.api.models.Usuario;
import com.example.api.repositories.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository repository;

	public Usuario findById(Integer id) {
		java.util.Optional<Usuario> obj = repository.findById(id);
		return obj.orElse(null);
	}

	public List<Usuario> findAll() {
		return repository.findAll();
	}

	public Usuario update(Integer id, Usuario obj) {
		Usuario newObj = findById(id);
		newObj.setNome(obj.getNome());
		newObj.setSenha(obj.getSenha());
		return repository.save(obj);
	}
	
	public Usuario create(Usuario obj) {
		obj.setId(null);
		return repository.save(obj);
		}
	
	
	public void delete(Integer id) {
		findById(id);
		repository.deleteById(id);
	}	
	
	
}
