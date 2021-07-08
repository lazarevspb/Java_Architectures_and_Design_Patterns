package ru.lazarev.lesson6.model;

import java.time.LocalDateTime;
import ru.lazarev.lesson6.document.impl.OrderImpl;
import ru.lazarev.lesson6.factories.ServiceManager;

public class Order extends OrderImpl {
  private Long id;
  private ServiceManager owner;
  private LocalDateTime createdAt;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public ServiceManager getOwner() {
    return owner;
  }

  public void setOwner(ServiceManager owner) {
    this.owner = owner;
  }

  public LocalDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(LocalDateTime createdAt) {
    this.createdAt = createdAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Order)) {
      return false;
    }

    Order order = (Order) o;

    if (!getId().equals(order.getId())) {
      return false;
    }
    if (!getOwner().equals(order.getOwner())) {
      return false;
    }
    return getCreatedAt().equals(order.getCreatedAt());
  }

  @Override
  public int hashCode() {
    int result = getId().hashCode();
    result = 31 * result + getOwner().hashCode();
    result = 31 * result + getCreatedAt().hashCode();
    return result;
  }
}
