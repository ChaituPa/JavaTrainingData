package one2many;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name ="ord")
public class Order {
	@Id
	@Column(name="ORDID")
	private int orderId;
	@Column(name="ORDERDATE")
	private Date orderDate;
	@Column(name="COMMPLAN")
	private String commPlan;
	@Column(name="CUSTID")
	private int custId;
	@Column(name="SHIPDATE")
	private Date shipDate;
	@Column(name="TOTAL")
	private int total;
	
	@ManyToOne
	@JoinColumn(name="customer")
	private Customer customer;

	public Order()
	{
		
	}

	public Order(int orderId, Date orderDate, String commPlan, int custId, Date shipDate, int total,
			Customer customer) {
		super();
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.commPlan = commPlan;
		this.custId = custId;
		this.shipDate = shipDate;
		this.total = total;
		this.customer = customer;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public String getCommPlan() {
		return commPlan;
	}

	public void setCommPlan(String commPlan) {
		this.commPlan = commPlan;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public Date getShipDate() {
		return shipDate;
	}

	public void setShipDate(Date shipDate) {
		this.shipDate = shipDate;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	
	
}
