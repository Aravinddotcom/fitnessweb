package com.cts.caloriesvalues.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@Entity
@Table(name="calories")
public class CaloriesValues {
	
	@Id
//	@GeneratedValue(generator = "foodId")
	private int foodId;
	@Column(unique = true, nullable = false, name = "foodName")
	private String foodName;
	@Column(name = "caloriesValue")
	private int caloriesValue;

}
