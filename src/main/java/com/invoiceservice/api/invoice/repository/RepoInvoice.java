package com.invoiceservice.api.invoice.repository;

import java.util.List;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import org.springframework.data.repository.query.Param;

import com.invoiceservice.api.invoice.entity.Invoice;

@Repository
public interface RepoInvoice extends MongoRepository<Invoice, Integer>{

	Optional<Invoice> findByIdInvoice(Integer idInvoice);
	//List<Invoice> getInvoices();

	//void deleteInvoice(@Param("id") Integer id);
}
