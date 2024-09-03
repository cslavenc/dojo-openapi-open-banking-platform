package dojo.openapi.open_banking_platform.payment;

import dojo.openapi.open_banking_platform.model.PaymentRequestDTO;
import dojo.openapi.open_banking_platform.model.PaymentResponseDTO;

import java.util.List;
import java.util.UUID;

public class PaymentData {

    private static final UUID paymentId = UUID.randomUUID();
    private static final UUID transactionId = UUID.randomUUID();
    private static final Double amount = 4000.40;
    private static final String currency = "USD";
    private static final String description = "instant payment";
    private static final String recipient = "John Smith";
    private static final String message = "Received";

    public static PaymentRequestDTO defaultPaymentRequest() {
        return new PaymentRequestDTO()
                .paymentId(paymentId)
                .amount(amount)
                .currency(currency)
                .description(description)
                .recipient(recipient);
    }

    public static PaymentResponseDTO defaultPaymentResponse() {
        return new PaymentResponseDTO()
                .paymentId(paymentId)
                .message(message)
                .transactionId(transactionId);
    }

    public static List<PaymentResponseDTO> defaultPaymentResponses() {
        return List.of(defaultPaymentResponse(), defaultPaymentResponse());
    }
}
