package com.example.demo.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.bean.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Long>{

}
