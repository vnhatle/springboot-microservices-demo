package practice.productservice.service;

import practice.productservice.dto.ProductRequest;
import practice.productservice.dto.ProductResponse;

import java.util.List;

public interface ProductService {

    void createProduct(ProductRequest productRequest);

    List<ProductResponse> getAllProducts();
}
