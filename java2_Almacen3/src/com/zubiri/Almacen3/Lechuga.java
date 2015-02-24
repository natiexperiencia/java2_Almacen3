package com.zubiri.Almacen3;

import java.util.Scanner;

public class Lechuga extends Producto {
	private String tipo, color;
	
	public Lechuga(String procedencia, Distribuidor distribuidor, int cod_barras, double precio, String color, String tipo) {
		super(procedencia, distribuidor, cod_barras, precio);
		this.tipo = tipo;
		this.color = color;
	}
	
	public Lechuga(Scanner sc){
		super(sc);
		try{
			System.out.println("Tipo de lechuga: ");
			this.setTipo(sc.next());
			System.out.println("Color de la lechuga: ");
			this.setColor(sc.next());
		}catch(Exception i){
			System.err.println("No se ha podido crear la lechuga");
			System.err.println("Error: " + i);
		}
	}
	
	@Override
	public void pintarProducto(){
		System.out.println("Lechuga: ");
		super.pintarProducto();
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Color: " + this.getColor());
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
