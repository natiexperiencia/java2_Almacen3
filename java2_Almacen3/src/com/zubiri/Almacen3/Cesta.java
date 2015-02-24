package com.zubiri.Almacen3;

import java.util.Scanner;

public class Cesta {
	private double cuenta;
	private int numeroCli;
	private Cliente cliente = null;
	public Cesta(){}
	
	public void pintarCuenta(Scanner sc){
		System.out.println("Número de cliente: ");
		numeroCli = sc.nextInt();

		cliente = Clientes.buscarCliente(numeroCli);
		if(cliente == null){
			System.err.println("No se ha encontrado el cliente");
		}
		if (Productos.getProductos().size() == 0) {
			System.err.println("No hay productos para la cuenta");
		}else{
			Producto producto = null;
			System.out.println("La cuenta:");
			System.out.println("----------");
				for (int i = 0; i < Productos.getProductos().size(); i++) {
					producto = Productos.getProductos().get(i);
					cuenta += producto.getPrecio();
					System.out.println("Producto: ");
					System.out.println("\tCod barras: " + producto.getCod_barras() + "\n" + "\tPrecio: " + producto.getPrecio() + "€");
				}
				System.out.println("---------------------------------");
				System.out.println("Sub Total: " + cuenta + "€");
				this.cuentaConDescuento(cliente);
			}
	}
	
	private void cuentaConDescuento(Cliente cliente){
			double dto = cliente.getDto();
			double total = (dto/100)*cuenta;
			total = Math.round(total*Math.pow(10, 2))/Math.pow(10, 2);
			System.out.println("Total: " + total + "€");
			System.out.println("---------------------------------\n");
	}
}
