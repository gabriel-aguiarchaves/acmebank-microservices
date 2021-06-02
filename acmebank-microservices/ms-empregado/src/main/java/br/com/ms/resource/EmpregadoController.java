package br.com.ms.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ms.model.Empregado;
import br.com.ms.service.EmpregadoService;

@RestController
@RequestMapping("/v1/api/empregados")
public class EmpregadoController {
	@Autowired
	private EmpregadoService service;
	
	@GetMapping
	public ResponseEntity<List<Empregado>> list() {
		return ResponseEntity.ok(service.list());
	}
}
