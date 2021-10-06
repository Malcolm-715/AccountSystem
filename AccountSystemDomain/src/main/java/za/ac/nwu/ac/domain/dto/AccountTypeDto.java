package za.ac.nwu.ac.domain.dto;

import za.ac.nwu.ac.domain.persistence.AccountType;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class AccountTypeDto implements Serializable {
    private static final long serialVersionUID = 5624740256343553628L;
    private String mnemonic;
    private String accountTypeName;
    private LocalDate creationDate;

    public AccountTypeDto(){
    }

    public AccountTypeDto(String mnemonic, String accountTypeName, LocalDate creationDate){
        this.mnemonic = mnemonic;
        this.accountTypeName = accountTypeName;
        this.creationDate = creationDate;
    }

    public  AccountTypeDto(AccountType accountType){
        this.setAccountTypeName(accountType.getAccountTypeName());
        this.setCreationDate(accountType.getCreationDate());
        this.setMnemonic(accountType.getMnemonic());
    }

    private void setMnemonic(String mnemonic) { this.mnemonic = mnemonic;
    }

    public String getMnemonic() {
        return mnemonic;
    }

    private void setCreationDate(LocalDate creationDate) { this.creationDate = creationDate;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    private void setAccountTypeName(String accountTypeName) { this.accountTypeName = accountTypeName;
    }

    public String getAccountTypeName() {
        return accountTypeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountTypeDto that = (AccountTypeDto) o;
        return Objects.equals(mnemonic, that.mnemonic) && Objects.equals(accountTypeName, that.accountTypeName) && Objects.equals(creationDate, that.creationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mnemonic, accountTypeName, creationDate);
    }

    @Override
    public String toString() {
        return "AccountTypeDto{" +
                "mnemonic='" + mnemonic + '\'' +
                ", accountTypeName='" + accountTypeName + '\'' +
                ", creationDate=" + creationDate +
                '}';
    }
}
