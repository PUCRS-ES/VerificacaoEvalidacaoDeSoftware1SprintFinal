package br.vev.grupo3;

public class Controlador {
	private Sensor[] sensores = new Sensor[2];
	private EnumEstadosDasValvulas[] valvulas = new EnumEstadosDasValvulas[2];
	
	public Sensor[] getSensores() {
		return sensores;
	}
	
	public EnumEstadosDasValvulas[] getValvulas() {
		return valvulas;
	}
	
	public Controlador() {
		for(int i = 0; i < sensores.length; i++) {
			sensores[i] = new Sensor(i);
			valvulas[i] = EnumEstadosDasValvulas.FECHADA;
		}
	}
	
	public boolean setH(int n) {
		if(0 <= n && n < sensores.length) {
			if (sensores[n].getH())
				return false;
			else {
				sensores[n].setH();
				return true;
			}
		}
		return false;
	}
	
	public boolean resetH(int n) {
		if(0 <= n && n < sensores.length) {
			//nao desabilita o sensor se o controlador estiver em alerta (qualquer um dos sensores em alerta)
			if (!sensores[n].getH() || (sensores[0].getAlerta() || sensores[1].getAlerta()))
				return false;
			else {
				sensores[n].resetH();
				return true;
			}
		}
		return false;
	}
	
	public void alerta(int n) {
		if(0 <= n && n < valvulas.length)
			valvulas[n] = EnumEstadosDasValvulas.ABERTA;
	}
	
	public void resetAlerta(int n) {
		if(0 <= n && n < valvulas.length)
			valvulas[n] = EnumEstadosDasValvulas.FECHADA;
	}
	
	public void open(int n) {
		if(0 <= n && n < valvulas.length)
			valvulas[n] = EnumEstadosDasValvulas.ABERTA;	
	}
	
	public void fecha(int n) {
		if(0 <= n && n < valvulas.length)
			valvulas[n] = EnumEstadosDasValvulas.FECHADA;	
	}
	
	public boolean getV(int n) {
		if(0 <= n && n < valvulas.length) {
			if (valvulas[n] == EnumEstadosDasValvulas.ABERTA)
				return true;
			else
				return false;
		}
		return false;
	}
}
