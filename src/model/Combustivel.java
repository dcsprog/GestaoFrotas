package model;

public class Combustivel {

	
	public Combustivel(){
		
	}
	
	
	public Combustivel(int id_combustivel, String nomeCombustivel, float valorAbastecido) {
		super();
		this.id_combustivel = id_combustivel;
		this.nomeCombustivel = nomeCombustivel;
		this.valorAbastecido = valorAbastecido;
	}


	private int id_combustivel;
	private String nomeCombustivel;
	private float valorAbastecido;
	
	
	public int getId_combustivel() {
		return id_combustivel;
	}


	public void setId_combustivel(int id_combustivel) {
		this.id_combustivel = id_combustivel;
	}


	public String getNomeCombustivel() {
		return nomeCombustivel;
	}


	public void setNomeCombustivel(String nomeCombustivel) {
		this.nomeCombustivel = nomeCombustivel;
	}


	public float getValorAbastecido() {
		return valorAbastecido;
	}


	public void setValorAbastecido(float valorAbastecido) {
		this.valorAbastecido = valorAbastecido;
	}
	
	
}
