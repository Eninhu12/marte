package br.com.enio.marte.model;

import java.util.List;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.SplittableRandom;

public class CarrinhoModel {
	private Long id;
	private EnumStatusItemCarrinhoModel status;
	private Integer qtd;
	private PerfumeModel p ;
	private List<ItemCarrinhoModel> itens;
	public CarrinhoModel() {
		this.id=new SplittableRandom().nextLong(100, 1000);
		this.status=EnumStatusItemCarrinhoModel.INICIALIZADO;
		this.itens=new ArrayList<ItemCarrinhoModel>();
	}
	public List<ItemCarrinhoModel> getItens() {
		return itens;
	}
	public Long getId() {
		return id;
	}
	public EnumStatusItemCarrinhoModel getStatus() {
		return status;
	}
	public Integer getQtd() {
		return qtd;
	}
	public PerfumeModel getP() {
		return p;
	}
	public void addPerfume(PerfumeModel p , Integer qtd) {
		if(EnumStatusItemCarrinhoModel.FINALIZADO.equals(this.status)) {
			throw new RuntimeException("Carrinho finalizado");
		}
		this.itens.add(new ItemCarrinhoModel(p,qtd));
	}
	public void finalizar() {
		this.status=EnumStatusItemCarrinhoModel.FINALIZADO;
	}
	public BigDecimal getValorTotal() {
		BigDecimal soma = BigDecimal.ZERO;
		for(ItemCarrinhoModel i : itens) {
			soma = soma.add(i.getValorTotal());
		}
		return soma;
	}
}
