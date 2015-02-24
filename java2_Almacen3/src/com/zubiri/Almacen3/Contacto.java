package com.zubiri.Almacen3;

public class Contacto extends Persona {
	
	public Contacto(String lineaContacto, String separador){
		try{
			String[] datos = lineaContacto.split(separador);
			this.setNombre(datos[0]);
			this.setApellido(datos[1]);
			this.setEmail(datos[2]);
			this.setTelefono(Integer.parseInt(datos[3]));
		}catch(Exception e){
			System.err.println("No se ha podido crear el contacto");
			System.err.println("Error: " + e);
		}
	}
	
	public String pintarPersonaContacto(){
		
		String contacto =
				"Contacto: " +
				"\n\t\tNombre: " + this.getNombre() + 
				"\n\t\tApellido: " + this.getApellido() + 
				"\n\t\tEmail: " + this.getEmail() + 
				"\n\t\tTeléfono: " + this.getTelefono() + "\n";
		return contacto;
	}
}
