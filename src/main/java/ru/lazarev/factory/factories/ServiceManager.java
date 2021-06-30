package ru.lazarev.factory.factories;

import ru.lazarev.factory.document.Document;
import ru.lazarev.factory.document.Order;

public class ServiceManager extends Manager{

    public ServiceManager() {
            super.department = "service";
    }

    @Override
    public Document createDocument() {
        return new Order();
    }
}
