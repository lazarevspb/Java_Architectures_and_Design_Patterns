package ru.lazarev.lesson6.factories;

import ru.lazarev.lesson6.document.Document;
import ru.lazarev.lesson6.document.impl.OrderImpl;

public class ServiceManager extends Manager {

    public ServiceManager(String name) {
            super.department = "service";
    }

    @Override
    public Document createDocument() {
        return new OrderImpl();
    }
}
