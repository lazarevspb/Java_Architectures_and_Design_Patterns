package ru.lazarev.lesson6.document;

public interface Document {
    Document copy ();
    void edit();
    void save();
}
