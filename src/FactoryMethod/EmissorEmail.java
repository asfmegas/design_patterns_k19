package FactoryMethod;

public class EmissorEmail implements Emissor {

	public void enviar(String mensagem) {
		System.out.println("Enviado por Email a mensagem:");
		System.out.println(mensagem);
	}
}
