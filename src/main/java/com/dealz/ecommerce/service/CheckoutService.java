package com.dealz.ecommerce.service;

import com.dealz.ecommerce.dto.Purchase;
import com.dealz.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {
    PurchaseResponse placeOrder(Purchase purchase);
}
