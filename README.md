# HelloLambda
Demonstrates project structure for running arbitrary Java code on AWS' lambda service.
 
## Building ##
This project uses maven to produce a shaded jar.
```
    $ mvn clean install
    $ ls target/lambda-1.0-SNAPSHOT.jar
    $ java -jar target/lambda-1.0-SNAPSHOT.jar
```

## Deploying ##
Some screenshots to help you deploy on AWS' lambda service.

### Configure a New Lambda ###
![Configure a New Lambda](/etc/screenshots/1_ConfigureNewLambda.png?raw=true "Configure a New Lambda")

### Configure Test Event ###
Define the JSON payload that you'll use to test the lambda each time you upload a new version.
![Configure Test Event](/etc/screenshots/2_ConfigureTestEvent.png?raw=true "Configure Test Event")

### Test It ###
Now actually run the test.
![Test It](/etc/screenshots/3_TestIt.png?raw=true "Test It")

### Schedule It ###
You can schedule lambda execution via a special input event.
![Schedule It](/etc/screenshots/4_ScheduleIt.png?raw=true "Schedule It")

### Define Scheduled Event Content ###
Our scheduled event doesn't have a payload yet.  Let's fix that.
![Define Scheduled Event Content](/etc/screenshots/5_Define_Scheduled_Event_Content.png?raw=true "Define Scheduled Event Content")

### Check CloudWatch ###
Wait five minutes; then check cloud watch.
![Check CloudWatch](/etc/screenshots/6_CheckCloudWatch.png?raw=true "Check CloudWatch")

