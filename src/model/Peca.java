package model;

public class Peca extends Carro {


	public Peca(){
		super();
	}
	


	public Peca( int id_peca, String nomePeca, String descricaoPeca, float precoPeca, int id_carro, String marca, String modelo,
			String matricula,int ano, float kmInio, float kmFinal, String pecaAvariada, boolean estado, 
			int id_combustivel, String nomeCombustivel, float valorAbastecido) {
		
		super(id_carro, marca, modelo, matricula, ano, kmInio, kmFinal, pecaAvariada, estado, id_combustivel, nomeCombustivel, valorAbastecido);
		this.id_peca = id_peca;
		this.nomePeca = nomePeca;
		this.descricaoPeca = descricaoPeca;
		this.precoPeca = precoPeca;
	}

	

	private int id_peca;
	private String nomePeca;
	private String descricaoPeca;
	private float precoPeca;
	
	public int getId_peca() {
		return id_peca;
	}


	public void setId_peca(int id_peca) {
		this.id_peca = id_peca;
	}


	public String getNomePeca() {
		return nomePeca;
	}


	public void setNomePeca(String nomePeca) {
		this.nomePeca = nomePeca;
	}


	public String getDescricaoPeca() {
		return descricaoPeca;
	}


	public void setDescricaoPeca(String descricaoPeca) {
		this.descricaoPeca = descricaoPeca;
	}


	public float getPrecoPeca() {
		return precoPeca;
	}


	public void setPrecoPeca(float precoPeca) {
		this.precoPeca = precoPeca;
	}
	
	


}

