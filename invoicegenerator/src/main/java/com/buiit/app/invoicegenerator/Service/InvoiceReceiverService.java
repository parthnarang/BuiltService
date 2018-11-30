package com.buiit.app.invoicegenerator.Service;

import com.buiit.app.invoicegenerator.Model.Invoice;
import com.buiit.app.invoicegenerator.Repositories.InvoiceRepository;
import com.buiit.app.invoicegenerator.utils.Response;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

@Service
public class InvoiceReceiverService {
   @Autowired
    private ApplicationContext applicationContext;

   @Autowired
    private InvoiceRepository invoiceRepository;

    public Response addNewInvoice(Invoice invoice) {
        applicationContext = new ClassPathXmlApplicationContext("Beans.xml");
        Response response = (Response) applicationContext.getBean(Response.class);

        invoiceRepository.save(invoice);
        return response;
    }
}
