package br.com.ms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ms.model.Empregado;
import br.com.ms.repository.EmpregadoRepository;

@Service
public class EmpregadoService {
	@Autowired
	private EmpregadoRepository repository;
	
	public List<Empregado> list() {
		return this.repository.findAll();
	}
}
