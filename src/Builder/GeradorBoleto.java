package Builder;

import java.util.Calendar;

public class GeradorBoleto {
	private BoletoBuilder boletoBuilder;
	
	public GeradorBoleto(BoletoBuilder boletoBuilder){
		this.boletoBuilder = boletoBuilder;
	}
	
	public Boleto gerarBoleto(){
		this.boletoBuilder.builderSacado("Carbono Torrado da Silva");
		this.boletoBuilder.builderCedente("K19 Treinamento");
		this.boletoBuilder.builderValor(100.34);
		Calendar vencimento = Calendar.getInstance();
		vencimento.add(Calendar.DATE, 30);
		this.boletoBuilder.builderVencimento(vencimento);
		
		this.boletoBuilder.builderNossoNumero(50);
		
		Boleto boleto = boletoBuilder.getBoleto();
		
		return boleto;
	}
}
