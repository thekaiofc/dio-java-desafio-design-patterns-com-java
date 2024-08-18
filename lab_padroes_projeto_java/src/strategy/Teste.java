package strategy;

public class Teste {
	public static void main(String[] args) {
		
		// Testes relacionados ao Design Pattern Strategy:
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		robo.setStrategy(normal);
		robo.mover();
		robo.setStrategy(defensivo);
		robo.mover();
		robo.setStrategy(agressivo);
		robo.mover();
		}
}
