package ru.lazarev.lesson5.strategy.factories;

import ru.lazarev.lesson5.strategy.document.Document;

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
