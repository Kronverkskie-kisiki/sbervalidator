package ru.sberbank.sbervalidator.validator;

import java.util.Map;

public interface Validator {

     Map<Boolean, String> validate(String fieldName, String documentContent);

}
