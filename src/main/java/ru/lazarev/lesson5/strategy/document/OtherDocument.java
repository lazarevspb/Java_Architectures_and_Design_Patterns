package ru.lazarev.lesson5.strategy.document;

public class OtherDocument implements Document {
    @Override
    public Document copy() {
        return new OtherDocument();
    }

    @Override
    public void edit() {

    }

    @Override
    public void save() {

    }
}
