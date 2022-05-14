package com.devsuperior.dsmovie.dto;

public class PontuacaoDTO {
	
	private Long movieid;
	private String email;
	private Double pontuacao;
	
	public PontuacaoDTO() {}

	
	public Long getMovieid() {
		return movieid;
	}

	public void setMovieid(Long movieid) {
		this.movieid = movieid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(Double pontuacao) {
		this.pontuacao = pontuacao;
	}
	
	

}
