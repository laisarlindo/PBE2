document.getElementById("cep").addEventListener("input",async function(){
	const cep = this.value.replace(/\D/g,"");
	
	if(cep.length === 8){
		try{
			const response = await fetch (`https://viacep.com.br/ws/${cep}/json/`);
			if(!response.ok) throw new Error("Erro ao buscar CEP");
			
			const dados = await response.json();
			if(dados.erro){
				alert("CEP não encontrado.")
				return;
			}
			document.getElementById("rua").value = dados.logradouro;
			document.getElementById("bairro").value = dados.bairro;
			document.getElementById("cidade").value = dados.localidade;
			document.getElementById("estado").value = dados.estado;
			
			
		} catch (erro) {
			alert("Erro ao buscar o endereço:" + error.message);
		}
	}
})

document.addEventListener("DOMContentLoaded", () => {
	const form = document.getElementById("cadastroEndereco");

	form.addEventListener("submit", async (event) => {
		event.preventDefault();

		const bairro = document.getElementById("bairro").value;
		const rua = document.getElementById("rua").value;
		const cidade = document.getElementById("cidade").value;
		const numeroCasa = document.getElementById("nm_casa").value;
		const estado = document.getElementById("estado").value;
		const cep = document.getElementById("cep").value;
		const complemento = document.getElementById("comp").value;

		try {
			const response = await fetch("http://localhost:8080/endereco", {
				method: "POST",
				headers: {
					"Content-Type": "application/json"
				},
				body: JSON.stringify({
					bairro,
					rua,
					cidade,
					numeroCasa,
					estado,
					cep,
					complemento
				}),
			});
			if (response.ok) {
				window.location.href = "sucessocadastro.html"
			} else {
				alert("Erro ao cadastrar endereço :(");
			}
		} catch (error) {
			console.error("Erro ao cadastrar endereço :(");
		}
	});
});