package com.wbg.app;

import com.wbg.app.Animales.Burro;
import com.wbg.app.Animales.Vaca;
import com.wbg.app.Objetos.Lampara;
import com.wbg.app.Objetos.Papelera;

public class Practicajava3 {

	public static void main(String[] args) {

		Lampara lampara = new Lampara();
		lampara.setColor("rojo");
		lampara.setMarca("home");
		lampara.setPeso(10.0);

		System.out.println("lampara: color = " + lampara.getColor() + " , marca = " + lampara.getMarca() + " , peso = "
				+ lampara.getPeso());

		Papelera papelera = new Papelera();
		papelera.setColor("negro");
		papelera.setMaterial("plastico");
		papelera.setTamanio(11.50);

		System.out.println("papelera: color = " + papelera.getColor() + " , material = " + papelera.getMaterial()
				+ " ,tamanio = " + papelera.getTamanio());

		Burro burro = new Burro();
		burro.setEdad(3);
		burro.setPeso(2.50);
		burro.setRaza("americano");

		System.out.println(
				"burro: edad = " + burro.getEdad() + " , peso = " + burro.getPeso() + " , raza = " + burro.getRaza());

		Vaca vaca = new Vaca();
		vaca.setColor("blanco");
		vaca.setCuernos(2);
		vaca.setPeso(10.0);

		System.out.println("vaca: color = " + vaca.getColor() + " , cuernos = " + vaca.getCuernos() + " , peso = "
				+ vaca.getPeso());

	}

}
