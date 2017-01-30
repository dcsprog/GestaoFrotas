package model;

public class Reparar extends Carro implements IReparacao, IPeca{
	


	public Reparar(int id_reparacao, String dataTempoInicio, String dataTempoFinal, Peca peca, int id_carro, String marca, String modelo, String matricula,int ano,
			float kmInio, float kmFinal, String pecaAvariada, boolean estado, int id_combustivel, String nomeCombustivel, float valorAbastecido) {
		super(id_carro, marca, modelo, matricula, ano, kmInio, kmFinal, pecaAvariada, estado, id_combustivel, nomeCombustivel, valorAbastecido);
		this.id_reparacao = id_reparacao;
		this.dataTempoInicio = dataTempoInicio;
		this.dataTempoFinal = dataTempoFinal;
		this.peca = peca;
	}

	


	private int id_reparacao;
	private String dataTempoInicio;
	private String dataTempoFinal;
	private Peca peca;
	
	
	
	public int getId_reparacao() {
		return id_reparacao;
	}



	public void setId_reparacao(int id_reparacao) {
		this.id_reparacao = id_reparacao;
	}



	public String getDataTempoInicio() {
		return dataTempoInicio;
	}



	public void setDataTempoInicio(String dataTempoInicio) {
		this.dataTempoInicio = dataTempoInicio;
	}



	public String getDataTempoFinal() {
		return dataTempoFinal;
	}



	public void setDataTempoFinal(String dataTempoFinal) {
		this.dataTempoFinal = dataTempoFinal;
	}



	public Peca getPeca() {
		return peca;
	}



	public void setPeca(Peca peca) {
		this.peca = peca;
	}



	@Override
	public void novaPeca() {
		// TODO Auto-generated method stub
		
	}

}
