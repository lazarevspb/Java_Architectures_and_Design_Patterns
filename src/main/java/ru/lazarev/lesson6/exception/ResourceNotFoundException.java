package ru.lazarev.lesson6.exception;

public class ResourceNotFoundException extends RuntimeException {
  public ResourceNotFoundException(String message) {
    super(message);
  }

  public ResourceNotFoundException(Long id) {
    super("not found order id:" + id);
  }
}
