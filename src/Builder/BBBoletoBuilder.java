package Builder;

import java.util.Calendar;

public class BBBoletoBuilder implements BoletoBuilder{
	private String sacado;
	private String cedente;
	private double valor;
	private Calendar vencimento;
	private int nossoNumero;
	
	public void builderSacado(String sacado) {
		this.sacado = sacado;
		
	}

	public void builderCedente(String cedente) {
		this.cedente = cedente;
		
	}

	public void builderValor(double valor) {
		this.valor = valor;
		
	}

	public void builderVencimento(Calendar vencimento) {
		this.vencimento = vencimento;
		
	}

	public void builderNossoNumero(int nossoNumero) {
		this.nossoNumero = nossoNumero;
		
	}

	public Boleto getBoleto() {
		
		return new BBBoleto(sacado, cedente, valor, vencimento, nossoNumero);
	}

}
