package com.bookstore.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "book")
public class Book {	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long bid;
	
	@Column(name = "b_name")
	private String name;
	
	private String author;
	
	private String price;
	
	@Column(name = "picByte", length = 1000)
	private byte[] picByte;
}
