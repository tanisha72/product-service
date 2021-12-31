package com.ibm.product.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductObject {


	@JsonProperty("ProductId")
	private int productId;
	
	@JsonProperty("ProductName")
	private String productName;
	
	@JsonProperty("AvailableQuantity")
	private int availableQuantity;
	
	@JsonProperty("Price")
	private double price;
	
}
