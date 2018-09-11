package com.beugenio.AtividadeSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.beugenio.AtividadeSpring.domain.Endereco;
 
@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {
 }