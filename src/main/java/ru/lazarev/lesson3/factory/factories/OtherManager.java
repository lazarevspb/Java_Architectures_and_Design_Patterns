package ru.lazarev.lesson3.factory.factories;

import ru.lazarev.lesson3.factory.document.Document;
import ru.lazarev.lesson3.factory.document.OtherDocument;

public class OtherManager extends Manager {

    public OtherManager() {
        super.department = "other";
    }


    @Override
    public Document createDocument() {
        return new OtherDocument();
    }
}
