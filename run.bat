@echo off

if not exist "%JAVA_HOME%\lib\tools.jar" (
	echo Please set JAVA_HOME to the home of a SUN JDK, where JAVA_HOME\lib\tools.jar exists, and run again.
	goto EOF
)

%JAVA_HOME%\bin\java.exe -cp bin;"%JAVA_HOME%\lib\tools.jar" sample.PostmanApp

:EOF