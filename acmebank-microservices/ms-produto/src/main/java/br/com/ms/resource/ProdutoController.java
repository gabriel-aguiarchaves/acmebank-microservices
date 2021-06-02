package br.com.ms.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ms.model.Produto;
import br.com.ms.service.ProdutoService;

@RestController
@RequestMapping("/v1/api/produtos")
public class ProdutoController {
	@Autowired
	private ProdutoService service;
	
	@GetMapping
	public ResponseEntity<List<Produto>> list() {
		return ResponseEntity.ok(service.list());
	}
}
