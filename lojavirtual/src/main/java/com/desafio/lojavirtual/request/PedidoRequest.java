package com.desafio.lojavirtual.request;

import java.util.ArrayList;

import com.desafio.lojavirtual.model.ItemVendido;
import com.desafio.lojavirtual.model.Pedido;

public class PedidoRequest {
	
	private Pedido pedido;
	
	private ArrayList<ItemVendido> itensVendidos;

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public ArrayList<ItemVendido> getItensVendidos() {
		return itensVendidos;
	}

	public void setItensVendidos(ArrayList<ItemVendido> itensVendidos) {
		this.itensVendidos = itensVendidos;
	}
	
}
