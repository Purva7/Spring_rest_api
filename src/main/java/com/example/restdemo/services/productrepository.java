package com.example.restdemo.services;

/**
 * Created by purvayadkikar on 6/5/17.
 */

import com.example.restdemo.model.product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "products", path = "products")
public interface productrepository extends MongoRepository<product, String> {

}
