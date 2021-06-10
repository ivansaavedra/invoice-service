package com.invoiceservice.api.invoice.entity;

import java.time.LocalDate;
import java.util.List;
import java.time.LocalDate;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;



import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@Document(collection = "invoice")
public class Invoice {

	
	@JsonProperty("id")
	private Integer idInvoice;
	
	@JsonProperty("customer_code")
	@NotNull(message="customer code is required")
	@Min(value=1, message="customer code must be greater than 0")
	private Integer customerCode;
	
	@JsonProperty("subtotal")
	@Transient
	@NotNull(message="subtotal is required")
	private Double subtotal;
	
	@JsonProperty("taxes")
	@Transient
	@NotNull(message="taxes code is required")
	private Double taxes;
	
	@JsonProperty("total")
	@Transient
	@NotNull(message="total code is required")
	private Double total;
	
	@JsonProperty("created_at")
	@NotNull(message="creation date is required!")
	private LocalDate createdAt;
	
	@JsonIgnore
	@NotNull(message="status is required!")
	private Integer status;
	
	@Transient
	@JsonProperty("invoice_items")
	@NotNull(message="invoice items are required!")
	private List<InvoiceItem> invoiceItems;

	public Integer getIdInvoice() {
		return idInvoice;
	}

	public void setIdInvoice(Integer idInvoice) {
		this.idInvoice = idInvoice;
	}

	public Integer getCustomerCode() {
		return customerCode;
	}

	public void setCustomerCode(Integer customerCode) {
		this.customerCode = customerCode;
	}

	public Double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}

	public Double getTaxes() {
		return taxes;
	}

	public void setTaxes(Double taxes) {
		this.taxes = taxes;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public LocalDate getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDate createdAt) {
		this.createdAt = createdAt;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public List<InvoiceItem> getInvoiceItems() {
		return invoiceItems;
	}

	public void setInvoiceItems(List<InvoiceItem> invoiceItems) {
		this.invoiceItems = invoiceItems;
	}	
	
	
	
	
}
