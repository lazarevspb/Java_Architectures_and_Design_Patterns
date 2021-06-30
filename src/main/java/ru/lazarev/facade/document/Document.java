package ru.lazarev.facade.document;

public interface Document {
    Document copy ();
    void edit();
    void save();
}
