package AbstractFactory;

public class TestaVisaComunicadorFactory {
	
	public static void main(String[] args) {
		ComunicadorFactory cf = new VisaComunicadorFactory();
		
		String transacao = "Valor=560;Senha=1234";
		Emissor emissor = cf.createEmissor();
		emissor.enviar(transacao);
		
		Receptor receptor = cf.createReceptor();
		String mensagem = receptor.recebe();
		System.out.println(mensagem);
	}
}
