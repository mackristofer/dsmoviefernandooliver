package com.devsuperior.dsmovie.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dsmovie.dto.MovieDTO;
import com.devsuperior.dsmovie.dto.PontuacaoDTO;
import com.devsuperior.dsmovie.entities.Movie;
import com.devsuperior.dsmovie.entities.Pontuacao;
import com.devsuperior.dsmovie.entities.Usuario;
import com.devsuperior.dsmovie.repositories.MovieRepository;
import com.devsuperior.dsmovie.repositories.PontuacaoRepository;
import com.devsuperior.dsmovie.repositories.UsuarioRepository;

@Service
public class PontuacaoService {
	
	@Autowired
	private MovieRepository movierepository;
	
	@Autowired
	private UsuarioRepository usuariorepository;
	
	@Autowired
	private PontuacaoRepository pontuacaorepository;
	
    @Transactional
    public MovieDTO savepontuacao(PontuacaoDTO dto) {
    	Usuario usuario = usuariorepository.findByEmail(dto.getEmail());
    		if(usuario == null) {
    			usuario = new Usuario();
    			usuario.setEmail(dto.getEmail());
    			usuario = usuariorepository.saveAndFlush(usuario);
    		}
    		
    		Movie movie = movierepository.findById(dto.getMovieid()).get();
    		
    		Pontuacao pontuacao = new Pontuacao();
    		pontuacao.setMovie(movie);
    		pontuacao.setUsuario(usuario);
    		pontuacao.setValor(dto.getPontuacao());
    		
    		pontuacao = pontuacaorepository.saveAndFlush(pontuacao);
    		
    		double sum= 0.0;
    		for(Pontuacao s : movie.getPontuacoes()) {
    			sum = sum + s.getValor();
    		}
    		
    		double avg = sum / movie.getPontuacoes().size();
    		
    		movie.setNota(avg);
    		movie.setAvaliacao(movie.getPontuacoes().size());
    		
    		movie = movierepository.save(movie);
    		
    		return new MovieDTO(movie);
    	}
    }
	


