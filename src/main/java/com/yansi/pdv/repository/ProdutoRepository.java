package com.yansi.pdv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.yansi.pdv.domin.Produto;

@Service
public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

}
