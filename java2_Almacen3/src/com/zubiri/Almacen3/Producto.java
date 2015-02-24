package com.zubiri.Almacen3;

import java.util.Scanner;

public abstract class Producto {
	private String procedencia;
	private Distribuidor distribuidor;
	private int cod_barras;
	private double precio;
	
	public Producto(String procedencia, Distribuidor distribuidor, int cod_barras, double precio){
		this.procedencia = procedencia;
		this.distribuidor = distribuidor;
		this.cod_barras = cod_barras;
		this.precio = precio;
	}
	
	public Producto(Scanner sc){
		try{
			System.out.println("Código de barras del producto: ");
			this.setCod_barras(sc.nextInt());
			System.out.println("Precio del producto: ");
			this.setPrecio(sc.nextDouble());
			System.out.println("Procedencia del producto: ");
			this.setProcedencia(sc.next());
			System.out.println("Distribuidor del producto: ");
			this.setDistribuidor(Distribuidores.buscarDistribuidor(sc.next()));
		}catch(Exception e){
			System.err.println("No se ha podido crear el producto");
			System.err.println("Error: " + e);
		}
	}
	
	public void pintarProducto(){
		System.out.println("\tCódigo de barras: " + this.getCod_barras());
		System.out.println("\tProcedencia: " + this.getProcedencia());
		System.out.println("\tPrecio: " + this.getPrecio());
		System.out.println("\tDistribuidor: " + this.getDistribuidor().getNombre());
	}

	public String getProcedencia() {
		return procedencia;
	}
	public void setProcedencia(String procedencia) {
		this.procedencia = procedencia;
	}
	public Distribuidor getDistribuidor() {
		return distribuidor;
	}
	public void setDistribuidor(Distribuidor distribuidor) {
		this.distribuidor = distribuidor;
	}
	public int getCod_barras() {
		return cod_barras;
	}
	public void setCod_barras(int cod_barras) {
		this.cod_barras = cod_barras;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
}
