package br.com.casadocodigo.loja.controllers;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.casadocodigo.loja.daos.ProductDAO;
import br.com.casadocodigo.loja.models.Product;

@Controller
@Transactional
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
