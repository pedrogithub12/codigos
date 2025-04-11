function buscarEndereco() {
    const cep = document.getElementById("cep").value.replace(/\D/g, '');
    if (cep.length === 8) {
      fetch(`https://viacep.com.br/ws/${cep}/json/`)
        .then(res => res.json())
        .then(data => {
          if (!data.erro) {
            document.getElementById("logradouro").value = data.logradouro;
            document.getElementById("bairro").value = data.bairro;
            document.getElementById("cidade").value = data.localidade;
            document.getElementById("uf").value = data.uf;
          }
        });
    }
  }
  
  function copiarEnderecoEntrega() {
    const destino = document.getElementById("enderecosEntrega");
    destino.innerHTML = '';
    if (document.getElementById("copiarEndereco").checked) {
      const origem = document.getElementById("enderecoFaturamento").cloneNode(true);
      origem.removeAttribute("id");
      destino.appendChild(origem);
    }
  }
  
  function adicionarEnderecoEntrega() {
    const destino = document.getElementById("enderecosEntrega");
    const origem = document.getElementById("enderecoFaturamento").cloneNode(true);
    origem.removeAttribute("id");
    destino.appendChild(origem);
  }
  