package net.luvina.shop.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@NoArgsConstructor
@Data
public class Order {
	@ManyToOne
	@JoinColumn(name = "customer_id", nullable = false)
	private Customer customer;
	@Column(nullable = false)
	private Float amount;
	@Column(nullable = false)
	private Integer status;
	@OneToMany(mappedBy = "order")
	private List<OrderDetail> orderDetails;
}
