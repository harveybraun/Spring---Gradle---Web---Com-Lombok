package com.example.Atividade.model;

import lombok.*;

/**
 * Descreve a Classe Product
 *
 * @author Harvey Braun
 * @version 1.0
 * @since 19/04/2020 - 15:00
 */
@ToString
@NoArgsConstructor @AllArgsConstructor
@Getter @Setter
public class Product {
	public String name;
	public double price;
	public int amount;
}
