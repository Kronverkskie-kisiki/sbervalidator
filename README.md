# Sber Validator Internal Microservice

Opened for connections via gRPC, closed via HTTP

Sample request for using: 

```gRPC
{
  "documentContents": [
    {
      "key": "passport",
      "value": "passport_document_content_here"
    },
    {
      "key": "registration",
      "value": "registration_document_content_here"
    },
    {
      "key": "residence",
      "value": "residence_document_content_here"
    },
    {
      "key": "presence_of_children",
      "value": "presence_of_children_document_content_here"
    },
    {
      "key": "job",
      "value": "job_document_content_here"
    },
    {
      "key": "salary",
      "value": "salary_document_content_here"
    },
    {
      "key": "bride_price",
      "value": "bride_price_document_content_here"
    },
    {
      "key": "saving",
      "value": "saving_document_content_here"
    }
  ]
}
```

Type of response from the server:

```gRPC
{
    "validationResults": [
        {
            "key": "passport",
            "value": {
                "resultOfValidation": [
                    {
                        "key": true,
                        "value": "just because"
                    }
                ]
            }
        },
        {
            "key": "registration",
            "value": {
                "resultOfValidation": [
                    {
                        "key": true,
                        "value": "just because"
                    }
                ]
            }
        },
        {
            "key": "residence",
            "value": {
                "resultOfValidation": [
                    {
                        "key": true,
                        "value": "just because"
                    }
                ]
            }
        },
        {
            "key": "presence_of_children",
            "value": {
                "resultOfValidation": [
                    {
                        "key": true,
                        "value": "just because"
                    }
                ]
            }
        },
        {
            "key": "job",
            "value": {
                "resultOfValidation": [
                    {
                        "key": true,
                        "value": "just because"
                    }
                ]
            }
        },
        {
            "key": "salary",
            "value": {
                "resultOfValidation": [
                    {
                        "key": true,
                        "value": "just because"
                    }
                ]
            }
        },
        {
            "key": "bride_price",
            "value": {
                "resultOfValidation": [
                    {
                        "key": true,
                        "value": "just because"
                    }
                ]
            }
        },
        {
            "key": "saving",
            "value": {
                "resultOfValidation": [
                    {
                        "key": true,
                        "value": "just because"
                    }
                ]
            }
        }
    ]
}
```
