package br.com.enio.marte.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.enio.marte.model.PessoaFisicaModel;

@RestController
public class PessoaFisicaController {

	@GetMapping("/validar-cpf")
	public PessoaFisicaModel validarCpf(
			@RequestParam(value = "cpf") String cpf) {
		return new PessoaFisicaModel(cpf);
	}
}
//http://localhost:8080/validar-cpf?cpf=12542870942