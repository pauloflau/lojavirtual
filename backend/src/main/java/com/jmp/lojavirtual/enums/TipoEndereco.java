package com.jmp.lojavirtual.enums;

public enum TipoEndereco {
	/*
	 * COBRANCA("cobranca")
	 * cobranca - o que aparece para o usuario
	 * COBRANCA - o que e gravado no banco
	 * */
	
	COBRANCA("Cobranca"),
	ENTREGA("Entrega");
	
	private String descricao;

	private TipoEndereco(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
	@Override
	public String toString() {
		return this.descricao;
	}
}
