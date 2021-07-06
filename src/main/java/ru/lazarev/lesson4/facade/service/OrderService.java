package ru.lazarev.lesson4.facade.service;

import ru.lazarev.lesson4.facade.document.Order;
import ru.lazarev.lesson4.facade.factories.Manager;

import java.util.List;

public interface OrderService {
        Order getOrderById(Long id);
        List<Order> getOrderByManager(Manager manager);
}
