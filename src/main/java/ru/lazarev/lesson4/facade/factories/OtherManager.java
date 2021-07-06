package ru.lazarev.lesson4.facade.factories;

import ru.lazarev.lesson4.facade.document.Document;
import ru.lazarev.lesson4.facade.document.OtherDocument;

public class OtherManager extends Manager {

    public OtherManager() {
        super.department = "other";
    }


    @Override
    public Document createDocument() {
        return new OtherDocument();
    }
}
