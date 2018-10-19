package com.yansi.pdv.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yansi.pdv.domin.Venda;
import com.yansi.pdv.repository.VendaRepository;

@Service
public class VendaService {

	@Autowired
	private VendaRepository repo;
	
	public List<Venda> findAll () {
		return repo.findAll();
	}
	
}
