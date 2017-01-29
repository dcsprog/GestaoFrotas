package model;

public class Carro implements IReparacao{

	public Carro(){
		
	}
	
	public Carro(int id_carro, String marca, String modelo, String matricula, String combustivel, float valorAtestado,
			float kmInio, float kmFinal, boolean estado) {
		super();
		this.id_carro = id_carro;
		this.marca = marca;
		this.modelo = modelo;
		this.matricula = matricula;
		this.combustivel = combustivel;
		this.valorAtestado = valorAtestado;
		this.kmInio = kmInio;
		this.kmFinal = kmFinal;
		this.estado = estado;
	}

	private int id_carro;
	private String marca;
	private String modelo;
	private String matricula;
	private String combustivel;
	private float valorAtestado;
	private float kmInio;
	private float kmFinal;
	private boolean estado;
	public int getId_carro() {
		return id_carro;
	}

	public void setId_carro(int id_carro) {
		this.id_carro = id_carro;
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

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}

	public float getValorAtestado() {
		return valorAtestado;
	}

	public void setValorAtestado(float valorAtestado) {
		this.valorAtestado = valorAtestado;
	}

	public float getKmInio() {
		return kmInio;
	}

	public void setKmInio(float kmInio) {
		this.kmInio = kmInio;
	}

	public float getKmFinal() {
		return kmFinal;
	}

	public void setKmFinal(float kmFinal) {
		this.kmFinal = kmFinal;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	
	
	
}
