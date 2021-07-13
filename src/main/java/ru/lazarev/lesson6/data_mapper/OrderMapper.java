package ru.lazarev.lesson6.data_mapper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import ru.lazarev.lesson6.exception.ResourceNotFoundException;
import ru.lazarev.lesson6.model.Order;
import ru.lazarev.lesson6.service.OrderService;

public class OrderMapper {

  OrderService orderService;
  private final Connection connection;

  public OrderMapper(Connection connection) {
    this.connection = connection;
  }

  public Order findById(Long id) throws SQLException {
    PreparedStatement statement = connection.prepareStatement(
        "SELECT ID, CREATED_AT FROM ORDER WHERE ID = ?");
    statement.setLong(1, id);
    try (ResultSet resultSet = statement.executeQuery()) {
      while (resultSet.next()) {
        Order order = new Order();
        order.setId(resultSet.getLong(1));
        order.setOwner(orderService.GetServiceManagerByDocument(resultSet.getInt(1)));
        order.setCreatedAt(LocalDateTime.parse(resultSet.getString(3)));
        return order;
      }
    }
    throw new ResourceNotFoundException(id);
  }
}

