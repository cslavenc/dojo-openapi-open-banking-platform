package dojo.openapi.open_banking_platform.savingsgoal;

import dojo.openapi.open_banking_platform.api.SavingsGoalsApi;
import dojo.openapi.open_banking_platform.model.SavingsGoalDTO;
import org.apache.commons.lang3.NotImplementedException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * TODO : implement methods that return (static) data to the frontend
 * Feel free to modify the skeleton code below as you see fit
 */
@RestController
public class SavingsGoalController implements SavingsGoalsApi {

    @Override
    public ResponseEntity<SavingsGoalDTO> getSavingsGoalDetails(UUID goalId) {
        return null;
    }

    @Override
    public ResponseEntity<Void> createSavingsGoal(SavingsGoalDTO savingsGoalDTO) {
        return null;
    }

    @Override
    public ResponseEntity<Void> updateSavingsGoal(UUID goalId, SavingsGoalDTO savingsGoalDTO) {
        return null;
    }

    @Override
    public ResponseEntity<Void> deleteSavingsGoal(UUID goalId) {
        return null;
    }
}
