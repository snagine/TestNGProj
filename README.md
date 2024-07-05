# TestNGProj
This is a sample project with TestNG automation 

------------------------------------
TestNG-Gradle-Java setup in Intellij
------------------------------------
1. Create new project in intellij, select java, intellij
2. Add jars: Settings->Project structure -> Modules -> give testng path(downloaded mvn jar location)
3. Install testNG plugin. Settings -> Plugin -> Search for "Create test" -> click "Install" to install TestNG.
4. Close Intellij and reopen.
5. Right click on the project root folder and select "Create TestNG xml"
6. Select the project root folder, right click, "Reload from disk"
7. Verify the "testng.xml" appears at the bottom.
8. Click on the menu "Run -> Edit Configurations" -> select the testng.xml file -> Select the option "whole suite" instead of "in module"
9. Select "Apply" button and select ok.
10. You can run the xml by 
a) Selecting the "Run" button in "Edit configurations"
b) Selecting the xml file in the dropdown on the top bar, and clicking "traiangle" icon.
c) select the testng.xml and right click on testng.xml and run
d) ./gradlew test (this is not generating the test report)
11. Reports : Select the project root , select the menu Run -> "Edit configurations"-> select the "testng.xml" file under TestNG on the left pane ->Select "Listners" tab on the right pane -> Search for "Emailable" report and add -> Search for "FailedReporter" and add, Apply, ok, close the window
12. Right click on testng.xml and run
13. verify the html report generated under "test-output" folder
