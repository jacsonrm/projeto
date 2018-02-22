package br.com.projeto.financas.model.enums;

public enum Grupo {

    RENDA("Renda","Salários, adiantamentos, etc."), 
    SERVICOSFINANCEIROS("Serviços financeiros","Saque, Tarifas bancárias, etc."), 
    ALIMENTACAO("Alimentação","Refeições fora de casa(trabalho), Lanches, Supermercado, etc."), 
    TRANSPORTE("Transporte","ônibus, combustivel, etc."), 
    SAUDE("Saúde","Convênio médico, Academia, etc."), 
    PESSOAIS("Pessoais","Cabeleireiro, Manicure, etc."), 
    INVESTIMENTO("Investimento","Poupança, aplicações financeiras, etc."), 
    VESTUARIO("Vestuário","Roupas, calçados, etc."), 
    EDUCACAO("Educação","Cursos, escola dos filhos, etc."), 
    MORADIA("Moradia","Água, luz, telefone, internet, reforma, móveis, eletrodomésticos, etc."), 
    LAZER("Lazer","Restaurantes especiais, Festas, etc.");
       
    private final String descricao;
    private final String detalhamento;

    private Grupo(String descricao, String detalhamento) {
        this.descricao = descricao;
        this.detalhamento = detalhamento;
    }

    String getDescricao() {
        return this.descricao;
    }
    
    String getDetalhamento() {
        return this.detalhamento;
    }

}
