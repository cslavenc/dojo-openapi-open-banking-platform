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

/**
 * TODO : implement methods that return (static) data to the frontend
 * Feel free to modify the skeleton code below as you see fit
 */
@RestController
public class AccountController implements AccountsApi {

    @Override
    public ResponseEntity<AccountDetailsDTO> getAccountDetails(UUID accountId) {
        throw new NotImplementedException("Method not implemented");
    }

    @Override
    public ResponseEntity<BalanceDTO> getAccountBalances(UUID accountId) {
        throw new NotImplementedException("Method not implemented");
    }

    @Override
    public ResponseEntity<StatementDTO> getAccountStatement(UUID accountId) {
        throw new NotImplementedException("Method not implemented");
    }

    @Override
    public ResponseEntity<List<TransactionDTO>> getAccountTransactions(UUID accountId) {
        throw new NotImplementedException("Method not implemented");
    }

    @Override
    public ResponseEntity<Void> updateAccountDetails(UUID accountId, AccountDetailsDTO accountDetailsDTO) {
        throw new NotImplementedException("Method not implemented");
    }

    @Override
    public ResponseEntity<Void> deleteAccount(UUID accountId) {
        throw new NotImplementedException("Method not implemented");
    }
}
