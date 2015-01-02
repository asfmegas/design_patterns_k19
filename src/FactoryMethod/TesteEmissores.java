package FactoryMethod;

public class TesteEmissores {

	public static void main(String[] args) {
		//Emissor emissor = new EmissorSMS();
		//emissor.enviar("Débito em conta");
		
		EmissorCreater ec = new EmissorCreater();
		Emissor emissor = ec.getCreateEmissor(2);
		emissor.enviar("Saque banco 24 horas");
		
		Emissor e = new EmissorCreater().getCreateEmissor(1);
		e.enviar("Nova mensagem");
	}
}
