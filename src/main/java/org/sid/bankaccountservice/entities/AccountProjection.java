package org.sid.bankaccountservice.entities;

import org.sid.bankaccountservice.enums.AccountType;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(types = BankAccount.class, name = "p1")
public interface AccountProjection {
    public String getId();

    public Double getBalance();
    public AccountType getType();

}
