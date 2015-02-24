package com.zubiri.Almacen3;

import java.util.ArrayList;
import java.util.Scanner;

public class Productos {
	
	private static ArrayList<Producto> productos = new ArrayList<Producto>();
	public Productos(){}
	public Productos(Scanner sc){
		
		System.out.println("Cuantos productos quieres guardar: ");
		int opcion = sc.nextInt();
		
		try{
		
			for (int p = 0; p < opcion; p++) {
				
				System.out.println("Que producto quieres guardar: ");
				System.out.println("Manzana----------------------1");
				System.out.println("Leche------------------------2");
				System.out.println("Lechuga----------------------3");
				
				switch (sc.nextInt()) {
				case 1:
					Manzana manzana = new Manzana(sc);
					productos.add(manzana);
					break;
				case 2:
					Leche leche = new Leche(sc);
					productos.add(leche);
					break;
				case 3:
					Lechuga lechuga = new Lechuga(sc);
					productos.add(lechuga);
					break;
				default:
					System.err.println("Eso no es una opción");
					break;
				}
			}
		}catch(Exception i){
			System.err.println("Algo no ha ido bien");
			System.err.println("Error: " +i);
		}
	}
	
	public void pintarProductos(){
		try{
			if (productos.size() == 0) {
				System.err.println("No se han cargado productos");
			}else {
				for (int m = 0; m < productos.size(); m++) {
					Producto producto = productos.get(m);
					producto.pintarProducto();
				}
			}
		}catch(NullPointerException x){
			System.err.println("No hay productos");
			System.err.println("Error: " + x.getMessage());
		}
	}

	public static ArrayList<Producto> getProductos() {
		return productos;
	}

	public void setProductos(ArrayList<Producto> produc) {
		productos = produc;
	}
}
