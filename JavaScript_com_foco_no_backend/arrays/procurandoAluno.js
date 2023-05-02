const alunos = ["João", "Juliana", "Anna", "Caio"];
const medias = [10, 8, 7.5, 9];

const listaDeAlunosEMedias = [alunos, medias];

function exibeNomeNota(aluno) {
    if (listaDeAlunosEMedias[0].includes(aluno)) { // include pesquisa dentro do array
        // const alunos = listaDeAlunosEMedias[0];
        // const medias = listaDeAlunosEMedias[1];

        const [alunos, medias] = listaDeAlunosEMedias;

        const indice = alunos.indexOf(aluno)

        const mediaAluno = medias[indice];

        console.log(`${aluno} tem a média ${mediaAluno}!`);
    } else {
        console.log("Aluno não encontrado!");
    }
}

exibeNomeNota("João")