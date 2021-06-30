package ru.lazarev.factory.document;

public interface Document {
    Document copy ();
    void edit();
    void save();
}
