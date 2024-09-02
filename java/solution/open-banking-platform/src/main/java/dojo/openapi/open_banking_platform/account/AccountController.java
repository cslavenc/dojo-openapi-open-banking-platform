package dojo.openapi.open_banking_platform.account;

import dojo.openapi.open_banking_platform.api.AccountsApi;
import dojo.openapi.open_banking_platform.model.AccountDetailsDTO;
import dojo.openapi.open_banking_platform.model.BalanceDTO;
import dojo.openapi.open_banking_platform.model.StatementDTO;
import dojo.openapi.open_banking_platform.model.TransactionDTO;
import org.apache.commons.lang3.NotImplementedException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
public class AccountController implements AccountsApi {

    @Override
    public ResponseEntity<AccountDetailsDTO> getAccountDetails(UUID accountId) {
        return new ResponseEntity<>(AccountData.defaultAccountDetails(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<BalanceDTO> getAccountBalances(UUID accountId) {
        return new ResponseEntity<>(AccountData.defaultBalance(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<StatementDTO> getAccountStatement(UUID accountId) {
        return new ResponseEntity<>(AccountData.defaultStatement(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<TransactionDTO>> getAccountTransactions(UUID accountId) {
        return new ResponseEntity<>(AccountData.defaultTransactions(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> updateAccountDetails(UUID accountId, AccountDetailsDTO accountDetailsDTO) {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> deleteAccount(UUID accountId) {
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
