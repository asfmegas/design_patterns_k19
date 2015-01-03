package AbstractFactory;

public class EmissorMaster implements Emissor{

	public void enviar(String mensagem) {
		System.out.println("Enviando a seguinte mensagem para a Master:");
		System.out.println(mensagem);
	}
}
