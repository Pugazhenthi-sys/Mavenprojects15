# Java Practical Exam: 15 Separate Maven Projects

This package contains 15 independent Maven projects. Each folder is named exactly as requested for its Jenkins job.

## Project / Jenkins job names
1. Addition of two numbers — `sumof`
2. Check whether a number is even or odd — `evenodd`
3. Find the largest of three numbers — `largestofthree`
4. Calculate factorial of a number — `factorial`
5. Check whether a number is prime — `prime`
6. Generate the Fibonacci series — `fibonacci`
7. Reverse a number — `reverse`
8. Check whether an integer is a palindrome — `palindrome`
9. Calculate simple interest — `simpleinterest`
10. Calculate a student's grade from marks — `grade`
11. Find the sum of elements in an array — `sumofarray`
12. Find the maximum element in an array — `maximuminarray`
13. Count vowels in a string — `countvowels`
14. Reverse a string — `reversestring`
15. Check whether a string is a palindrome — `stringpalindrome`

## Requirements
- JDK 21 (your current Java version is suitable)
- Maven 3.9+ (your current Maven version is suitable)
- Jenkins with Git support and JUnit test-result publishing

## Test locally
Open Command Prompt in a question folder and run:
```bat
mvn clean test
```

## One Git repository for all 15 Jenkins jobs (recommended)
1. Extract this ZIP.
2. Create one Git repository for the extracted root folder and push all 15 folders to it.
3. In Jenkins, create 15 Freestyle jobs with the names listed above.
4. In each job, configure Source Code Management > Git to use that same repository.
5. Add a Windows batch build step. For a job named `sumof`, use:
```bat
mvn -B -f sumof\pom.xml clean test package
```
6. For each other job, change only the folder name in the command to that job's name, e.g. `evenodd\pom.xml`.
7. Add Post-build Action > Publish JUnit test result report. For `sumof`, use:
```text
sumof/target/surefire-reports/*.xml
```
8. Change the report folder for each job in the same way, save, then click Build Now.

## Important Jenkins note
Because the jobs check out one repository containing all projects, each job uses `mvn -f <folder>\pom.xml ...` to build only its own Maven project. Maven will download JUnit dependencies the first time, so the Jenkins machine needs network access.

## Grade assumptions
The sample grade program uses A >= 90, B >= 80, C >= 70, D >= 60, E >= 50, and F below 50. If your instructor specifies different grade ranges, change the thresholds.