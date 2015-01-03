package AbstractFactory;

public class ReceptorMaster implements Receptor{

	public String recebe() {
		System.out.println("Recebendo mensagem da MasterCard");
		return "Mensagem da MasterCard";
	}
}
