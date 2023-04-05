package com.Dao;

import java.util.List;


import javax.transaction.Transactional;

import org.hibernate.LockMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.Entities.Product;

@Component
public class ProductDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	// create new product
	public void createProduct(Product product) {
		
		this.hibernateTemplate.save(product);
	}
	
	// get all product
	public List<Product> getAllProduct(){
		List<Product> p = this.hibernateTemplate.loadAll(Product.class);
		
		return p;
	}
	
	//delete single product
	@Transactional
	public void deleteProduct(int pid) {
		Product load = this.hibernateTemplate.load(Product.class, pid);
		
		this.hibernateTemplate.delete(load);
	}
	
	
	//get single product
	public Product getProduct(int pid) {
		return this.hibernateTemplate.get(Product.class, pid);
	}
	
	@Transactional
	public void updateProduct(Product p) {
		
		this.hibernateTemplate.update(p, LockMode.NONE);
		
		
	}
	
	
}
