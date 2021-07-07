package ru.lazarev.lesson5.strategy.service;

import ru.lazarev.lesson5.strategy.factories.ServiceManager;

public interface ManagerService {
    ServiceManager getManagerByName(String name);
}
