package br.com.fiap.loja;

public class Aberto extends Situacao{

	@Override
	public void abrirChamado(Pedido pedido) {
		System.out.println("Chamado para financeiro");
	}

	@Override
	public void pagar(Pedido pedido) {
		pedido.setSituacao(new Pago());
	}

	@Override
	public void cancelar(Pedido pedido) {
		pedido.setSituacao(new Cancelado());
	}
	
	
}
