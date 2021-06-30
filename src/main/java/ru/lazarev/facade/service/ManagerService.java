package ru.lazarev.facade.service;

import ru.lazarev.facade.factories.ServiceManager;

public interface ManagerService {
    ServiceManager getManagerByName(String name);
}
