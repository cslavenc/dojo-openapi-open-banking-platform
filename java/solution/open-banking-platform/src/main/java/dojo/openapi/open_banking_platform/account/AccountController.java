package dojo.openapi.open_banking_platform.account;

import dojo.openapi.open_banking_platform.api.AccountsApi;
import dojo.openapi.open_banking_platform.model.AccountDetailsDTO;
import dojo.openapi.open_banking_platform.model.BalanceDTO;
import dojo.openapi.open_banking_platform.model.StatementDTO;
import dojo.openapi.open_banking_platform.model.TransactionDTO;
import org.apache.commons.lang3.NotImplementedException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
public class AccountController implements AccountsApi {
    @Override
    public ResponseEntity<BalanceDTO> accountsAccountIdBalancesGet(UUID accountId) {
        throw new NotImplementedException("Method not implemented");
    }

    @Override
    public ResponseEntity<Void> accountsAccountIdDelete(UUID accountId) {
        throw new NotImplementedException("Method not implemented");
    }

    @Override
    public ResponseEntity<AccountDetailsDTO> accountsAccountIdGet(UUID accountId) {
        throw new NotImplementedException("Method not implemented");
    }

    @Override
    public ResponseEntity<Void> accountsAccountIdPut(UUID accountId, AccountDetailsDTO accountDetailsDTO) {
        throw new NotImplementedException("Method not implemented");
    }

    @Override
    public ResponseEntity<StatementDTO> accountsAccountIdStatementsGet(UUID accountId) {
        throw new NotImplementedException("Method not implemented");
    }

    @Override
    public ResponseEntity<List<TransactionDTO>> accountsAccountIdTransactionsGet(UUID accountId) {
        throw new NotImplementedException("Method not implemented");
    }
}
