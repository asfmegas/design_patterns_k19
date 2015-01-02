package FactoryMethod;

public class EmissorJMS implements Emissor {

	public void enviar(String mensagem) {
		System.out.println("Enviado por JMS a mensagem:");
		System.out.println(mensagem);
	}
}
