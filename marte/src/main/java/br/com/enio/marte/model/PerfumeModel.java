package br.com.enio.marte.model;

import java.math.BigDecimal;

public class PerfumeModel {
	private String nome;
	private BigDecimal valor;
	private EnumTipoPerfumeModel tipo;
	private Long id;
	
	private static  long gerador = 0;
	
	public PerfumeModel(String nome, BigDecimal valor,EnumTipoPerfumeModel tipo) {
		this.id=++gerador;
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
	public void Alterar(String nome,BigDecimal valor,EnumTipoPerfumeModel tipo) {
		this.nome=nome;
		this.valor=valor;
		this.tipo=tipo;
	}
}
