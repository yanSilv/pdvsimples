package com.yansi.pdv.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yansi.pdv.domin.Produto;
import com.yansi.pdv.repository.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository repo;
	
	public List<Produto> findAll() {
		return repo.findAll();
	}
}
