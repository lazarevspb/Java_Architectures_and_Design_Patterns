package ru.lazarev.facade.service;

import ru.lazarev.facade.document.Order;
import ru.lazarev.facade.factories.Manager;

import java.util.List;

public interface OrderService {
        Order getOrderById(Long id);
        List<Order> getOrderByManager(Manager manager);
}
