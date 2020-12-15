https://oss.sonatype.org/content/repositories/snapshots/io/swagger/swagger-codegen-cli/

java -jar swagger-codegen-cli.jar generate -i account-info-openapi.yaml -l java -o client --additional-properties dateLibrary=java8-localdatetime,java8=true


