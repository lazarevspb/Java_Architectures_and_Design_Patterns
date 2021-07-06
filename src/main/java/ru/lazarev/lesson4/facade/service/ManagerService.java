package ru.lazarev.lesson4.facade.service;

import ru.lazarev.lesson4.facade.factories.ServiceManager;

public interface ManagerService {
    ServiceManager getManagerByName(String name);
}
