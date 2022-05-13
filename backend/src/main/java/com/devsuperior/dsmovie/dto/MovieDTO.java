package com.devsuperior.dsmovie.dto;

import com.devsuperior.dsmovie.entities.Movie;

public class MovieDTO {

	private Long id;
	private String titulo;
	private Double nota;
	private Integer avaliacao;
	private String imagem;
	
	
	public MovieDTO() {}


	public MovieDTO(Long id, String titulo, Double nota, Integer avaliacao, String imagem) {
		this.id = id;
		this.titulo = titulo;
		this.nota = nota;
		this.avaliacao = avaliacao;
		this.imagem = imagem;
	}
	
	public MovieDTO(Movie movie) {
		id = movie.getId();
		titulo = movie.getTitulo();
		nota = movie.getNota();
		avaliacao = movie.getAvaliacao();
		imagem = movie.getImagem();
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public Double getNota() {
		return nota;
	}


	public void setNota(Double nota) {
		this.nota = nota;
	}


	public Integer getAvaliacao() {
		return avaliacao;
	}


	public void setAvaliacao(Integer avaliacao) {
		this.avaliacao = avaliacao;
	}


	public String getImagem() {
		return imagem;
	}


	public void setImagem(String imagem) {
		this.imagem = imagem;
	}
	
	
	
	
	
}
