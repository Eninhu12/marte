package br.com.enio.marte.model;

import java.math.BigDecimal;
import java.util.SplittableRandom;

public class ItemCarrinhoModel {
	private Long id;
	private PerfumeModel p;
	private Integer qtd;
	private BigDecimal total;
	
	public ItemCarrinhoModel(PerfumeModel p,Integer qtd) {
		this.id=new SplittableRandom().nextLong(100, 1000);
		this.p=p;
		this.qtd=qtd;
		this.total=p.getValor().multiply(BigDecimal.valueOf(qtd));
	}

	public Long getId() {
		return id;
	}

	public PerfumeModel getP() {
		return p;
	}

	public Integer getQtd() {
		return qtd;
	}
	public BigDecimal getValorTotal() {
		return total;
	}
}
