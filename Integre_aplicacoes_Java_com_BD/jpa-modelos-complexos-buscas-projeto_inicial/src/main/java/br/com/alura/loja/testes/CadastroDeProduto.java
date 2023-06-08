package br.com.alura.loja.testes;

import br.com.alura.loja.dao.CategoriaDao;
import br.com.alura.loja.dao.ProdutoDao;
import br.com.alura.loja.modelo.Categoria;
import br.com.alura.loja.modelo.CategoriaId;
import br.com.alura.loja.modelo.Produto;
import br.com.alura.loja.util.JPAUTIL;

import javax.persistence.EntityManager;
import java.math.BigDecimal;
import java.util.List;

public class CadastroDeProduto {

    public static void main(String[] args) {
        cadastrarCelular();

        EntityManager em = JPAUTIL.getEntityManager();
        ProdutoDao produtoDao = new ProdutoDao(em);

        Produto p = produtoDao.buscarPorId(1l);
        System.out.println(p.getPreco());

        List<Produto> todos = produtoDao.buscarPorCategoria("CELULARES");
        todos.forEach(p2 -> System.out.println(p.getNome()));

        BigDecimal precoDoProduto = produtoDao.buscarPredoDoProdutoCorNome("tesla");
        System.out.println(precoDoProduto);


//        Categoria celulares = new Categoria("CELULARES");
//        Produto celular = new Produto("Xiaomi Redmi", "Muito Bom!", new BigDecimal("800"), celulares);
//
//        EntityManager em = JPAUTIL.getEntityManager();
//        ProdutoDao produtoDao = new ProdutoDao(em);
//        CategoriaDao categoriaDao = new CategoriaDao(em);
//
//        em.getTransaction().begin();
//
//        categoriaDao.cadastrar(celulares);
//        produtoDao.cadastrar(celular);
//
//        em.getTransaction().commit();
//        em.close();
    }

    private static void cadastrarCelular() {
        Categoria celulares = new Categoria("CELULARES");
        Produto celular = new Produto("Xiaomi Redmi", "Muito Bom!", new BigDecimal("800"), celulares);

        EntityManager em = JPAUTIL.getEntityManager();
        ProdutoDao produtoDao = new ProdutoDao(em);
        CategoriaDao categoriaDao = new CategoriaDao(em);

        em.getTransaction().begin();

        categoriaDao.cadastrar(celulares);
        produtoDao.cadastrar(celular);

        em.getTransaction().commit();

        em.find(Categoria.class, new CategoriaId("CELULARES", "xpto"));

        em.close();


//        Categoria celulares = new Categoria("CELULARES");
//
//        EntityManager em = JPAUTIL.getEntityManager();
//        em.getTransaction().begin();
//
//        em.persist(celulares);
//        celulares.setNome("XPTO");
//
//        em.flush();
//        em.clear();
//
//        celulares = em.merge(celulares);
//        celulares.setNome("1234");
//        em.flush();
//        em.remove(celulares);
//        em.flush();
    }
}
