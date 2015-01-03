package Builder;

public class TestarGeradorBoleto {
	
	public static void main(String[] args) {
		BoletoBuilder boletoBuilder = new ItauBoletoBuilder();
		GeradorBoleto geradorBoleto = new GeradorBoleto(boletoBuilder);
		Boleto boleto = geradorBoleto.gerarBoleto();
		System.out.println(boleto);
	}
}
