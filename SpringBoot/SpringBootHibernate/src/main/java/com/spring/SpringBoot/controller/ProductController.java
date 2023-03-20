package com.spring.SpringBoot.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.SpringBoot.entity.Product;
import com.spring.SpringBoot.service.ProductService;

@Controller
public class ProductController {

	    @Autowired
		ProductService service;

		@RequestMapping("/")
		public String entryPointMethod() {
			System.out.println("entrypoint method invoked...");
			return "homepage.jsp";
		}

		@RequestMapping("/getAllProducts")
		public ModelAndView getAllProducts() {
			System.out.println("controller-getAllProducts invoked..");
			ModelAndView mv = new ModelAndView();
			List<Product> prodList = service.getProducts();
			mv.addObject("prodList", prodList);
			mv.setViewName("displayProducts.jsp");
			return mv;
		}

		@RequestMapping("/getprobyid")
		public ModelAndView getProductInfoById(HttpServletRequest request) {
			int pid = Integer.parseInt(request.getParameter("pid"));
			Product prod = service.getProductById(pid);
			ModelAndView mv = new ModelAndView();
			mv.addObject("prod", prod);
			mv.setViewName("info.jsp");
			return mv;
		}
		
		@RequestMapping("/savepro")
		public String saveProduct() {
			service.saveProduct(new Product(7776,"new product", 77676));
			return "savesuccess.jsp";
		}
}