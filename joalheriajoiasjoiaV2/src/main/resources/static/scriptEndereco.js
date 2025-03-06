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
				alert("Endereço cadastrado com sucesso");
			} else {
				alert("Erro ao cadastrar endereço :(");
			}
		} catch (error) {
			console.error("Erro ao cadastrar endereço :(");
		}
	});
});