public class Minado {
	private Juego instanciaJuego;

	public Minado(Juego instanciaJuego){
		this.instanciaJuego = instanciaJuego;
		setCoin(new MonedaBTC);
	}

	public void minar(){
		this.instanciaJuego.getEstadistica().incrementar();
	}

	public void setCoin(Moneda moneda){
		this.instanciaJuego.setMoneda(moneda)
	}

}


Programa:
	Minado minado = new Minado(instanciaJuego);
	minado.minar();
	/*
		Click
	*/
	minado.minar();
	/*
		Click
		LLEGO A LAS MONEDAS SUFICIENTES PARA CAMBIAR DE NIVEL
		(deberia validar eso despues de incrementar la estadistica)*
		Si tiene que cambiar de nivel, unicamente sigue:
	*/
	//En Juego:
	cambiarMoneda();
	minado.setCoin(new MonedaETH)
	/*
		Click
	*/
	minado.minar(); //aca estaria minando ETH