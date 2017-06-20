package br.vev.grupo3;
import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Before;

public class SensorTest {

	Sensor sensor;
	
	@Before
	public void setUp() {
		sensor = new Sensor(1);
	}
	
	@Test
	public void testSequence3(){
		sensor.resetH();
		sensor.setH();
		assertEquals(sensor.getH(), true);
		assertEquals(sensor.getAlerta(), false);
	}
	
	@Test
	public void testSequence6(){
		sensor.setH();
		sensor.resetAlerta();
		sensor.resetAlerta();
		assertEquals(sensor.getH(), true);
		assertEquals(sensor.getAlerta(), false);
	}
	
	@Test
	public void testSequence10(){
		sensor.setH();
		sensor.setAlerta();
		sensor.setAlerta();
		sensor.setH();
		assertEquals(sensor.getH(), true);
		assertEquals(sensor.getAlerta(), true);
	}
	
	@Test
	public void testSequence13(){
		sensor.setH();
		sensor.setAlerta();
		sensor.resetAlerta();
		sensor.resetAlerta();
		assertEquals(sensor.getH(), true);
		assertEquals(sensor.getAlerta(), false);
	}
	
	@Test
	public void testSequence14(){
		sensor.setH();
		sensor.setAlerta();
		sensor.setH();
		sensor.setH();
		assertEquals(sensor.getH(), true);
		assertEquals(sensor.getAlerta(), true);
	}
	
	@Test
	public void testSequence15(){
		sensor.setH();
		sensor.setAlerta();
		sensor.setH();
		sensor.resetAlerta();
		assertEquals(sensor.getH(), true);
		assertEquals(sensor.getAlerta(), false);
	}
	
	@Test
	public void testSequenceNovo(){
		sensor.setH();
		sensor.resetH();
		sensor.setH();
		sensor.resetH();
		assertEquals(sensor.getH(), false);
		assertEquals(sensor.getAlerta(), false);
	}
}
