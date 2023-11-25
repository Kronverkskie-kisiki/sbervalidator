package ru.sberbank.sbervalidator.validator;

import java.util.HashMap;
import java.util.Map;

public class DocumentValidator implements Validator {

    private static final String PASSPORT = "passport";
    private static final String REGISTRATION = "registration";
    private static final String RESIDENCE = "residence";
    private static final String PRESENCE_OF_CHILDREN = "presence_of_children";
    private static final String JOB = "job";
    private static final String SALARY = "salary";
    private static final String BRIDE_PRICE = "bride_price";
    private static final String SAVING = "saving";

    @Override
    public Map<Boolean, String> validate(String fieldName, String documentContent)
            throws IllegalArgumentException {
        Map<Boolean, String> validationResult = new HashMap<>();
        switch (fieldName) {
            case PASSPORT               -> validationResult = validatePassport(documentContent);
            case REGISTRATION           -> validationResult = validateRegistration(documentContent);
            case RESIDENCE              -> validationResult = validateResidence(documentContent);
            case PRESENCE_OF_CHILDREN   -> validationResult = validatePresenceOfChildren(documentContent);
            case JOB                    -> validationResult = validateJob(documentContent);
            case SALARY                 -> validationResult = validateSalary(documentContent);
            case BRIDE_PRICE            -> validationResult = validateBridePrice(documentContent);
            case SAVING                 -> validationResult = validateSaving(documentContent);
            default                     -> throw new IllegalArgumentException("Illegal JSON field.");
        }
        return validationResult;
    }

    private Map<Boolean, String> validatePassport(String document) {
        return Map.of(Boolean.TRUE, "just because");
    }

    private Map<Boolean, String> validateRegistration(String document) {
        return Map.of(Boolean.TRUE, "just because");
    }

    private Map<Boolean, String> validateResidence(String document) {
        return Map.of(Boolean.TRUE, "just because");
    }

    private Map<Boolean, String> validatePresenceOfChildren(String document) {
        return Map.of(Boolean.TRUE, "just because");
    }

    private Map<Boolean, String> validateJob(String document) {
        return Map.of(Boolean.TRUE, "just because");
    }

    private Map<Boolean, String> validateSalary(String document) {
        return Map.of(Boolean.TRUE, "just because");
    }
    private Map<Boolean, String> validateBridePrice(String document) {
        return Map.of(Boolean.TRUE, "just because");
    }

    private Map<Boolean, String> validateSaving(String document) {
        return Map.of(Boolean.TRUE, "just because");
    }

}
