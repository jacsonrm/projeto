package br.com.projeto.financas.model.enums;

public enum AcessoPerfil {

	ADMINISTRADOR("Administrador do Sistema", false),
	VISUALIZADOR("Visualizador", true);

	private final String label;
	private final Boolean gerenciavel;

	private AcessoPerfil(String label, Boolean gerenciavel) {
		this.label = label;
		this.gerenciavel = gerenciavel;
	}

	public String getLabel() {
		return label;
	}

	public Boolean getGerenciavel() {
		return gerenciavel;
	}
}
