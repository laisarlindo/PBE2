package devsenai.com.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_atores")
public class Atores {
	
	// ATRIBUTOS
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_atores;
	
	@Column(name = "nome", nullable = false)
	private String nome;
	
	@Column(name = "cpf", nullable = false, length = 11)
	private String cpf;
	
	@Column(name = "idade",nullable = false, unique = true, length = 2)
	private int idade;
	
	@ManyToOne
	@JoinColumn(name = "DORAMA_id_dorama")
	private Dorama dorama;
	
	
	// CONSTRUTORES
	public Atores() {
		
	}
	public Atores(Long id_atores, String nome, String cpf, int idade) {
		this.id_atores = id_atores;
		this.cpf = cpf;
		this.idade = idade;
		this.nome = nome;
		
	}
	// GETTERS E SETTERS
	public Long getId_atores() {
		return id_atores;
	}
	public void setId_atores(Long id_atores) {
		this.id_atores = id_atores;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}