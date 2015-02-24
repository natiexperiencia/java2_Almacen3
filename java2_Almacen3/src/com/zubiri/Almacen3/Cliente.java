package com.zubiri.Almacen3;

public class Cliente extends Persona {
	
	private String dni;
	private double num_socio, dto;
	private Direccion direccion;
	
	public Cliente(){}
	
	public Cliente(String lineaCliente, String separador){
		try{
			String[] datos = lineaCliente.split(separador);
			String[] datos2 = datos[0].split(",");
			this.setNombre(datos2[0]);
			this.setApellido(datos2[1]);
			this.setDni(datos2[2]);
			this.setDireccion(new Direccion(datos[1], ","));
			datos2 = datos[2].split(",");
			this.setNum_socio(Integer.parseInt(datos2[0]));
			this.setDto(Integer.parseInt(datos2[1]));
		}catch(Exception e){
			System.err.println("No se ha podido crear el cliente");
			System.err.println("Error: " + e);
		}
	}
	
	public String pintarCliente(){
		
		String cliente =
				"Cliente: \n" + 
				"\tNúmero de socio: " + Math.round(this.getNum_socio()) + "\n" + 
				"\tNombre: " + this.getNombre() + "\n" + 
				"\tApellido: " + this.getApellido() + "\n" +
				"\tDNI: " + this.getDni() + "\n" + 
				"\t" + this.direccion.pintarDireccion() + 
				"\tDescuento cliente: " + Math.round(this.getDto()) + "%\n";
		return cliente;
	}
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public double getNum_socio() {
		return num_socio;
	}
	public void setNum_socio(double num_socio) {
		this.num_socio = num_socio;
	}
	public double getDto() {
		return dto;
	}
	public void setDto(double dto) {
		this.dto = dto;
	}
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
}
