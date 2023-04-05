package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import com.Dao.ProductDao;
import com.Entities.Product;

@Controller
public class HomeController {
	
	@Autowired
	private ProductDao productDao;
	
	@RequestMapping(value = "/home")
	public String home(Model m) {
		List<Product> products = productDao.getAllProduct();
		m.addAttribute("product", products);
		return "home";
	}
	
	
//	show add product form
	@RequestMapping(value = "/add-product")
	public String addProduct(Model m) {
		m.addAttribute("title", "Add Product");
		return "add-product-form";
	}
	
	
//	handle add product form
	@RequestMapping(value = "/handle-product" ,method = RequestMethod.POST)
	public RedirectView handleProduct(@ModelAttribute Product product,HttpServletRequest request) {
		System.out.println(product);
		productDao.createProduct(product);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/");
		return redirectView;
		
	}
	
//	delete handler
	@RequestMapping("/delete/{productId}")
	public RedirectView delete(@PathVariable ("productId") int productId,HttpServletRequest request) {
		productDao.deleteProduct(productId);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/");
		return redirectView;
	}
	
	
//	update handler
	@RequestMapping(value = "/update/{productId}",method = RequestMethod.GET)
	public String updateForm(@ModelAttribute Product p,Model model,@PathVariable("productId") int pid,HttpServletRequest request) {
		Product product = productDao.getProduct(pid);
		System.out.println(product);
		model.addAttribute("product", product);
		//System.out.println(addAttribute);
//		this.productDao.updateProduct(product);
//		RedirectView redirectView = new RedirectView();
//		redirectView.setUrl(request.getContextPath()+"/");
		
		return "update_form";
		
		
	}
	
	
	@RequestMapping(value = "/handle_update" , method = RequestMethod.GET)
	public RedirectView handleUpdate(@ModelAttribute Product product,HttpServletRequest request) {
		productDao.updateProduct(product);
		 RedirectView redirectView = new RedirectView();
		 redirectView.setUrl(request.getContextPath()+"/");
		 return redirectView;
		
		
	}
	
	

}
