package ru.lazarev.factory.factories;

import ru.lazarev.factory.document.Document;
import ru.lazarev.factory.document.OtherDocument;

public class OtherManager extends Manager {

    public OtherManager() {
        super.department = "other";
    }


    @Override
    public Document createDocument() {
        return new OtherDocument();
    }
}
