package com.project.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.project.demo.controller.CategoryController;
import com.project.demo.controller.ProductController;
import com.project.demo.model.Category;
import com.project.demo.model.Product;


@SpringBootApplication
public class CategoryProductJpaRestApplication implements CommandLineRunner {


	@Autowired
	private ProductController productController;
	
	@Autowired
	private CategoryController categoryController;

	
	public static void main(String[] args) {
		SpringApplication.run(CategoryProductJpaRestApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("\n\n Data of Products Entity\n\n");
		addProducts(createProducts());
		
		System.out.println("\n\n Data of Categories Entity\n\n");
		addCategories(createCategories());
	}

	//method to add Product
	private void addProducts(List<Product> products) {
		for(Product product : products) {	
			productController.save(product);
		}
	}
	
	//method to create List of Product
	private List<Product> createProducts(){
		List<Product> products = new ArrayList<Product>();
		
		Product p1 = new Product("Kit-Kat", 25, 50, false, null);
		
		Product p2 = new Product("Milky-Bar",5,200,false,null);
		
		Product p3 = new Product("Munch", 20, 60, false, null);
		
		Product p4 = new Product("Perk", 80, 20, false, null);
		
		Product p5 = new Product("Burbon",25,30,false,null);
		
		Product p6 = new Product("Good Day",30,80,false,null);
		
		Product p7 = new Product("Oreo",20,50,false,null);
		
		Product p8 = new Product("Butter Bake",5,70,true,null);
		
		Product p9 = new Product("SkyBags",4500,10,false,null);
		
		Product p10 = new Product("American-Tourister",4200,7,false,null);
		
		Product p11 = new Product("Safari",5000,9,false,null);
		
		Product p12 = new Product("Puma",6000,12,true,null);
		
		Product p13 = new Product("Ankle Boot",1000,86,false,null);
		
		Product p14 = new Product("Ankle shoes",1200,63,true,null);
		
		Product p15 = new Product("Boots for men",4000,45,false,null);
		
		Product p16 = new Product("Kitto",2500,150,false,null);
		
		
	
		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);
		products.add(p5);
		products.add(p6);
		products.add(p7);
		products.add(p8);
		products.add(p9);
		products.add(p10);
		products.add(p11);
		products.add(p12);
		products.add(p13);
		products.add(p14);
		products.add(p15);
		products.add(p16);
		
		return products;
	}

	//method to add Category
	private void addCategories(List<Category> categories) {
		for(Category category : categories) {	
			categoryController.save(category);
		}
	}
	
	//method to create List of Category
	private List<Category> createCategories(){
		List<Category> categories = new ArrayList<Category>();
		
		Category c1 = new Category("Chocolates", "Sweet and delicious delicacy", null);
		
		Category c2 = new Category("Cookies", "Sweet-salty and crispy cookies", null);
		
		Category c3 = new Category("Bags", "Available in all sizes for all purpose", null);
		
		Category c4 = new Category("Footwear", "Rough-tough and durable", null);
		
		categories.add(c1);
		categories.add(c2);
		categories.add(c3);
		categories.add(c4);
		
		return categories;
	}

}
