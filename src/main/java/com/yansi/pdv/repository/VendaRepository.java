package com.yansi.pdv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yansi.pdv.domin.Venda;

@Repository
public interface VendaRepository extends JpaRepository<Venda, Integer>{

}
