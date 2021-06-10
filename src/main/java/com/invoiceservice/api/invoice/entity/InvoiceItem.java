package com.invoiceservice.api.invoice.entity;

import java.time.LocalDate;
import java.util.List;


import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class InvoiceItem {
	
	
	@JsonProperty("id")
	private Integer idItem;
	
	@JsonProperty("id_invoice")
	private Integer idInvoice;
	
	@JsonProperty("quantity")
	@NotNull(message="quantity is required")
	@Min(value=1, message="quantity must be greater than 0")
	private Integer quantity;
	
	@JsonProperty("tax_percentage")
	@NotNull(message="tax percentage is required")
	private Double taxPercentage;
	
	@JsonProperty("subtotal")
	private Double subtotal;
	
	@JsonProperty("unit_price")
	private Double unitPrice;
	
	@JsonProperty("total")
	private Double total;
	
	@JsonProperty("product_code")
	@NotNull(message="product code is required")
	@Pattern(regexp="[a-zA-Z0-9]*", message="product code can only cointain alphanumeric characters")
	private String productCode;

	public Integer getIdItem() {
		return idItem;
	}

	public void setIdItem(Integer idItem) {
		this.idItem = idItem;
	}

	public Integer getIdInvoice() {
		return idInvoice;
	}

	public void setIdInvoice(Integer idInvoice) {
		this.idInvoice = idInvoice;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getTaxPercentage() {
		return taxPercentage;
	}

	public void setTaxPercentage(Double taxPercentage) {
		this.taxPercentage = taxPercentage;
	}

	public Double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}

	public Double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
