const dados = require("./cliente.json")

console.log(dados);
console.log(typeof dados);

const clienteString = JSON.stringify(dados)

console.log(clienteString);
console.log(typeof clienteString);

console.log(clienteString.nome);

const objetoJson = JSON.parse(clienteString);

console.log(objetoJson);