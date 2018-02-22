package br.com.projeto.financas.model.enums;

public enum FormaDePagamento {

    CARTAO("Cartão de Crédito"), 
    BOLETO("Boleto Bancário"), 
    DINHEIRO("Dinheiro");
       
    private final String descricao;

    private FormaDePagamento(String descricao) {
        this.descricao = descricao;
    }

    String getDescricao() {
        return this.descricao;
    }
}
