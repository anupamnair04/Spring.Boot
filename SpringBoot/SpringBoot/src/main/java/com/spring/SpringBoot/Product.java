package com.spring.SpringBoot;

import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Scope;
import org.springframework.beans.factory.annotation.Autowired;

@Component
@Scope("prototype")
public class Product {
		
		private int productId;
		private String productName;
		private double price;
		
		@Autowired
		private Address resAddr;

		public Product() {
			super();
			System.out.println("Default Constructor");
		}
		public Product(int productId, String productName, double price, Address resAddr) {
			super();
			this.productId = productId;
			this.productName = productName;
			this.price = price;
			this.resAddr = resAddr;
		}
		public int getProductId() {
			return productId;
		}
		public void setProductId(int productId) {
			this.productId = productId;
		}
		public String getProductName() {
			return productName;
		}
		public void setProductName(String productName) {
			this.productName = productName;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public Address getResAddr() {
			return resAddr;
		}
		public void setResAddr(Address resAddr) {
			this.resAddr = resAddr;
		}
		@Override
		public String toString() {
			return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price + ", resAddr="
					+ resAddr + "]";
		}
}