package br.com.casadocodigo.loja.controllers;

import javax.transaction.Transactional;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Transactional
public class HomeController {

	@RequestMapping("/")
	public String index(){
		System.out.println("Carregando os produtos");
		return "hello-world";
	}
	
	
}
