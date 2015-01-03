package AbstractFactory;

public class TestaMasterComunicadorFactory {
	
	public static void main(String[] args) {
		ComunicadorFactory cf = new MasterComunicadorFactory();
		
		String transacao = "Valor=1200;Sanha=321"; 
		Emissor emissor = cf.createEmissor();
		emissor.enviar(transacao);
		
		Receptor receptor = cf.createReceptor();
		String mensagem = receptor.recebe();
		System.out.println(mensagem);
		
	}
}
