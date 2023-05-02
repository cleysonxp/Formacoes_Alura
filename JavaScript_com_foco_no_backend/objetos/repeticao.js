const cliente = {
    nome: "João",
    idade: 24,
    email: "joao@firma.com",
    telefone: ["1137628934", "1193572957"]
}

cliente.enderecos = [{
    rua: "limoeiro",
    numero: 1919,
    apartamento: true,
    complemento: "ap 934"
}]

for (let chave in cliente) {
    let tipo = typeof cliente[chave];
    if (tipo !== "object" && tipo !== "function") {
        console.log(`A chave ${chave} tem o valor ${cliente[chave]}`);
    }
}