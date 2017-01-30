package model;

public class Carro extends Combustivel implements IReparacao, ICombustivel{

	public Carro(){
		
	}
	
	
	

	public Carro(int id_carro, String marca, String modelo, String matricula,int ano,float kmInio, float kmFinal, String pecaAvariada,
			boolean estado, int id_combustivel, String nomeCombustivel, float valorAbastecido) {
		
		super(id_combustivel, nomeCombustivel, valorAbastecido);
		
		this.id_carro = id_carro;
		this.marca = marca;
		this.modelo = modelo;
		this.matricula = matricula;
		this.ano = ano;
		this.kmInio = kmInio;
		this.kmFinal = kmFinal;
		this.pecaAvariada = pecaAvariada;
		this.estado = estado;
	}




	private int id_carro;
	private String marca;
	private String modelo;
	private String matricula;
	private int ano;
	private float kmInio;
	private float kmFinal;
	private String pecaAvariada;
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


	public int getAno() {
		return ano;
	}




	public void setAno(int ano) {
		this.ano = ano;
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




	public String getPecaAvariada() {
		return pecaAvariada;
	}




	public void setPecaAvariada(String pecaAvariada) {
		this.pecaAvariada = pecaAvariada;
	}




	public boolean isEstado() {
		return estado;
	}




	public void setEstado(boolean estado) {
		this.estado = estado;
	}




	@Override
	public void manutencao() {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void raparar() {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void trocarPeca() {
		// TODO Auto-generated method stub
		
	}



}
	