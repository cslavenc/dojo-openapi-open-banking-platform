package dojo.openapi.open_banking_platform.savingsgoal;

import dojo.openapi.open_banking_platform.api.SavingsGoalsApi;
import dojo.openapi.open_banking_platform.model.SavingsGoalDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class SavingsGoalController implements SavingsGoalsApi {

    @Override
    public ResponseEntity<SavingsGoalDTO> getSavingsGoalDetails(UUID goalId) {
        return new ResponseEntity<>(new SavingsGoalDTO(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<SavingsGoalDTO> createSavingsGoal(SavingsGoalDTO savingsGoalDTO) {
        return new ResponseEntity<>(savingsGoalDTO, HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Void> updateSavingsGoal(UUID goalId, SavingsGoalDTO savingsGoalDTO) {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> deleteSavingsGoal(UUID goalId) {
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
