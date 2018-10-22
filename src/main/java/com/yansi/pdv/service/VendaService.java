package com.yansi.pdv.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yansi.pdv.domin.Venda;
import com.yansi.pdv.repository.ProdutoRepository;
import com.yansi.pdv.repository.VendaRepository;

@Service
public class VendaService {

	@Autowired
	private VendaRepository repo;
	
	@Autowired
	private ProdutoRepository produtoRepo;
	
	public List<Venda> findAll () {
		return repo.findAll();
	}
	
	public Venda save (Venda obj) {
		return repo.save(obj);
	}

	public Venda adicionar(Venda obj) {
		obj.setCadastro(LocalDateTime.now());
		obj.getItens().forEach(i -> {
			i.setVenda(obj);
			i.setProduto(produtoRepo.findById(i.getProduto().getId()).get());
		});
		
		BigDecimal totalItens = obj.getItens().stream()
				.map(i -> i.getProduto().getValor().multiply(new BigDecimal(i.getQuantidade())))
				.reduce(BigDecimal.ZERO, BigDecimal::add);
		
		obj.setTotal(totalItens.add(obj.getFrete()));
		
		return save(obj);
	}
	
}
