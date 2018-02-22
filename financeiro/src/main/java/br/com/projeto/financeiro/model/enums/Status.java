package br.com.projeto.financas.model.enums;

public enum Status {

    ATRASADO("Atrasado"), 
    PENDENTE("Pendente"), 
    PAGOCOMATRASO("Pago com atraso"), 
    PAGO("Pago");
       
    private final String descricao;

    private Status(String descricao) {
        this.descricao = descricao;
    }

    String getDescricao() {
        return this.descricao;
    }
}
