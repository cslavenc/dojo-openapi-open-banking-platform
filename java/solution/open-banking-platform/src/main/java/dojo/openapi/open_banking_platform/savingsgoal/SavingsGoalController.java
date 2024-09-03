package dojo.openapi.open_banking_platform.savingsgoal;

import dojo.openapi.open_banking_platform.api.SavingsGoalsApi;
import dojo.openapi.open_banking_platform.model.SavingsGoalDTO;
import org.apache.commons.lang3.NotImplementedException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class SavingsGoalController implements SavingsGoalsApi {

    @Override
    public ResponseEntity<SavingsGoalDTO> getSavingsGoalDetails(UUID goalId) {
        throw new NotImplementedException("Method not implemented");
    }

    @Override
    public ResponseEntity<Void> createSavingsGoal(SavingsGoalDTO savingsGoalDTO) {
        throw new NotImplementedException("Method not implemented");
    }

    @Override
    public ResponseEntity<Void> updateSavingsGoal(UUID goalId, SavingsGoalDTO savingsGoalDTO) {
        throw new NotImplementedException("Method not implemented");
    }

    @Override
    public ResponseEntity<Void> deleteSavingsGoal(UUID goalId) {
        throw new NotImplementedException("Method not implemented");
    }
}
