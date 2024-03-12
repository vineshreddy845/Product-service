package com.microshop.Productservice.productservice;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "ProductService")
public class ProductService {


   Long Product_ID;
   String productname;
   String descripition;
   String price;
   Long Quantity_in_Stock;
   String category;
   String manufacturer;
   String releasedate;

}
