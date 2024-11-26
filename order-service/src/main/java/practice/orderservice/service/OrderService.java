package practice.orderservice.service;

import practice.orderservice.dto.OrderRequest;

public interface OrderService {
    String placeorder(OrderRequest orderRequest);
}
