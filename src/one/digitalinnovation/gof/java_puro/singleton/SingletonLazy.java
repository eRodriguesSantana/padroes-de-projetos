package one.digitalinnovation.gof.java_puro.singleton;

/**
 * Singleton "pregui�oso"
 * 
 * @author Eduardo R. Santana
 *
 */
public class SingletonLazy {

	private static SingletonLazy instancia;
	
	private SingletonLazy() {
		super();
	}
	
	public static SingletonLazy getInstancia() {
		if(instancia == null) {
			instancia = new SingletonLazy();
		}
		return instancia;
	}
}
