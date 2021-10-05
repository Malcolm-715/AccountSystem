package za.ac.nwu.ac.logic.flow.impl;


import net.bytebuddy.asm.Advice;
import org.springframework.stereotype.Component;
import za.ac.nwu.ac.logic.flow.FetchAccountTypeFlow;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Component
public class FetchAccountTypeFlowImpl implements FetchAccountTypeFlow {

    @Override
    public List<AccountTypeDto> getAllAccountTypes(){
        List<AccountTypeDto> accountTypeDtos = new ArrayList<>();
        accountTypeDtos.add(new AccountTypeDto("MILES", "Miles", LocalDate.now()));
        return accountTypeDtos;
    }
}
