package ru.lazarev.lesson4.facade.factories;

import ru.lazarev.lesson4.facade.document.Document;
import ru.lazarev.lesson4.facade.document.Order;

public class ServiceManager extends Manager {

    public ServiceManager(String name) {
            super.department = "service";
    }

    @Override
    public Document createDocument() {
        return new Order();
    }
}
