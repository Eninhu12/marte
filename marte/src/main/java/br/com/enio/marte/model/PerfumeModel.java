package br.com.enio.marte.model;

import java.math.BigDecimal;
import java.util.SplittableRandom;

public class PerfumeModel {
	private String nome;
	private BigDecimal valor;
	private EnumTipoPerfumeModel tipo;
	private Long id;
	
	public PerfumeModel(String nome, BigDecimal valor,EnumTipoPerfumeModel tipo) {
		this.id=new SplittableRandom().nextLong(10, 100);
		this.nome=nome;
		this.valor=valor;
		this.tipo=tipo;
	}

	public String getNome() {
		return nome;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public EnumTipoPerfumeModel getTipo() {
		return tipo;
	}

	public Long getId() {
		return id;
	}
}
