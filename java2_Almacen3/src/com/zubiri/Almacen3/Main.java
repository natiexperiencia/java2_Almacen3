package com.zubiri.Almacen3;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		
		int opcion;
		Productos productos = new Productos();
		Cesta cesta = new Cesta();
		Scanner sc = new Scanner(System.in);
		
		Distribuidores.leerDistribuidores("res/distribuidores.txt");
		Clientes.leerClientes("res/clientes.txt");
		try{
			do {
				System.out.println("Mostrar distribuidores-----------------------------1");
				System.out.println("Mostrar clientes-----------------------------------2");
				System.out.println("Guardar productos----------------------------------3");
				System.out.println("Mostrar productos----------------------------------4");
				System.out.println("Mostrar cuenta-------------------------------------5");
				System.out.println("Salir----------------------------------------------0");
				opcion = sc.nextInt();
				
				switch (opcion) {
				case 1:
					Distribuidores.pintarDistribuidores();
					break;
				case 2:
					Clientes.pintarClientes();
					break;
				case 3:
					productos = new Productos(sc);
					break;
				case 4:
					productos.pintarProductos();
					break;
				case 5:
					cesta.pintarCuenta(sc);
					break;
				case 0:
					break;
				default:
					System.out.println("Eso no es una opción\n");
					break;
				}
			} while (opcion != 0);
		}catch (InputMismatchException e) {
			System.err.println("Eso no es un número\n");
		}
		System.out.println("Cerrando el programa");
		System.out.println("Adiós!!!");
		sc.close();
	}
}
