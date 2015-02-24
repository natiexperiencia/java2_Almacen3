package com.zubiri.Almacen3;

import java.util.Scanner;

public class Leche extends Producto {
	private String tipo;
	public Leche(String procedencia, Distribuidor distribuidor, int cod_barras, double precio, String tipo) {
		super(procedencia, distribuidor, cod_barras, precio);
		this.tipo = tipo;
	}
	
	public Leche(Scanner sc){
		super(sc);
		try{
			System.out.println("Tipo de leche: ");
			this.setTipo(sc.next());
		}catch(Exception e){
			System.err.println("No se ha podido crear la leche");
			System.err.println("Error: " + e);
		}
	}
	
	@Override
	public void pintarProducto(){
		System.out.println("Leche: ");
		super.pintarProducto();
		System.out.println("\tTipo: " + this.getTipo());
	}
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
