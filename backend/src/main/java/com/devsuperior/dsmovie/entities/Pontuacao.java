package com.devsuperior.dsmovie.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_pontuacao")
public class Pontuacao {

	@EmbeddedId
	private PontuacaoPK id = new PontuacaoPK();
	
	private Double valor;
	
	public Pontuacao() {}
	
	public void setMovie(Movie movie) {
		id.setMovie(movie);
	}
	
	public void setUsuario(Usuario usuario) {
		id.setUsuario(usuario);
	}

	public PontuacaoPK getId() {
		return id;
	}

	public void setId(PontuacaoPK id) {
		this.id = id;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	
	
}
