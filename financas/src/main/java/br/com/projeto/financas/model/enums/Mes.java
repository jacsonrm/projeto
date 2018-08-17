package br.com.projeto.financas.model.enums;

public enum Mes {

    JANEIRO("Janeiro"),
    FEVEREIRO("Fevereiro"),
    MARCO("Março"),
    ABRIL("Abril"),
    MAIO("Maio"),
    JUNHO("Junho"),
    JULHO("Julho"),
    AGOSTO("Agosto"),
    SETEMBRO("Setembro"),
    OUTUBRO("Outubro"),
    NOVEMBRO("Novembro"),
    DEZEMBRO("Dezembro");

    private final String descricao;

    private Mes(String descricao) {
        this.descricao = descricao;
    }

    String getDescricao() {
        return this.descricao;
    }
}
