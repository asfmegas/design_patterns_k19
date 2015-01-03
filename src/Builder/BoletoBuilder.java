package Builder;

import java.util.Calendar;

public interface BoletoBuilder {
	
	void builderSacado(String sacado);
	void builderCedente(String cedente);
	void builderValor(double valor);
	void builderVencimento(Calendar vencimento);
	void builderNossoNumero(int nossoNumero);
	
	Boleto getBoleto();
}
