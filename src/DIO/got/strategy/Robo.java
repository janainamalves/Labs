package DIO.got.strategy;

public class Robo {
	
	private Comportamento comportamento;

	public void setComportamento(Comportamento comportamento) {
		this.comportamento = comportamento;
	}
	
	public void  over() {
		comportamento.mover();
	}
}
