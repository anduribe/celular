/**
 * @(#)Celular.java
 *
 *
 * @author 
 * @version 1.00 2020/2/19
 */


public class Celular {
        //atributos de la clase (celular)
	private String marca;
	private String modelo;
	private String color;
	private int numero;
	
	//ingrese un dato nuevo al clonar el proyecto
	// constructor con parámetros
	// Celular celular = new Celular("sdf","dfg","ret",1234);
	public Celular(String marca, String modelo, String color, int numero) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.numero = numero;
	}
	
	//constructor vacio
	public Celular(){
		
	}
	
	// método hacer llamada
	public void llamar(String nombre){
		System.out.println("LLamando a "+ nombre);
	}
	
	//método finalizar llamada
	public void cortarLlamada(){
		System.out.println("Llamada finalizada");
	}
	
	//metodo para imprimir datos
	public void informarCaracteristicas(){
		System.out.println(String.format("Celular Marca: %s", marca));
		System.out.println(String.format("Celular  Modelo: %s", modelo));
		System.out.println(String.format("Celular Color: %s", color));		
	}
	
	//modifico valores
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}



 
	public static void main(String[] args) {
		//creo un nuevo objeto de tipo celular, con el constructor vacío
		Celular celular = new Celular();
		//Celular celular = new Celular("sdf","dfg","ret",1234);
		// le asigno la marca, modelo, y color
		celular.marca = "mi celular";
		//celular.setMarca("mi celular");
		celular.modelo = "225588";
		//celular.setModelo("65354");
		celular.color = "rojo";
		//celular.setColor("azul");
		celular.numero = 1234;
		//utilizo lo métodos, llamar, cortarLlamada e informar características
		celular.llamar("juan");
		celular.cortarLlamada();
		System.out.println();
		System.out.println("color: " + celular.getColor());
		System.out.println("Marca: " + celular.getMarca());
		System.out.println("Modelo: " + celular.getModelo());
		System.out.println ("numero: " + celular.numero);
		//celular.informarCaracteristicas();
	}
}
