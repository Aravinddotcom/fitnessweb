package com.cts.fitnessweb.model;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name="proteinlist")
public class Protein{
	
	@Id
	private int stockId;
	@Column(unique = true, nullable = false, name = "productName")
	private String productName;
	@Column(name = "proteinValue")
	private int proteinValue;

}
