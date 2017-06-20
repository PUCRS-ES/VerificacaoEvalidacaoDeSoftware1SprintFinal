package br.vev.grupo3;

public class Sensor {
	private int idSensor;
	private boolean habilitado;
	private boolean alerta;
	private static Controlador controle;
	
	public Sensor(int id) {
		this.idSensor = id;
		this.habilitado = false;
	}
	
	public boolean getH() {
		return habilitado;
	}
	
	public boolean setH() {
		if (this.habilitado)
			return false;
		else {
			this.habilitado = true;
			return true;
		}
	}
	
	public boolean resetH() {
		if (!this.habilitado)
			return false;
		else {
			this.habilitado = false;
			return true;
		}
	}
	
	public boolean setAlerta() {
		if (this.alerta || !this.habilitado)
			return false;
		else {
			this.alerta = true;
			if (controle != null)
				controle.alerta(idSensor);
			return true;
		}
	}
	
	public boolean resetAlerta() {
		if (!this.alerta)
			return false;
		else {
			this.alerta = false;
			if (controle != null)
				controle.resetAlerta(idSensor);
			return true;
		}
	}
	
	public boolean getAlerta() {
		return alerta;
	}
}
