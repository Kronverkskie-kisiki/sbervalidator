package ru.sberbank.sbervalidator.v1.grpc;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import ru.sberbank.sbervalidator.grpc.ResultOfValidation;
import ru.sberbank.sbervalidator.grpc.ValidatorRequest;
import ru.sberbank.sbervalidator.grpc.ValidatorResponse;
import ru.sberbank.sbervalidator.grpc.ValidatorServiceGrpc;
import ru.sberbank.sbervalidator.validator.DocumentValidator;

import java.util.Map;

@GrpcService
public class ValidatorServiceImpl extends ValidatorServiceGrpc.ValidatorServiceImplBase {

    private final DocumentValidator documentValidator;

    public ValidatorServiceImpl() {
        this.documentValidator = new DocumentValidator();
    }

    @Override
    public void validateRequest(ValidatorRequest request, StreamObserver<ValidatorResponse> responseObserver) {
        ValidatorResponse.Builder responseBuilder = ValidatorResponse.newBuilder();
        request.getDocumentContentsMap().forEach((fieldName, documentContent) -> {
            try {
                Map<Boolean, String> validationResult = documentValidator.validate(fieldName, documentContent);
                responseBuilder.putValidationResults(fieldName, ResultOfValidation.newBuilder()
                        .putAllResultOfValidation(validationResult)
                        .build());
            } catch (IllegalArgumentException e) {
                responseBuilder.putValidationResults(fieldName, ResultOfValidation.newBuilder()
                        .putResultOfValidation(false, e.getMessage())
                        .build());
            }
        });
        ValidatorResponse response = responseBuilder.build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

}