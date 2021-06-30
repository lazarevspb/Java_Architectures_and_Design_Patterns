package ru.lazarev.facade.factories;

import ru.lazarev.facade.document.Document;
import ru.lazarev.facade.document.OtherDocument;

public class OtherManager extends Manager {

    public OtherManager() {
        super.department = "other";
    }


    @Override
    public Document createDocument() {
        return new OtherDocument();
    }
}
