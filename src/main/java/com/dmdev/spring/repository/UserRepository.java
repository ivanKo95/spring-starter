package com.dmdev.spring.repository;

import com.dmdev.spring.database.ConnectionPool;

public class UserRepository {

  private final ConnectionPool connectionPool;

  public UserRepository(ConnectionPool connectionPool) {
    this.connectionPool = connectionPool;
  }
}
