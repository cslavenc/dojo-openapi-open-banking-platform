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
    public ResponseEntity<List<PaymentResponseDTO>> paymentsHistoryGet() {
        throw new NotImplementedException("Method not implemented");
    }

    @Override
    public ResponseEntity<Void> paymentsInitiatePost(PaymentRequestDTO paymentRequestDTO) {
        throw new NotImplementedException("Method not implemented");
    }

    @Override
    public ResponseEntity<Void> paymentsPaymentIdDelete(UUID paymentId) {
        throw new NotImplementedException("Method not implemented");
    }

    @Override
    public ResponseEntity<PaymentResponseDTO> paymentsPaymentIdGet(UUID paymentId) {
        throw new NotImplementedException("Method not implemented");
    }

    @Override
    public ResponseEntity<Void> paymentsPaymentIdPut(UUID paymentId, PaymentRequestDTO paymentRequestDTO) {
        throw new NotImplementedException("Method not implemented");
    }
}