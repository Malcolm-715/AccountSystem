package za.ac.nwu.ac.logic.flow.impl;

import za.ac.nwu.ac.logic.flow.ModifyAccountTypeFlow;
import za.ac.nwu.ac.translator.AccountTypeTranslator;

import java.time.LocalDate;

public class ModifyAccountTypeFlowImpl implements ModifyAccountTypeFlow {

    private final AccountTypeTranslator accountTypeTranslator;

    public ModifyAccountTypeFlowImpl(AccountTypeTranslator accountTypeTranslator) {
        this.accountTypeTranslator = accountTypeTranslator;
    }

    @Override
    public Object updateAccountType(String anyString, String anyString1, LocalDate any) {
        return null;
    }

    @Override
    public Object deleteAccountType(String play) {
        return null;
    }
}
