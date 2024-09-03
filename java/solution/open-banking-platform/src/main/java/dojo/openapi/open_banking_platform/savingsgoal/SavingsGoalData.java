package dojo.openapi.open_banking_platform.savingsgoal;

import dojo.openapi.open_banking_platform.model.SavingsGoalDTO;

import java.time.LocalDate;
import java.util.UUID;

public class SavingsGoalData {

    private static final UUID goalId = UUID.randomUUID();
    private static final String name = "Savings Goal";
    private static final Double targetAmount = 25000.25;
    private static final Double progress = 10100.50;
    private static final LocalDate startDate = LocalDate.of(2020, 1, 1);
    private static final LocalDate endDate = LocalDate.of(2020, 12, 31);

    public static SavingsGoalDTO defaultSavingsGoal() {
        return new SavingsGoalDTO()
                .goalId(goalId)
                .name(name)
                .targetAmount(targetAmount)
                .progress(progress)
                .startDate(startDate)
                .endDate(endDate);
    }
}
