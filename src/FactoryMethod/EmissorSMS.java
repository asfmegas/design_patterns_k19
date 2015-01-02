package FactoryMethod;

public class EmissorSMS implements Emissor {

	public void enviar(String mensagem) {
		System.out.println("Enviado por SMS a mensagem:");
		System.out.println(mensagem);
	}
	
	
}
