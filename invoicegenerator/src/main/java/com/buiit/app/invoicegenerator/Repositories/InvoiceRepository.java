package com.buiit.app.invoicegenerator.Repositories;

import com.buiit.app.invoicegenerator.Model.Invoice;
import com.buiit.app.invoicegenerator.Model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface InvoiceRepository  extends MongoRepository<Invoice,String> {
    List<Invoice> findByCustomerId(String id);

}
