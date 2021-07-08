package ru.lazarev.lesson6.factories;

import ru.lazarev.lesson6.document.Document;

public abstract class Manager {
    protected String name;
    protected String department;

    public String getDepartment() {
        return department;
    }

    public String getName() {
        return name;
    }

    public abstract Document createDocument();
}
