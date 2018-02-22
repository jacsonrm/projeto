package br.com.projeto.financas.model.enums;

public enum TipoDespesa {

    FIXA("Fixa"), 
    VARIAVEL("Variável");
       
    private final String descricao;

    private TipoDespesa(String descricao) {
        this.descricao = descricao;
    }

    String getDescricao() {
        return this.descricao;
    }
    
}
