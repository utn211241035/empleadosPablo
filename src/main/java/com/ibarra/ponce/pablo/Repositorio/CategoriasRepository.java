package com.ibarra.ponce.pablo.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibarra.ponce.pablo.Model.Categoria;


public interface CategoriasRepository extends JpaRepository <Categoria, Integer> {
	
}
