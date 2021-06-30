package ru.lazarev.factory;


import ru.lazarev.factory.document.Document;
import ru.lazarev.factory.factories.Manager;

public class App {
    private static Manager manager;
    private static Document document;

    public static void main(String[] args) {
        document = manager.createDocument();
    }
}
