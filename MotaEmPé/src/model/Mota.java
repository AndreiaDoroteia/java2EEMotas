package model;

public class Mota {

	int id;
	String marca, modelo;
	String cc;
	public Mota(int id, String marca, String modelo, String cc) {
		super();
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.cc = cc;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public String getCc() {
		return cc;
	}
	public void setCc(String cc) {
		this.cc = cc;
	}	
}
