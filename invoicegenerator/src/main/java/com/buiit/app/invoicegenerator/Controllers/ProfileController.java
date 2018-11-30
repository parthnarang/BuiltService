package com.buiit.app.invoicegenerator.Controllers;

import com.buiit.app.invoicegenerator.Model.Invoice;
import com.buiit.app.invoicegenerator.Service.UserDataFetchService;
import com.buiit.app.invoicegenerator.utils.Response;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping("/Mobile/")
public class ProfileController {
    @Autowired
    UserDataFetchService userDataFetchService;

  @GetMapping("profile")
  @ResponseBody
    public List<Invoice>  FetchuserInvoices(@RequestParam("id") String id ){
        System.out.println("Profile fetch for id = "+ id);

       List<Invoice> invoices= userDataFetchService.fetchInvoice(id);
       return invoices;
     /* ResponseEntity<List<Invoice>> entity = new ResponseEntity<List<Invoice>>(HttpStatus.CREATED);
      response.getOutputStream().write(finalResponse.getBytes());g
      response.setContentType();*/
    }

}
