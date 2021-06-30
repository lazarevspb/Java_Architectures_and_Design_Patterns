package ru.lazarev.facade;


import ru.lazarev.facade.document.Document;
import ru.lazarev.facade.document.Order;
import ru.lazarev.facade.facade.ManagerOrderService;
import ru.lazarev.facade.factories.Manager;
import ru.lazarev.facade.factories.ServiceManager;

import java.util.List;

public class App {
    private static Manager manager;
    private static Document document;
    private static ManagerOrderService mos;

    public static void main(String[] args) {
        manager = new ServiceManager("Ivan");
        document = manager.createDocument();
        List<Order> orders = mos.getManagerOrder(manager.getName());
    }
}
