package net.luvina.shop.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Customers")
@Data
@NoArgsConstructor
public class Customer extends BaseEntity {
	@Column(length = 50, nullable = false)
	private String name;
	@Column(length = 150, nullable = true)
	private String email;
	@Column(length = 30, nullable = true)
	private String password;
	@Column(length = 15, nullable = true)
	private String phone;
	@Column(nullable = false)
	private Integer status;
	@OneToMany(mappedBy = "customer")
	private List<Order> orders;
}
