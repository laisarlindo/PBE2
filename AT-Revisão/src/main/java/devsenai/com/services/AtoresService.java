package devsenai.com.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import devsenai.com.entities.Atores;

import devsenai.com.repositories.AtoresRepository;

@Service
public class AtoresService {
	@Autowired
	private AtoresRepository atoresRepository;
	
	// LISTAR TODOS OS ATORES
    public List<Atores> buscarAtores(){
    	return atoresRepository.findAll();
    }
   // BUSCAR ATORES POR ID
    public Atores buscarAtoresPorId(Long id) {
        return atoresRepository.findById(id).orElse(null);
        
    }
    // SALVAR ATORES
    public Atores criarAtores(Atores atores) {
        return atoresRepository.save(atores);
    }
    // DELETAR ATORES
    public void excluirAtores(Long id) {
        atoresRepository.deleteById(id);
    }

}
