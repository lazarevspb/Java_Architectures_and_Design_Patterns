package ru.lazarev.facade.facade;

import ru.lazarev.facade.document.Order;

import java.util.List;

public interface ManagerOrder {
    List<Order> getManagerOrder(String name);
}
