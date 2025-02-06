package devsenai.com.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import devsenai.com.entities.Dorama;
import devsenai.com.repositories.DoramaRepository;



@Service

public class DoramaService {
	
	//ATRIBUTOS
	@Autowired
	private DoramaRepository doramaRepository;
	
	// LISTAR TODOS OS DORAMAS
    public List<Dorama> buscarDoramas() {
        return doramaRepository.findAll();
    }
        
     // BUSCAR DORAMA POR ID
	    public Dorama buscarDoramasPorId(Long id) {
	        return doramaRepository.findById(id).orElse(null);
	        
	    }
	    // SALVAR DORAMA
	    public Dorama criarDorama(Dorama dorama) {
	        return doramaRepository.save(dorama);
	    }
	 // DELETAR DORAMA
	    public void excluirDorama(Long id) {
	        doramaRepository.deleteById(id);
	    }
    }