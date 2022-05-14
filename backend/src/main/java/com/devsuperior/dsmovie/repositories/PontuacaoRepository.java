package com.devsuperior.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmovie.entities.Pontuacao;
import com.devsuperior.dsmovie.entities.PontuacaoPK;

public interface PontuacaoRepository extends JpaRepository<Pontuacao, PontuacaoPK> {

}
