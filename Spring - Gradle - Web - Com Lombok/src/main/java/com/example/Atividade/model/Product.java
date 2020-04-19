package com.example.Atividade.model;

import lombok.*;

@ToString
@NoArgsConstructor @AllArgsConstructor
@Getter @Setter
public class Product {
	public String name;
	public double price;
	public int amount;
}
