# API Sample

This is a possible API interpretation of `PROPOSAL.md`. It serves as a sample. Parts or the entire API can be used to
implement the openapi specification.

## Endpoints

Account Information Service (AIS)

- GET /accounts/{accountId}: Retrieve account details.
- GET /accounts/{accountId}/balances: Get current account balances.
- GET /accounts/{accountId}/transactions: Fetch transaction history.
- GET /accounts/{accountId}/statements: Access account statements.
- PUT /accounts/{accountId}: Update account details.
- DELETE /accounts/{accountId}: Close or delete an account.

Payment Initiation Service (PIS)

- POST /payments/initiate: Create a new payment.
- GET /payments/{paymentId}: Retrieve payment details.
- PUT /payments/{paymentId}: Update payment status or details.
- DELETE /payments/{paymentId}: Cancel a payment.
- GET /payments/history: View payment history.

Financial Management Tools

- POST /budgets/create: Set up a new budget.
- GET /budgets/{budgetId}: Retrieve budget details.
- PUT /budgets/{budgetId}: Update budget settings.
- DELETE /budgets/{budgetId}: Delete a budget.
- POST /savings-goals/create: Establish a savings goal.
- GET /savings-goals/{goalId}: View savings goal details.
- PUT /savings-goals/{goalId}: Modify savings goal parameters.
- DELETE /savings-goals/{goalId}: Remove a savings goal.

Personal Finance Management (PFM)

- POST /expenses/log: Record a new expense.
- GET /expenses/report: Generate a report of expenses.
- POST /taxes/estimate: Calculate estimated tax liability.
- GET /insurances/comparison: Compare insurance options.
- POST /investments/add: Add investments to portfolio.
- GET /investments/portfolio: View investment portfolio.

Credit and Lending Services

- GET /credit-scores/check: Check personal credit score.
- POST /loans/application: Apply for a loan.
- GET /loans/applications: Review loan applications.
- GET /mortgages/calculate: Calculate mortgage payments.
- POST /credit-reports/generate: Generate a credit report.

Utility and Bill Pay Services

- POST /bills/pay: Make a bill payment.
- GET /bills/paid: View paid bills.
- GET /bills/overdue: List overdue bills.
- GET /energy/consumption: Monitor energy usage.

Shopping and Rewards Programs

- GET /prices/comparison: Compare product prices.
- POST /rewards/earn: Earn rewards points.
- POST /rewards/redemption: Redeem rewards points.
- GET /coupons/offers: View available coupons and offers.

Security and Fraud Protection

- GET /fraud/detection: Check for fraudulent activity.
- POST /identity/verify: Verify user identity.
- GET /security/alerts: View security alerts and notifications.

Accessibility and Inclusion

- GET /financial-literacy/resources: Access financial literacy resources.
- GET /accessibility/features: Learn about accessibility features.
- POST /feedback/submission: Submit feedback or report issues.

## Data Transfer Objects

### Account Information Service (AIS) DTOs

- **AccountDetailsDTO**
    - accountId: UUID
    - accountHolderName: String
    - accountType: String
    - balance: Double
    - currency: String
    - lastUpdated: LocalDateTime

- **TransactionDTO**
    - transactionId: UUID
    - amount: Double
    - currency: String
    - transactionDate: LocalDateTime
    - description: String

- **StatementDTO**
    - statementId: UUID
    - startDate: LocalDate
    - endDate: LocalDate
    - totalAmount: Double
    - currency: String
    - transactions: List<TransactionDTO>

### Payment Initiation Service (PIS) DTOs

- **PaymentRequestDTO**
    - paymentId: UUID
    - amount: Double
    - currency: String
    - recipient: String
    - description: String

- **PaymentResponseDTO**
    - paymentId: UUID
    - status: String
    - message: String
    - transactionId: UUID

### Financial Management Tools DTOs

- **BudgetDTO**
    - budgetId: UUID
    - name: String
    - monthlyIncome: Double
    - monthlyExpenses: Map<String, Double>
    - savingsGoal: Double
    - startDate: LocalDate
    - endDate: LocalDate

- **SavingsGoalDTO**
    - goalId: UUID
    - name: String
    - targetAmount: Double
    - startDate: LocalDate
    - endDate: LocalDate
    - progress: Double

### Personal Finance Management (PFM) DTOs

- **ExpenseLogDTO**
    - expenseId: UUID
    - amount: Double
    - category: String
    - date: LocalDate
    - description: String

- **TaxEstimationDTO**
    - taxableIncome: Double
    - deductions: Double
    - taxLiability: Double

### Credit and Lending Services DTOs

- **LoanApplicationDTO**
    - applicationId: UUID
    - applicantName: String
    - loanAmount: Double
    - interestRate: Double
    - term: Integer
    - purpose: String

- **MortgageCalculationDTO**
    - propertyValue: Double
    - downPayment: Double
    - interestRate: Double
    - term: Integer
    - monthlyPayment: Double

### Utility and Bill Pay Services DTOs

- **BillPaymentDTO**
    - billId: UUID
    - amount: Double
    - dueDate: LocalDate
    - paymentStatus: String

### Shopping and Rewards Programs DTOs

- **RewardPointsDTO**
    - userId: UUID
    - earnedPoints: Integer
    - redeemedPoints: Integer
    - totalPoints: Integer

### Security and Fraud Protection DTOs

- **IdentityVerificationDTO**
    - userId: UUID
    - firstName: String
    - lastName: String
    - email: String
    - phoneNumber: String

- **SecurityAlertDTO**
    - alertId: UUID
    - type: String
    - description: String
    - timestamp: LocalDateTime

### Accessibility and Inclusion DTOs

- **FinancialLiteracyResourceDTO**
    - resourceId: UUID
    - title: String
    - url: String
    - description: String
