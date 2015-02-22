package com.zubiri.Almacen3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Distribuidores {

	private static ArrayList<Distribuidor> distribuidores = new ArrayList<Distribuidor>();
	
	private Distribuidores(){}
	
	public static void leerDistribuidores(String fichero) throws IOException{
		
		FileInputStream fis = new FileInputStream(fichero);
	 	InputStreamReader isr = new InputStreamReader(fis, "UTF8");
		BufferedReader br = new BufferedReader(isr);
		String linea = br.readLine();
		if (linea == null) {
			System.out.println("El archivo está vacio");
		}else {
			while (linea != null) {
				Distribuidor distribuidor = new Distribuidor(linea,"#");
				distribuidores.add(distribuidor);
				linea = br.readLine();
			}
			br.close();
		}
		
	}
	
	public static Distribuidor buscarDistribuidor(String nombre){
		Distribuidor distribuidor = null;
		for (int i = 0; i < distribuidores.size(); i++) {
			if (distribuidores.get(i).getNombre().equalsIgnoreCase(nombre)) {
				distribuidor = distribuidores.get(i);
			}			
		}
		return distribuidor;
	}
	
	public static void pintarDistribuidores(){
		if (distribuidores.size() == 0) {
			System.out.println("No se han cargado los distribuidores");
		}else {
			for (int e = 0; e < distribuidores.size(); e++) {
				System.out.println(distribuidores.get(e).pintarDistribuidor());
			}
		}
	}
}
