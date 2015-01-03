package AbstractFactory;

public class MasterComunicadorFactory implements ComunicadorFactory{
	private EmissorCreator emissorCreator = new EmissorCreator();
	private ReceptorCreator receptorCreator = new ReceptorCreator();
	
	
	public Emissor createEmissor() {
		
		return emissorCreator.create(EmissorCreator.MASTER);
	}

	public Receptor createReceptor() {
		
		return receptorCreator.create(ReceptorCreator.MASTER);
	}
}
