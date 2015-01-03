package AbstractFactory;

public interface ComunicadorFactory {
	Emissor createEmissor();
	Receptor createReceptor();
}
