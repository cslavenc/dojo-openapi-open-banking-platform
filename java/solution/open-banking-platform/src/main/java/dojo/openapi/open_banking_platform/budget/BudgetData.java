package dojo.openapi.open_banking_platform.budget;

import dojo.openapi.open_banking_platform.model.BudgetDTO;

import java.time.LocalDate;
import java.util.Map;
import java.util.UUID;

public class BudgetData {

    private static final UUID budgetId = UUID.randomUUID();
    private static final String name = "Budget";
    private static final LocalDate startDate = LocalDate.of(2019, 1, 1);
    private static final LocalDate endDate = LocalDate.of(2019, 12, 31);
    private static final Double savingsGoal = 8080.99;
    private static final Double monthlyIncome = 7070.70;
    private static final Map<String, Double> monthlyExpense = Map.of();

    public static BudgetDTO defaultBudget() {
        return new BudgetDTO()
                .budgetId(budgetId)
                .name(name)
                .startDate(startDate)
                .endDate(endDate)
                .savingsGoal(savingsGoal)
                .monthlyIncome(monthlyIncome)
                .monthlyExpenses(monthlyExpense);
    }
}
