package za.ac.nwu.ac.domain.dto;

import za.ac.nwu.ac.domain.persistence.AccountTransaction;
import za.ac.nwu.ac.domain.persistence.AccountTransactionDetails;

public class AccountTransactionDetailsDto {
    AccountTransactionDetails details;

    public AccountTransactionDetails buildAccountTransactionDetails(AccountTransaction createdAccountTransaction) {
        return details;
    }
}
