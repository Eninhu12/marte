package br.com.enio.marte.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.enio.marte.model.CarrinhoModel;
import br.com.enio.marte.model.SalvaDados;

@RestController
public class CarrinhoController {

	@GetMapping("/carrinho")
	public CarrinhoModel CarrinhoDeCompras(
			@RequestParam Long id) 
	{
		for(int i =0 ; i<SalvaDados.perfumes.size();i++)
		if(id.equals(SalvaDados.perfumes.get(i).getId())) {
			CarrinhoModel.itens.add(SalvaDados.perfumes);
		}
		
		return null;
	}
}
//http://localhost:8080/validar-cpf?cpf=12542870942
