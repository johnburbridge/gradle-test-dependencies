gradle-test-dependencies
================================================

Simple project that exercises providedCompile and providedRuntime dependencies. Running a simple unit test from the IDE
(I use eclipse) the tests return successfully, but when running through gradle the following error is thrown:

         java.lang.ClassFormatError: Absent Code attribute in method that is not native or abstract in class file javax/servlet/ServletException

To build, run:

         ./gradlew test

The result should be similar to the following:

         $ ./gradlew test
         :compileJava UP-TO-DATE
         :processResources UP-TO-DATE
         :classes UP-TO-DATE
         :compileTestJava UP-TO-DATE
         :processTestResources UP-TO-DATE
         :testClasses UP-TO-DATE
         :test
         Test test.PingServletTest FAILED
         1 test completed, 1 failure
         
         FAILURE: Build failed with an exception.
         
         * What went wrong:
         Execution failed for task ':test'.
         > There were failing tests. See the report at C:\dev\projects\test-dependencies\build\reports\tests.
         
         * Try:
         Run with --stacktrace option to get the stack trace. Run with --info or --debug
         option to get more log output.
         
         BUILD FAILED
         
         Total time: 3.027 secs

