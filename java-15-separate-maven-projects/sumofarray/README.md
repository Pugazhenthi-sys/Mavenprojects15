# sumofarray: Find the sum of elements in an array

Jenkins project/job name: `sumofarray`

## Run locally on Windows
From this folder, run:
```bat
mvn clean test
mvn package
```

JUnit reports: `target/surefire-reports/*.xml`

## Jenkins Freestyle job
Use the job name `sumofarray`. If the Git repository contains all 15 folders, use this Windows batch build command:
```bat
mvn -B -f sumofarray\pom.xml clean test package
```
JUnit report pattern:
```text
sumofarray/target/surefire-reports/*.xml
```

Note: The sample grade boundaries are A >= 90, B >= 80, C >= 70, D >= 60, E >= 50, otherwise F. Change these if your instructor gave different boundaries. The string-palindrome program ignores case and whitespace.
