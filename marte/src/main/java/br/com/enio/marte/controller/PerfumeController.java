package br.com.enio.marte.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.enio.marte.model.CarrinhoModel;
import br.com.enio.marte.model.EnumTipoPerfumeModel;
import br.com.enio.marte.model.PerfumeModel;
import br.com.enio.marte.model.SalvaDados;

@RestController
public class PerfumeController {

	@GetMapping("/cadastrar-perfume")
	public PerfumeModel Cadastrar(
			@RequestParam String nome,
			@RequestParam EnumTipoPerfumeModel tipo,
			@RequestParam BigDecimal valor
			) {
		PerfumeModel perfume = new PerfumeModel(nome,valor,tipo);
		SalvaDados.perfumes.add(perfume);
		return perfume;
	}
	@GetMapping("/listar")
	public List<PerfumeModel> listar(){
		return SalvaDados.perfumes;
	}
	@GetMapping("/editar")
	public PerfumeModel Editar(
			@RequestParam Long id,
			@RequestParam String nome,
			@RequestParam EnumTipoPerfumeModel tipo,
			@RequestParam BigDecimal valor) {
			String a = id.toString();
			Integer i = Integer.parseInt(a);
			if(id.equals(SalvaDados.perfumes.get(i-1).getId())) {
				SalvaDados.perfumes.get(i-1).Alterar(nome, valor, tipo);
				return SalvaDados.perfumes.get(i-1);
		}
		return null;
	}
	@GetMapping("/apagar")
	public void Apagar(
			@RequestParam Long id
			) {
		for(int i=0 ; i <SalvaDados.perfumes.size();i++) {
			if(SalvaDados.perfumes.get(i).getId().equals(id)) {
				SalvaDados.perfumes.remove(i);
			}
		}
	}
}
//http://localhost:8080/validar-cpf?cpf=12542870942
//http://localhost:8080/cadastrar-perfume?nome=batata&valor=120.00&tipo=EAU_DE_PARFUM