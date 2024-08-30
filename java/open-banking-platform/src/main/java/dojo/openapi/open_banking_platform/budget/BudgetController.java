package dojo.openapi.open_banking_platform.budget;

import dojo.openapi.open_banking_platform.api.BudgetsApi;
import dojo.openapi.open_banking_platform.model.BudgetDTO;
import org.apache.commons.lang3.NotImplementedException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * TODO : implement methods that return (static) data to the frontend
 * Feel free to modify the skeleton code below as you see fit
 */
@RestController
public class BudgetController implements BudgetsApi {
    @Override
    public ResponseEntity<Void> budgetsBudgetIdDelete(UUID budgetId) {
        throw new NotImplementedException("Method not implemented");
    }

    @Override
    public ResponseEntity<BudgetDTO> budgetsBudgetIdGet(UUID budgetId) {
        throw new NotImplementedException("Method not implemented");
    }

    @Override
    public ResponseEntity<Void> budgetsBudgetIdPut(UUID budgetId, BudgetDTO budgetDTO) {
        throw new NotImplementedException("Method not implemented");
    }

    @Override
    public ResponseEntity<Void> budgetsCreatePost(BudgetDTO budgetDTO) {
        throw new NotImplementedException("Method not implemented");
    }
}
