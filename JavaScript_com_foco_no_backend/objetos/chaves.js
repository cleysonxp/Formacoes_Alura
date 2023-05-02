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

const chavesDoObjeto = Object.keys(cliente)

console.log(chavesDoObjeto);

if(!chavesDoObjeto.includes("enderecos")){
    console.error("ERRO");
}