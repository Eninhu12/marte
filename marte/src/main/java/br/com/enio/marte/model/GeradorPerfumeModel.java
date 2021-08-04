package br.com.enio.marte.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.SplittableRandom;

public class GeradorPerfumeModel {
	public List<PerfumeModel> gerar() {
		List<PerfumeModel> perfumes = new ArrayList<PerfumeModel>();
		BigDecimal cem =BigDecimal.valueOf(100);
		SplittableRandom a = new SplittableRandom();
		String[] nomes = {"Invictus","Ferrari","Entity Dulce Amor","Lady Million","La Vie Est Belle","Pure XS","Oso Woman","Boss Bottled Night","Pino Silvestre","Alien Perfume"};
		EnumTipoPerfumeModel [] tipos = {EnumTipoPerfumeModel.EAU_DE_PARFUM,EnumTipoPerfumeModel.EAU_DE_TOILETTE}; 
		for(int i=0;i<6;i++) {
			String nome = nomes[a.nextInt(0,nomes.length)]; 
			BigDecimal valor = geraValorRandom(a,cem);
			EnumTipoPerfumeModel tipo =tipos[a.nextInt(0,tipos.length)];
			PerfumeModel p = new PerfumeModel(nome,valor,tipo);
			perfumes.add(p);
		}
		return perfumes;
	}
	private BigDecimal geraValorRandom(SplittableRandom sr , BigDecimal cem) {
		Integer numero =sr.nextInt(0,10000);
		return BigDecimal.valueOf(numero).divide(cem);
	}

}
