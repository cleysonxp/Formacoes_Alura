const pessoa = {
    nome: "Lima",
    profissao: "Engenheiro"
}

console.log(pessoa.nome);

console.log(pessoa.telefone);

pessoa.telefone = "11 222333344";

console.log(pessoa.telefone);

pessoa.nome = "Lima Silva";

console.log(pessoa);


const novaPessoa = {
    nome: "Pedro"
}

pessoa = novaPessoa