package dojo.openapi.open_banking_platform.budget;

import dojo.openapi.open_banking_platform.api.BudgetsApi;
import dojo.openapi.open_banking_platform.model.BudgetDTO;
import org.apache.commons.lang3.NotImplementedException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class BudgetController implements BudgetsApi {
    
    @Override
    public ResponseEntity<BudgetDTO> getBudgetDetails(UUID budgetId) {
        return new ResponseEntity<>(BudgetData.defaultBudget(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<BudgetDTO> createBudget(BudgetDTO budgetDTO) {
        return new ResponseEntity<>(BudgetData.defaultBudget(), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<BudgetDTO> updateBudgetSettings(UUID budgetId, BudgetDTO budgetDTO) {
        return new ResponseEntity<>(BudgetData.defaultBudget(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> deleteBudget(UUID budgetId) {
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
