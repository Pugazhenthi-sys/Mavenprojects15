# sumof: Addition of two numbers

Jenkins project/job name: `sumof`

## Run locally on Windows
From this folder, run:
```bat
mvn clean test
mvn package
```

JUnit reports: `target/surefire-reports/*.xml`

## Jenkins Freestyle job
Use the job name `sumof`. If the Git repository contains all 15 folders, use this Windows batch build command:
```bat
mvn -B -f sumof\pom.xml clean test package
```
JUnit report pattern:
```text
sumof/target/surefire-reports/*.xml
```

Note: The sample grade boundaries are A >= 90, B >= 80, C >= 70, D >= 60, E >= 50, otherwise F. Change these if your instructor gave different boundaries. The string-palindrome program ignores case and whitespace.
