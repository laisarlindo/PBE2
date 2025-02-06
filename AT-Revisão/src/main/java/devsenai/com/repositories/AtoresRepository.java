package devsenai.com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import devsenai.com.entities.Atores;

public interface AtoresRepository extends JpaRepository<Atores, Long>{
	Atores findByCpf(String cpf);
}


