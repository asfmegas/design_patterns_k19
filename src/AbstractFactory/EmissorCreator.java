package AbstractFactory;

public class EmissorCreator {
	public static final int VISA = 0;
	public static final int MASTER = 1;
	
	public Emissor create(int tipoEmissor){
		if(tipoEmissor == EmissorCreator.VISA){
			return new EmissorVisa();
		}else if(tipoEmissor == EmissorCreator.MASTER){
			return new EmissorMaster();
		}else{
			throw new IllegalArgumentException (" Tipo de emissor não suportado ");
		}
	}
}
