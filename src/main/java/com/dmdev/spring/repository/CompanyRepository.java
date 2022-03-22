package com.dmdev.spring.repository;

import com.dmdev.spring.database.ConnectionPool;

public class CompanyRepository {

  private final ConnectionPool connectionPool;

  public CompanyRepository(ConnectionPool connectionPool) {
    this.connectionPool = connectionPool;
  }

  public static CompanyRepository of(ConnectionPool connectionPool) {
    return new CompanyRepository(connectionPool);
  }
}
