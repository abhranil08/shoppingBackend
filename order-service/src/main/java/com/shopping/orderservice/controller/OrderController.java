package com.shopping.orderservice.controller;

import java.util.concurrent.CompletableFuture;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.orderservice.dto.OrderRequest;
import com.shopping.orderservice.services.OrderService;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.timelimiter.annotation.TimeLimiter;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/order")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @CircuitBreaker(name = "inventory", fallbackMethod = "fallBackPlaceOrder")
    @TimeLimiter(name = "inventory")

    public CompletableFuture<String> placeOrder(@RequestBody OrderRequest orderRequest)
    {
        return CompletableFuture.supplyAsync(() -> orderService.placeOrder(orderRequest));
    }
    public CompletableFuture<String> fallBackPlaceOrder(OrderRequest orderRequest, RuntimeException runtimeException)
    {
        return CompletableFuture.supplyAsync(() -> "Something is wrong our inventory manager!");
    }
}
