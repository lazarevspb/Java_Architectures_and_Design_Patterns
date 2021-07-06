package ru.lazarev.lesson3.factory.document;

public class Order implements Document{
    @Override
    public Document copy() {
        return new Order();
    }

    @Override
    public void edit() {

    }

    @Override
    public void save() {

    }
}
