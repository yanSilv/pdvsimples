package com.yansi.pdv.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yansi.pdv.domin.Produto;
import com.yansi.pdv.service.ProdutoService;

@RestController
@RequestMapping("/produtos")
public class ProdutoResource {

	
	@Autowired
	private ProdutoService produtosService;
	
	@GetMapping
	public List<Produto> findAll () {
		return produtosService.findAll();
	}
}
