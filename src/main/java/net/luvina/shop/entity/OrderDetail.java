package net.luvina.shop.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "OrderDetails")
@Data
@NoArgsConstructor
public class OrderDetail extends BaseEntity {
	@ManyToOne
	@JoinColumn(name = "order_id")
	private Order order;
	@Column(nullable = false)
	private Integer quantity;
	@Column(nullable = false)
	private Float price;

	@ManyToOne
	@JoinColumn(name = "product_id")
	private Product product;
}
