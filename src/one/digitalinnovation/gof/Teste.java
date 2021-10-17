package one.digitalinnovation.gof;

import one.digitalinnovation.gof.java_puro.facade.Facade;
import one.digitalinnovation.gof.java_puro.singleton.SingletonEager;
import one.digitalinnovation.gof.java_puro.singleton.SingletonLazy;
import one.digitalinnovation.gof.java_puro.singleton.SingletonLazyHolder;
import one.digitalinnovation.gof.java_puro.strategy.Comportamento;
import one.digitalinnovation.gof.java_puro.strategy.ComportamentoAgressivo;
import one.digitalinnovation.gof.java_puro.strategy.ComportamentoDefensivo;
import one.digitalinnovation.gof.java_puro.strategy.ComportamentoNormal;
import one.digitalinnovation.gof.java_puro.strategy.Robo;

public class Teste {

	public static void main(String[] args) {
		
		//Testes relacionados ao Design Pattern Singleton
		
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
		System.out.println(holder);
		holder = SingletonLazyHolder.getInstancia();
		System.out.println(holder);
		
		//Testes relacionados ao Design Pattern Strategy
		
		Comportamento normal = new ComportamentoNormal();
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		robo.setStrategy(normal);
		robo.mover();
		robo.mover();
		robo.setStrategy(defensivo);
		robo.mover();
		robo.setStrategy(agressivo);
		robo.mover();
		robo.mover();
		robo.mover();
		
		//Testes relacionados ao Design Pattern Strategy
		
		Facade facade = new Facade();
		facade.migrarCliente("Eduardo", "19200-000");


	}

}
