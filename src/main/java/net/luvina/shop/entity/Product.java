package net.luvina.shop.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Products")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product extends BaseEntity{
	@Column(length = 200, nullable = false)
	private String name;
	@Column(nullable = false)
	private Integer quanlity;
	@Column(nullable = false)
	private Float price;
	@Column(length = 255, nullable = true)
	private String image;
	@Column(columnDefinition = "TEXT")
	private String description;
	@Column
	private Float discount;
	@Column(nullable = false)
	private Integer status;
	@OneToMany(mappedBy = "product")
	private List<OrderDetail> details;
}
