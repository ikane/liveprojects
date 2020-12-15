# Better Banking

### Startup: 

    ./gradlew bootRun

1. Get token:
   
   `curl -XPOST -u "<CLIENT_ID>:<SECRET>" "http://localhost:9000/oauth/token?grant_type=password&username=<USERNAME>&password=<PASSWORD>&scope=read"`
   
2. Get transactions:

    `curl -H "Authorization: bearer <ACCESS_TOKEN>" http://localhost:9000/transactions/123456`


### Build docker image:

`./gradlew clean build bootBuildImage --imageName=better-banking`
