package FactoryMethod;

public class EmissorCreater {
	public static final int SMS = 0;
	public static final int EMAIL = 1;
	public static final int JMS = 2;
	
	public Emissor getCreateEmissor(int tipoEmissor){
		if(tipoEmissor == EmissorCreater.SMS){
			return new EmissorSMS();
		}else if(tipoEmissor == EmissorCreater.EMAIL){
			return new EmissorEmail();
		}else if(tipoEmissor == EmissorCreater.JMS){
			return new EmissorJMS();
		}else{
			throw new IllegalArgumentException (" Tipo de emissor não suportado ");
		}
	}
}
