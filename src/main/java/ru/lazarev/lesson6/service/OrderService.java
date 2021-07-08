package ru.lazarev.lesson6.service;

import java.util.List;
import ru.lazarev.lesson6.document.Document;
import ru.lazarev.lesson6.document.impl.OrderImpl;
import ru.lazarev.lesson6.factories.Manager;
import ru.lazarev.lesson6.factories.ServiceManager;

public interface OrderService {
        Document getOrderById(Long id);
        ServiceManager GetServiceManagerByDocument(int id);
        List<Document> getOrderByManager(Manager manager);
}
