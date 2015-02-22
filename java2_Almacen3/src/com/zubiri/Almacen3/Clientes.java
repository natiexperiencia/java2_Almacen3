package com.zubiri.Almacen3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Clientes {
	
	private static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	
	private Clientes(){}
	
	public static void leerClientes(String fichero) throws IOException{
		FileInputStream fis = new FileInputStream(fichero);
	 	InputStreamReader isr = new InputStreamReader(fis, "UTF8");
		BufferedReader br = new BufferedReader(isr);
		String linea = br.readLine();
		if (linea == null) {
			System.out.println("El archivo está vacio");
		}else {
			while (linea != null) {
				Cliente cliente = new Cliente(linea,"#");
				clientes.add(cliente);
				linea = br.readLine();
			}
			br.close();
		}
	}
	
	public static Cliente buscarCliente(int numeroCli) {
		Cliente cliente = null;
		for (int i = 0; i < clientes.size(); i++) {
			if (clientes.get(i).getNum_socio() == numeroCli) {
				cliente = clientes.get(i);
			}			
		}
		return cliente;
	}
	
	public static void pintarClientes(){
		if (clientes.size() == 0) {
			System.out.println("No se han cargado los distribuidores");
		}else {
			for (int e = 0; e < clientes.size(); e++) {
				System.out.println(clientes.get(e).pintarCliente());
			}
		}
	}
}
