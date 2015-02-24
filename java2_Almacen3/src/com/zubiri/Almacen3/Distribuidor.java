package com.zubiri.Almacen3;


public class Distribuidor {
	
	private String nombre, cif;
	private Direccion direccion;
	private Contacto personaContacto;
	
	private static int contador = 0;
	
	public Distribuidor(){}
	
	public Distribuidor(String lineaDistribuidor, String separador){
		try{
			String[] datos = lineaDistribuidor.split(separador);
			String[] datos2= datos[0].split(",");
			this.setNombre(datos2[0]);
			this.setCif(datos2[1]);
			this.setDireccion(new Direccion(datos[1], ","));
			this.setPersonaContacto(new Contacto(datos[2], ","));
			contador();
		}catch(Exception e){
			System.err.println("No se ha podido crear el Distribuidor");
			System.err.println("Error: " + e);
		}
	}
	
	public String pintarDistribuidor(){
		
		String distribuidor =
				"Distribuidor: " + this.nombre + "\n"
				+ "Cif: " + this.cif + "\n"
				+ "\t" + this.direccion.pintarDireccion() + "\n"
				+ "\t" + this.personaContacto.pintarPersonaContacto() + "\n";
		
		return distribuidor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCif() {
		return cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public Contacto getPersonaContacto() {
		return personaContacto;
	}

	public void setPersonaContacto(Contacto personaContacto) {
		this.personaContacto = personaContacto;
	}
	public static void contador(){
		contador++;
	}
	public static int cantidad(){
		return contador;
	}
	
}
