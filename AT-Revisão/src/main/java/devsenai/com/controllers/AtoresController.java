package devsenai.com.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import devsenai.com.entities.Atores;
import devsenai.com.services.AtoresService;



@RestController
@RequestMapping("/atores")
public class AtoresController {
	@Autowired
	private AtoresService atoresService;
	
	@PostMapping
	public Atores criarAtores(@RequestBody Atores atores) {
		return atoresService.criarAtores(atores);
	}
	@PutMapping
	public Atores editAtores(@RequestBody Atores atores) {
		return atoresService.criarAtores(atores);
	}
	@GetMapping
	public List<Atores> getAllAtores() {
		return atoresService.buscarAtores();
	}
	@GetMapping("/{id}")
	public Atores getAtores(@PathVariable Long id) {
		return atoresService.buscarAtoresPorId(id);
	}

	@DeleteMapping("/{id}")
	public void deleteAtores(@PathVariable Long id) {
		atoresService.excluirAtores(id);
	}

}
