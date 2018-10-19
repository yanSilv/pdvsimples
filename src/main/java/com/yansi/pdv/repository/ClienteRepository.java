package com.yansi.pdv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yansi.pdv.domin.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
