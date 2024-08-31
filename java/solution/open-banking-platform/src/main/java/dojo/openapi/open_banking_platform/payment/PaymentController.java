package dojo.openapi.open_banking_platform.payment;

import dojo.openapi.open_banking_platform.api.PaymentsApi;
import dojo.openapi.open_banking_platform.model.PaymentRequestDTO;
import dojo.openapi.open_banking_platform.model.PaymentResponseDTO;
import org.apache.commons.lang3.NotImplementedException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
public class PaymentController implements PaymentsApi {

    @Override
    public ResponseEntity<Void> cancelPayment(UUID paymentId) {
        throw new NotImplementedException("Method not implemented");
    }

    @Override
    public ResponseEntity<Void> createPayment(PaymentRequestDTO paymentRequestDTO) {
        throw new NotImplementedException("Method not implemented");
    }

    @Override
    public ResponseEntity<PaymentResponseDTO> getPaymentDetails(UUID paymentId) {
        throw new NotImplementedException("Method not implemented");
    }

    @Override
    public ResponseEntity<List<PaymentResponseDTO>> getPaymentHistory() {
        throw new NotImplementedException("Method not implemented");
    }

    @Override
    public ResponseEntity<Void> updatePaymentStatus(UUID paymentId, PaymentRequestDTO paymentRequestDTO) {
        throw new NotImplementedException("Method not implemented");
    }
}
