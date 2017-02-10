package br.com.casadocodigo.loja.controllers;

import org.springframework.web.bind.annotation.RequestMapping;

public class ProductsController {
	
	private ProductDAO productDAO;
	
	@RequestMapping("/produtos")
	public String save(){
		System.out.println("Cadastrando o produto");
		return "products/ok";
	}
	
	@RequestMapping("/produtos/form")
	public String form(){
		return "products/form";
	}
	
	@Autowired
	public String save(Product product){
		productDAO.save(product);
		return "products/ok";
	}
}
