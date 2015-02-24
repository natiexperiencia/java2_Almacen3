package com.zubiri.Almacen3;

import java.util.Scanner;

public class Manzana extends Producto {
	private String color, tipo;
	
	public Manzana(String procedencia, Distribuidor distribuidor, int cod_barras, double precio, String tipo, String color) {
		super(procedencia, distribuidor, cod_barras, precio);
		this.tipo = tipo;
		this.color = color;
	}
	
	public Manzana(Scanner sc) {
		super(sc);
		try{
			System.out.println("Tipo de manzana: ");
			this.setTipo(sc.next());
			System.out.println("Color: ");
			this.setColor(sc.next());
		}catch(Exception e){
			System.err.println("No se ha podido crear la manzana");
			System.err.println("Error: " + e);
		}
	}
	
	@Override
	public void pintarProducto(){
		System.out.println("Manzana: ");
		super.pintarProducto();
		System.out.println("\tTipo: " + this.getTipo());
		System.out.println("\tColor: " + this.getColor());
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
