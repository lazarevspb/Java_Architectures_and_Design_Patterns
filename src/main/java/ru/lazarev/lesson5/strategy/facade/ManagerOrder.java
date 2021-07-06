package ru.lazarev.lesson5.strategy.facade;

import ru.lazarev.lesson5.strategy.document.Order;

import java.util.List;

public interface ManagerOrder {
    List<Order> getManagerOrder(String name);
}
