package com.yansi.pdv.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yansi.pdv.domin.Cliente;
import com.yansi.pdv.service.ClienteService;

@CrossOrigin("*")
@RestController
@RequestMapping("/clientes")
public class ClienteResource {

	@Autowired
	private ClienteService clienteService;
	
	@GetMapping
	public List<Cliente> findAll () {
		return clienteService.findAll();
	}
}
