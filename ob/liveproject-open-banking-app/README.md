https://openbankinguk.github.io/read-write-api-site3/v3.1.7/resources-and-data-models/aisp/Transactions.html#get-accountsaccountidtransactions


https://oss.sonatype.org/content/repositories/snapshots/io/swagger/swagger-codegen-cli/

java -jar swagger-codegen-cli.jar generate -i account-info-openapi.yaml -l java -o client --additional-properties dateLibrary=java8-localdatetime,java8=true


## 3. Exchanging Data Securely

[Bank Transaction testnet server] (https://github.com/nathanbcrocker/service-testnet)


* Get token *
```
curl -X POST -H “Authorization: Basic YmV0dGVyLWJhbmtpbmc6N3lyYlI4WHBZNDViY0tQUA==” --data “grant_type=client_credentials” http://localhost:8080/oauth/token
```

* Call API with token
```
cul -X GET -H “Authorization: Bearer ced51608-76c9-4c9f-898f-ed5ba22e05bc” “http://localhost:8080/accounts/1234567/transactions” -H “accept: application/json”
```

