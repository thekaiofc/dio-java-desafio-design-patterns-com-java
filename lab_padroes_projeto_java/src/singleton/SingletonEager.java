package singleton;

//Singleton "apressado".
public class SingletonEager {

	private static SingletonEager instancia;

	public SingletonEager() {
		super();
	}
	
	public static SingletonEager getInstancia() {
		return instancia;		
	}
}
