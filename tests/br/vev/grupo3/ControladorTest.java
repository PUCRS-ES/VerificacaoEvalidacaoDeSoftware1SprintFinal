package br.vev.grupo3;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ControladorTest {

	Controlador control;
	
	@Before
	public void setUp() {
		control = new Controlador();
	}
	
	@Test
	public void TestSequence1(){
		control.setH(1);
		control.resetH(1);
		control.setH(0);
		
		assertEquals(control.getSensores()[0].getH(), true);
		assertEquals(control.getSensores()[1].getH(), false);
		assertEquals(control.getSensores()[0].getAlerta(), false);
		assertEquals(control.getSensores()[1].getAlerta(), false);
	}
	
	@Test
	public void TestSequence2(){
		control.setH(1);
		control.resetH(1);
		control.setH(1);
		
		assertEquals(control.getSensores()[0].getH(), false);
		assertEquals(control.getSensores()[1].getH(), true);
		assertEquals(control.getSensores()[0].getAlerta(), false);
		assertEquals(control.getSensores()[1].getAlerta(), false);
	}
	
	@Test
	public void TestSequence9(){
		control.setH(1);
		control.setH(0);
		control.resetH(1);
		control.resetH(0);
		
		assertEquals(control.getSensores()[0].getH(), false);
		assertEquals(control.getSensores()[1].getH(), false);
		assertEquals(control.getSensores()[0].getAlerta(), false);
		assertEquals(control.getSensores()[1].getAlerta(), false);
	}
	
	@Test
	public void TestSequence10(){
		control.setH(1);
		control.setH(0);
		control.resetH(1);
		control.setH(1);
				
		assertEquals(control.getSensores()[0].getH(), true);
		assertEquals(control.getSensores()[1].getH(), true);
		assertEquals(control.getSensores()[0].getAlerta(), false);
		assertEquals(control.getSensores()[1].getAlerta(), false);
	}
	
	@Test
	public void TestSequence14(){
		control.setH(1);
		control.setH(0);
		control.alerta(1);
		control.resetAlerta(1);
		control.setH(1);
		
		assertEquals(control.getSensores()[0].getH(), true);
		assertEquals(control.getSensores()[1].getH(), true);
		assertEquals(control.getSensores()[0].getAlerta(), false);
		assertEquals(control.getSensores()[1].getAlerta(), false);
	}
	
	@Test
	public void TestSequence20(){
		control.setH(1);
		control.setH(0);
		control.alerta(0);
		control.alerta(1);		
		control.resetH(1);
		
		assertEquals(control.getSensores()[0].getH(), true);
		assertEquals(control.getSensores()[1].getH(), true);
		assertEquals(control.getSensores()[0].getAlerta(), true);
		assertEquals(control.getSensores()[1].getAlerta(), true);
	}
	
	@Test
	public void TestSequence29(){
		control.setH(1);
		control.setH(0);
		control.alerta(1);
		control.alerta(0);		
		control.resetAlerta(0);
		control.resetH(1);

		assertEquals(control.getSensores()[0].getH(), true);
		assertEquals(control.getSensores()[1].getH(), true);
		assertEquals(control.getSensores()[0].getAlerta(), false);
		assertEquals(control.getSensores()[1].getAlerta(), true);
	}
	
	@Test
	public void TestSequence35(){
		control.setH(1);
		control.setH(0);
		control.alerta(1);
		control.alerta(0);		
		control.resetAlerta(1);
		control.resetH(1);
	
		assertEquals(control.getSensores()[0].getH(), true);
		assertEquals(control.getSensores()[1].getH(), true);
		assertEquals(control.getSensores()[0].getAlerta(), true);
		assertEquals(control.getSensores()[1].getAlerta(), false);
	}
}
