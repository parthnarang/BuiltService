package com.buiit.app.invoicegenerator.Service;

import com.buiit.app.invoicegenerator.Model.Invoice;
import com.buiit.app.invoicegenerator.Repositories.InvoiceRepository;
import com.buiit.app.invoicegenerator.utils.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserDataFetchService {
    @Autowired
    InvoiceRepository invoiceRepository;

    public List<Invoice> fetchInvoice(String id){
    List<Invoice> invoices = invoiceRepository.findByCustomerId(id);
    System.out.println("check");
    return invoices;
    }

}
