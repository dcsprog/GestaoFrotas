package model;

public class Peca {

	public Peca(){
		
	}
	
	
	public Peca(int id_peca, String nomePeca, String descricaoPeca, float precoPeca) {
		super();
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

