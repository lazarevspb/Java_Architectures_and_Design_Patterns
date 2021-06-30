package ru.lazarev.factory.factories;

import ru.lazarev.factory.document.Document;

public abstract class Manager {
    protected String name;
    protected String department;

    public String getDepartment() {
        return department;
    }

    public abstract Document createDocument();
}
