package ru.lazarev.lesson5.strategy.document;

public interface Document {
    Document copy ();
    void edit();
    void save();
}
