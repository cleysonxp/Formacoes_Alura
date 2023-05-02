const cliente = {
    nome: "João",
    idade: 24,
    email: "joao@firma.com",
    telefone: ["1137628934", "1193572957"]
}

cliente.endereco = [{
    rua: "limoeiro",
    numero: 1919,
    apartamento: true,
    complemento: "ap 934"
}]

cliente.endereco.push({
    rua: "R. Joseph Ladder",
    numero: 404,
    apartamento: false
});

let listaApenasApartamentos = cliente.enderecos.filter(
    (endereco) => endereco.apartamento === true
);

console.log(listaApenasApartamentos);