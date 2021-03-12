package com.example.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.cursomc.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

}
