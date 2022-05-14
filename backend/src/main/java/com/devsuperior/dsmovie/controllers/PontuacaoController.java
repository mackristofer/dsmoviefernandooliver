package com.devsuperior.dsmovie.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsmovie.dto.MovieDTO;
import com.devsuperior.dsmovie.dto.PontuacaoDTO;
import com.devsuperior.dsmovie.services.PontuacaoService;

@RestController
@RequestMapping(value ="/pontuacoes")
public class PontuacaoController {

	@Autowired
	private  PontuacaoService pontuacaoService;
	
	@PutMapping
	public MovieDTO savePontuacao(@RequestBody PontuacaoDTO dto){
		MovieDTO movieDTO = pontuacaoService.savepontuacao(dto);
		return movieDTO;
	}
}
