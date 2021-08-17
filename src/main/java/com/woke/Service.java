package com.woke;

public class Service {

    Repositorio repositorio = new Repositorio();

    public void vender(
            Produto produto,
            int quantidadeProdutoVendido,
            String codigoCartao,
            String quatroUltimosDigitos,
            String dataVencimento,
            String titularCartao,
            String formaPagamento,
            String valorAPagar) {
        produto.estoque -= quantidadeProdutoVendido;

        repositorio.salvarProduto(produto);

        PlataformaPagamento plataformaPagamento = new PlataformaPagamento();

        plataformaPagamento.realizarPagamento(codigoCartao, quatroUltimosDigitos, dataVencimento, titularCartao, formaPagamento, valorAPagar);
    }

    public void salvar(Produto produto, Categoria categoria) {
        try {
            validarProduto(produto);
        } catch (Exception e) {
        }

        try {
            validarCategoria(categoria);
        } catch (Exception e) {
        }

        produto.categoria = categoria;
        categoria.produto = produto;

        repositorio.salvarProduto(produto);
        repositorio.salvarCategoria(categoria);
    }

    public void validarProduto(Produto produto) throws Exception {
        if (produto.nome == null) {
            throw new Exception("É necessário definir um nome para o produto!");
        }

        if (produto.categoria == null) {
            throw new Exception("É necessário definir uma categoria para o produto!");
        }

        if (produto.descricao == null) {
            throw new Exception("É necessário definir uma descricao para o produto!");
        }

        if (produto.identificador == null) {
            throw new Exception("É necessário definir um codigo para o produto!");
        }
    }

    public void validarCategoria(Categoria categoria) throws Exception {
        if (categoria.nome == null) {
            throw new Exception("É necessário definir um nome para a categoria!");
        }

        if (categoria.identificador == null) {
            throw new Exception("É necessário definir um identificador para a categoria!");
        }
    }

    class Repositorio {

        public void salvarProduto(Produto produto) {
            //TODO: Not implemented yet
        }

        public void salvarCategoria(Categoria categoria) {
            //TODO: Not implemented yet
        }

    }

    class PlataformaPagamento {
        public void realizarPagamento(
                String codigoCartao,
                String quatroUltimosDigitos,
                String dataVencimento,
                String titularCartao,
                String formaPagamento,
                String valorAPagar
        ) {
            //TODO: Not implemented yet

            HttpClientTransportadora httpClientTransportadora = new HttpClientTransportadora();

            httpClientTransportadora.informarVendaConcluida();
        }
    }

    class HttpClientTransportadora {

        public void informarVendaConcluida() {
            //TODO: Not implemented yet
        }
    }

}
