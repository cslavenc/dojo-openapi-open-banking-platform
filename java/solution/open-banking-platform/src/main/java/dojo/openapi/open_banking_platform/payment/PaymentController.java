package dojo.openapi.open_banking_platform.payment;

import dojo.openapi.open_banking_platform.api.PaymentsApi;
import dojo.openapi.open_banking_platform.model.PaymentRequestDTO;
import dojo.openapi.open_banking_platform.model.PaymentResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
public class PaymentController implements PaymentsApi {

    @Override
    public ResponseEntity<PaymentResponseDTO> getPaymentDetails(UUID paymentId) {
        return new ResponseEntity<>(PaymentData.defaultPaymentResponse(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<PaymentResponseDTO>> getPaymentHistory() {
        return new ResponseEntity<>(PaymentData.defaultPaymentResponses(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<PaymentResponseDTO> createPayment(PaymentRequestDTO paymentRequestDTO) {
        return new ResponseEntity<>(PaymentData.defaultPaymentResponse(), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Void> updatePaymentStatus(UUID paymentId, PaymentRequestDTO paymentRequestDTO) {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> cancelPayment(UUID paymentId) {
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
