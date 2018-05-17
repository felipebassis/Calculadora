package br.com.db1.start.calculadora;

public class Calculadora {
	
	private Double numero1;
	
	private Double numero2;
	
	private String operacao;
	
	public String getOperacao() {
		return operacao;
	}

	public void setOperacao(String operacao) {
		this.operacao = operacao;
	}

	private Boolean confirma;

	public Calculadora(){
		
	}
	
	public Calculadora(Boolean confirma){
		this.confirma = confirma;
	}
	
	public Boolean getConfirma() {
		return confirma;
	}

	public void setConfirma(Boolean confirma) {
		this.confirma = confirma;
	}

	public Double getNumero1() {
		return numero1;
	}

	public void setNumero1(Double numero1) {
		this.numero1 = numero1;
	}
	
	public Double getNumero2() {
		return numero2;
	}

	public void setNumero2(Double numero2) {
		this.numero2 = numero2;
	}

	public Double getSoma(){
		return numero1 + numero2;
	}
	
	public Double getSubtracao(){
		return numero1 - numero2;
	}
	
	public Double getMultiplicacao(){
		return numero1 * numero2;
	}
	
	public Double getDivisao(){
		return numero1 / numero2;
	}
	
	public void zerar(){
		this.numero1 = 0.0;
		this.numero2 = 0.0;
	}
}
