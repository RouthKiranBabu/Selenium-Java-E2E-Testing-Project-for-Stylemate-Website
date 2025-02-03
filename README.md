# Ending Certificate
<img alt="Completion Certificate" src="./Certificate.jpg"> </img>

# Aim of the Project: 
👉 [Document](https://github.com/RouthKiranBabu/Selenium-Java-E2E-Testing-Project-for-Stylemate-Website/blob/part_1/Given%20Selenium%20Java%20Project%20Instructions%20for%20StylemateTesting%20Website.pdf)

# Requirements:
 - Maven Project
   -  Features(Folder of mavenProject) -> [CreateAccount.feature](https://github.com/RouthKiranBabu/Selenium-Java-E2E-Testing-Project-for-Stylemate-Website/blob/part_1/mavenProject/Features/CreateAccount.feature)
   -  pageObjects(Package of src/test/java) -> [Register.java](https://github.com/RouthKiranBabu/Selenium-Java-E2E-Testing-Project-for-Stylemate-Website/blob/part_1/mavenProject/src/test/java/pageObjects/Register.java)
   -  stepDefinitions(Package of src/test/java) -> [Steps.java](https://github.com/RouthKiranBabu/Selenium-Java-E2E-Testing-Project-for-Stylemate-Website/blob/part_1/mavenProject/src/test/java/stepDefinitions/Steps.java)
   -  testRunner(Package of src/test/java) -> [RegisterRun.java](https://github.com/RouthKiranBabu/Selenium-Java-E2E-Testing-Project-for-Stylemate-Website/tree/part_1/mavenProject/src/test/java/testRunner)
   -  Utilities(Package of src/test/java)
   -  Drivers(Folder of mavenProject)
   -  [target](https://github.com/RouthKiranBabu/Selenium-Java-E2E-Testing-Project-for-Stylemate-Website/tree/part_1/mavenProject/%20target)(for Reports already present)
   -  [pom.xml](https://github.com/RouthKiranBabu/Selenium-Java-E2E-Testing-Project-for-Stylemate-Website/blob/part_1/mavenProject/pom.xml)
 - [Test Cases and Scenarios](https://github.com/RouthKiranBabu/Selenium-Java-E2E-Testing-Project-for-Stylemate-Website/blob/part_1/Test%20Cases%20and%20Scenarios.xlsx)
 - [Test Plan](https://github.com/RouthKiranBabu/Selenium-Java-E2E-Testing-Project-for-Stylemate-Website/blob/part_1/Test%20plan%20on%20StyleMate%20e-commerce%20platform.pdf)
 - [Flow Chart/Mind Map](https://github.com/RouthKiranBabu/Selenium-Java-E2E-Testing-Project-for-Stylemate-Website/tree/part_1#flowchart-folder-structure)
 - [Bug Reports](https://github.com/RouthKiranBabu/Selenium-Java-E2E-Testing-Project-for-Stylemate-Website/blob/part_end/Bug%20Report%20for%20StyleMate.pdf)
 - [Summary Report](https://github.com/RouthKiranBabu/Selenium-Java-E2E-Testing-Project-for-Stylemate-Website/blob/part_end/Summary%20Report%20for%20StyleMate.pdf)

# Procedure
 - Create the maven Project:
File -> New -> Others -> Maven(Folder) -> Maven Project -> Next -> 
Next -> In the New Maven Project -> Select Catalog as Internal -> 
provide same name of the Project in the Group id and Artifact id -> 
Finish

 - Delete the Packages present in the src/main/java and src/test/java
Which is created by default

 - Dependencies need to add:
a. Cucumber-core
b. Cucumber-html
c. cobertura code coverage
d. Cucumber-java
e. Cucumber-junit
f. Cucumber-jvm-deps
g. Cucumber-reporting
h. Hamcrest-core
i. Gherkin
j. Junit
k. Selenium-java
l. com.sun tools

 - Create Folder Structure:
Project Name
|-> Features(Folder of mavenProject)
|-> pageObjects(Package of src/test/java)
|-> stepDefinitions(Package of src/test/java)
|-> testRunner(Package of src/test/java)
|-> Utilities(Package of src/test/java)
|-> Drivers(Folder of mavenProject)
|-> target(for Reports already present)
|-> pom.xml

 - In the Drivers folder -> add the necessary drivers.

 - Right Click -> Features Folder -> New -> File -> Name: Login.feature ->
Finish
Write in Login.feature.

 - In the pageObjects package -> Create class -> Name: LoginPage -> Finish
Write in LoginPage.java

 - Right click -> stepDefinitions -> New -> Class -> Name -> Steps -> Finish

 - Right Click -> MavenProject -> Maven -> Update Project -> OK
Login.feature -> Run as -> Cucumber Feature

 - Right Click -> mavenProject -> Run as -> Run Configurations 
Name Correct -> Project Name
Enter the correct Feature Path if needed
-> Apply -> Run
In the Login.feature -> Right click -> Run as -> Cucumber Feature
Copy the methods shown at Console -> Paste in the Steps.java

 - Then remove the following from the Steps.java:
// Write code here that turns the phrase above into concrete actions
throw new io.cucumber.java.PendingException();

 - Write -> in -> Steps.java

 - Inside the testRunner -> Create Class -> TestRun.java
Write -> in -> TestRun.java

 - refresh the project -> In the target Folder -> Open the htmlreport.html
->  Open with System Editor
   
 - In the Login.feature -> add the Scenario Outline and examples
in the Testrun.java -> make dryRun = true -> run the TestRun.java -> Junit Test
watch the output

 - In the Login.feature -> make dryRun = false -> run the TestRun.java -> Junit Test
watch the output

# Theory
| Name | Definition |
| :--: | :--- |
|Selenium|Selenium is a popular open-source automation testing framework for web applications. It supports multiple programming languages (e.g., Java, Python) and browsers. Selenium provides tools like WebDriver for browser automation and Grid for parallel testing, enabling efficient and scalable test automation.|
|Cucumber|Cucumber is a Behavior-Driven Development (BDD) tool that allows writing tests in plain English (Gherkin). It bridges the gap between technical teams and stakeholders by enabling collaboration through human-readable test scenarios that are executable, promoting better communication and understanding.|
|Maven Project|Maven is a project management and build automation tool for Java-based projects. It simplifies dependency management, builds, and project structure using a standardized POM (Project Object Model) file. Maven enables easy integration with testing frameworks and continuous integration tools.|
|Eclipse IDE|Eclipse is a widely used, free Integrated Development Environment (IDE) for Java and other languages. It offers features like debugging, code refactoring, plugins, and a user-friendly interface, making it an essential tool for software development and testing.|
|Jenkins CI/CD|Jenkins is an open-source automation server used for Continuous Integration and Continuous Delivery (CI/CD). It automates code building, testing, and deployment processes, enabling teams to deliver software faster and with higher quality through its robust plugin ecosystem.|

# Output Representation
<img alt="Awesome GitHub Profile Readme" src="https://github.com/RouthKiranBabu/Selenium-Java-E2E-Testing-Project-for-Stylemate-Website/blob/part_end/outputRepresentation.gif"> </img>
