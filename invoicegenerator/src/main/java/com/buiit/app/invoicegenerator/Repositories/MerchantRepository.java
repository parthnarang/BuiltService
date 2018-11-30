package com.buiit.app.invoicegenerator.Repositories;

import com.buiit.app.invoicegenerator.Model.Merchant;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MerchantRepository  extends MongoRepository<Merchant,String> {
// List<Invoice> findByCustomerId(String id);
}