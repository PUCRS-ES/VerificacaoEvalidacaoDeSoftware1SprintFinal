package br.vev.grupo3;

public enum EnumEstadosDasValvulas {
		FECHADA(false),
		ABERTA(true);

	private final boolean value;
	
	private EnumEstadosDasValvulas(boolean value) {
		this.value = value;
	}
	
	public boolean getValue() {
		return value;
	}
}
