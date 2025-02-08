package com.spring_security.services;

import com.spring_security.dto.SignupRequest;
import com.spring_security.entities.Customer;

public interface AuthService {





	Customer createCustomer(SignupRequest signupRequest);

}
