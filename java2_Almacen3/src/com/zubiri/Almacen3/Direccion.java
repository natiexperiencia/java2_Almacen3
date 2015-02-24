package com.zubiri.Almacen3;

public class Direccion {
	private String ciudad, calle;
	private int numero, piso, codPostal;
	private char letra;
	
	public Direccion(){}
	
	public Direccion(String lineaDireccion, String separador){
		try{
		
			String[] datos = lineaDireccion.split(separador);
			this.setCiudad(datos[0]);
			this.setCalle(datos[1]);
			this.setNumero(Integer.parseInt(datos[2]));
			this.setPiso(Integer.parseInt(datos[3]));
			char[] letras = datos[4].toCharArray();
			this.setLetra(letras[0]);
			this.setCodPostal(Integer.parseInt(datos[5]));
		}catch(Exception i){
			System.err.println("No se ha podido crear la dirección");
			System.err.println("Error: " + i);
		}
	}
	
	public String pintarDireccion(){
		String direccion =
				"Dirección: \n" +
				"\t\tCiudad: " + this.ciudad + "\n" +
				"\t\tCalle: " + this.calle + "\n" +
				"\t\tNúmero: " + this.numero + "\n" +
				"\t\tPiso: " + this.piso + "\n" +
				"\t\tLetra: " + this.letra + "\n" +
				"\t\tCod. postal: " + this.codPostal + "\n";
		return direccion;
	}
	
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getPiso() {
		return piso;
	}
	public void setPiso(int piso) {
		this.piso = piso;
	}
	public int getCodPostal() {
		return codPostal;
	}
	public void setCodPostal(int codPostal) {
		this.codPostal = codPostal;
	}
	public char getLetra() {
		return letra;
	}
	public void setLetra(char letra) {
		this.letra = letra;
	}
}
