package com.example.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.api.models.Produto;
import com.example.api.repositories.ProdutoRepository;


@Service
public class ProdutoService {
	@Autowired
	private ProdutoRepository repository;

	public Produto findById(Long id) {
		java.util.Optional<Produto> obj = repository.findById(id);
		return obj.orElse(null);
	}

	public List<Produto> findAll() {
		return repository.findAll();
	}

	public Produto update(Long id, Produto obj) {
		Produto newObj = findById(id);
		newObj.setNome(obj.getNome());
		newObj.setValor(obj.getValor());
		newObj.setQauntidade(obj.getQuantidade());
		return repository.save(newObj);
	}
	
	public Produto create(Produto obj) {
		obj.setId(null);
		return repository.save(obj);
		}
	
	
	public void delete(Long id) {
		findById(id);
		repository.deleteById(id);
	}	
}
