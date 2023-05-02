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
}];

function ligaParaCliente(telefoneComercial, telefoneResidencial) {
    console.log(`Ligando para  ${telefoneComercial}`);
    console.log(`Ligando para  ${telefoneResidencial}`);
}

ligaParaCliente(...cliente.telefone)

const encomenda = {
    destinatario: cliente.nome,
    ...cliente.enderecos[0]
}

console.log(encomenda);