package ru.lazarev.facade.factories;

import ru.lazarev.facade.document.Document;
import ru.lazarev.facade.document.Order;

public class ServiceManager extends Manager {

    public ServiceManager(String name) {
            super.department = "service";
    }

    @Override
    public Document createDocument() {
        return new Order();
    }
}
