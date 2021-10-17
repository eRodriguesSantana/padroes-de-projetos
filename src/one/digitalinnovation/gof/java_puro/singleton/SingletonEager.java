package one.digitalinnovation.gof.java_puro.singleton;

/**
 * Singleton "apressado"
 * 
 * @author Eduardo R. Santana
 *
 */
public class SingletonEager {

	private static SingletonEager instancia = new SingletonEager();
	
	private SingletonEager() {
		super();
	}
	
	public static SingletonEager getInstancia() {
		return instancia;
	}
}
