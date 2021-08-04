package br.com.enio.marte.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import br.com.enio.marte.model.ItemCarrinhoModel;

@RestController
public class CarrinhoController {

	@GetMapping("/carrinho")
	public ItemCarrinhoModel Carrinhar(
			@RequestParam(value = "id") Long id){
		return new ItemCarrinhoModel(null, null);
	}
}
//http://localhost:8080/validar-cpf?cpf=12542870942
