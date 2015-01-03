package AbstractFactory;

public class ReceptorVisa implements Receptor{

	public String recebe() {
		System.out.println("Recebendo mensagem da visa.");
		return "Mensagem Visa";
	}
}
