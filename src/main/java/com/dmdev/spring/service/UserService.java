package com.dmdev.spring.service;

import com.dmdev.spring.repository.CompanyRepository;
import com.dmdev.spring.repository.UserRepository;

public class UserService {

  private final UserRepository userRepository;
  private final CompanyRepository companyRepository;
  CompanyService companyService;

  public UserService(UserRepository userRepository, CompanyRepository companyRepository) {
    this.userRepository = userRepository;
    this.companyRepository = companyRepository;
  }

  public void setCompanyService(CompanyService companyService) {
    this.companyService = companyService;
  }
}
