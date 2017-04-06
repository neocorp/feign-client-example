package com.example.feignclient.accessor;

import com.example.feignclient.model.Product;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("restapiapplication")
public interface RestAPIAccessor {

    @RequestMapping(path = "/api/products/{id}", method = RequestMethod.GET)
    public Product getProductFromRestAPI(@PathVariable(value = "id") String id);
}
