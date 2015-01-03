package AbstractFactory;

public class ReceptorCreator {
	public static final int VISA = 0;
	public static final int MASTER = 1;
	
	public Receptor create(int tipoEmissor){
		if(tipoEmissor == ReceptorCreator.VISA){
			return new ReceptorVisa();
		}else if(tipoEmissor == ReceptorCreator.MASTER){
			return new ReceptorMaster();
		}else{
			throw new IllegalArgumentException (" Tipo de emissor não suportado ");
		}
	}
}
