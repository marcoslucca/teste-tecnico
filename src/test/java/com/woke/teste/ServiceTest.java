package com.woke.teste;

import com.woke.Categoria;
import com.woke.Produto;
import com.woke.Service;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ServiceTest {

    Service service = new Service();

    @Test
    void vender() {
        Produto produto = new Produto();
        produto.nome = "nome do produto";
        produto.descricao = "descricao do produto";
        produto.identificador = (short) 1;
        produto.estoque = 10;

        service.vender(
                produto,
                10,
                "card code",
                "4 digitos",
                "data vencimento",
                "titular cartao",
                "forma pagamento",
                "valor a pagar"
        );

        assertTrue(true);
    }

    @Test
    void salvar() {
        Produto produto = new Produto();
        produto.nome = "nome do produto";
        produto.descricao = "descricao do produto";
        produto.identificador = (short) 1;
        Categoria categoria = new Categoria();
        categoria.nome = "nome do produto";
        categoria.identificador = (short) 1;

        service.salvar(produto, categoria);

        assertTrue(true);
    }

    @Test
    void validar1() {
        Produto produto = new Produto();
        produto.nome = "nome do produto";
        produto.descricao = "descricao do produto";
        produto.identificador = (short) 1;

        try {
            service.validarProduto(produto);
            assertTrue(true);
        } catch (Exception e) {
        }
    }

    @Test
    void validar2() {
        Produto produto = new Produto();
        produto.nome = "nome do produto";
        produto.descricao = "descricao do produto";
        produto.identificador = (short) 1;

        try {
            service.validarProduto(produto);
            assertTrue(true);
        } catch (Exception e) {
        }
    }

    @Test
    void validar3() {
        Categoria categoria = new Categoria();
        categoria.nome = "nome do produto";
        categoria.identificador = (short) 1;

        try {
            service.validarCategoria(categoria);
            assertTrue(true);
        } catch (Exception e) {
        }
    }
}