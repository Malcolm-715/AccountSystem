package za.ac.nwu.ac.domain.dto;

import org.junit.Test;

import static org.junit.Assert.*;

public class AccountTypeDtoTest {

    @Test
    public void getMnemonic() {
        AccountTypeDto accountTypeDto = new AccountTypeDto();
        assertNull(accountTypeDto.getMnemonic());
    }
}