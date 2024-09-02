package dojo.openapi.open_banking_platform.account;

import dojo.openapi.open_banking_platform.model.AccountDetailsDTO;
import dojo.openapi.open_banking_platform.model.BalanceDTO;
import dojo.openapi.open_banking_platform.model.StatementDTO;
import dojo.openapi.open_banking_platform.model.TransactionDTO;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

/**
 * This classes uses the builder pattern with lombok annotations (generated with openapi on DTO directly)
 * It makes use of the builder and object mother pattern to return static default data
 */
public class AccountData {

    private static final UUID accountId = UUID.fromString("123e4567-e89b-12d3-a456-426614174000");
    private static final String accountHolderName = "Neo";
    private static final String accountType = "PERSONAL";
    private static final double balance = 8080.25;
    private static final String currency = "CHF";
    private static final boolean active = true;
    private static final String description = "personal account";
    private static final OffsetDateTime lastUpdated = OffsetDateTime.now();
    private static final OffsetDateTime createdAt = OffsetDateTime.now();
    private static final OffsetDateTime updatedAt = OffsetDateTime.now();

    public static AccountDetailsDTO defaultAccountDetails() {
        return new AccountDetailsDTO()
                .accountId(accountId)
                .accountHolderName(accountHolderName)
                .accountType(accountType)
                .balance(BigDecimal.valueOf(balance))
                .currency(currency)
                .lastUpdated(lastUpdated);
    }

    public static BalanceDTO defaultBalance() {
        return new BalanceDTO()
                .balance(BigDecimal.valueOf(balance))
                .currency(currency);
    }

    public static StatementDTO defaultStatement() {
        return new StatementDTO()
                .statementId(accountId)
                .currency(currency)
                .totalAmount(BigDecimal.valueOf(balance))
                .startDate(LocalDate.now())
                .endDate(LocalDate.now().plusDays(1));
    }

    public static List<TransactionDTO> defaultTransactions() {
        return List.of(new TransactionDTO[]{
                new TransactionDTO()
                        .transactionId(accountId)
                        .amount(BigDecimal.valueOf(balance))
                        .currency(currency)
                        .description(description)
                        .transactionDate(createdAt)
        });
    }

}
