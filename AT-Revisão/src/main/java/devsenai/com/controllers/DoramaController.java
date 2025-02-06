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

import devsenai.com.entities.Dorama;
import devsenai.com.services.DoramaService;

@RestController
@RequestMapping("/dorama")

public class DoramaController {
	@Autowired
	private DoramaService doramaService;
	
	@PostMapping
	public Dorama criarDorama(@RequestBody Dorama dorama) {
		return doramaService.criarDorama(dorama);
	}
	@PutMapping
	public Dorama editDorama(@RequestBody Dorama dorama) {
		return doramaService.criarDorama(dorama);
	}
	@GetMapping
	public List<Dorama> getAllDorama() {
		return doramaService.buscarDoramas();
	}
	@GetMapping("/{id}")
	public Dorama getDorama(@PathVariable Long id) {
		return doramaService.buscarDoramasPorId(id);
	}

	@DeleteMapping("/{id}")
	public void deleteDorama(@PathVariable Long id) {
		doramaService.excluirDorama(id);
	}
}