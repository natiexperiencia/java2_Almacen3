package com.zubiri.Almacen3;

public class Contacto extends Persona {
	
	public Contacto(String lineaContacto, String separador){
		
		String[] datos = lineaContacto.split(separador);
		this.setNombre(datos[0]);
		this.setApellido(datos[1]);
		this.setEmail(datos[2]);
		this.setTelefono(Integer.parseInt(datos[3]));
	}
	
	public String pintarPersonaContacto(){
		
		String contacto =
				"Contacto: " +
				"\n\tNombre: " + this.getNombre() + 
				"\n\tApellido: " + this.getApellido() + 
				"\n\tEmail: " + this.getEmail() + 
				"\n\tTeléfono: " + this.getTelefono() + "\n";
		return contacto;
	}
}
