package ru.lazarev.facade.facade;

import ru.lazarev.facade.document.Order;
import ru.lazarev.facade.factories.Manager;
import ru.lazarev.facade.service.ManagerService;
import ru.lazarev.facade.service.OrderService;

import java.util.List;

public class ManagerOrderService implements ManagerOrder {
    private OrderService orderService;
    private ManagerService managerService;

    @Override
    public List<Order> getManagerOrder(String name) {
        Manager manager = managerService.getManagerByName(name);
        return orderService.getOrderByManager(manager);
    }
}
