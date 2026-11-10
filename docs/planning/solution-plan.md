# Solution plan

## The repository as found

One Maven WAR at the root, `in28Minutes-first-webapp`, compiled at Java
source and target 1.7 by maven-compiler-plugin 3.2, against
`javaee-web-api` 6.0 (provided), JSTL 1.2 and the Bootstrap and jQuery
webjars. Its servlets live in `com.in28minutes.*` and are mapped with
`@WebServlet` to `*.do` URLs; each forwards to a JSP under
src/main/webapp/WEB-INF/views, which includes the shared header,
navigation and footer fragments from WEB-INF/common. A login filter guards
the `*.do` pages. It has no tests and no test dependency. `dabbler.yaml`
declares one `maven` suite, `mvn -q test`, with named tests selected by
`-Dtest`. All of this is kept: no Java level, dependency or plugin
changes. It builds on a JDK that still compiles Java 7 (JDK 11 here).

## Change 1: an online calculator page

**What changes.** A new package `com.in28minutes.calculator` with
`Calculator` (add and subtract two numbers) and `CalculatorServlet`, mapped
to `/calculator.do`: GET forwards to the form, POST reads the two numbers,
puts their sum and difference on the request and forwards to the same
view. The view is src/main/webapp/WEB-INF/views/calculator.jsp, including
the shared fragments like the other views, and navigation.jspf gains a
Calculator link. `pom.xml` gains JUnit 4.13.2 as a `test`-scoped
dependency, the repository's first, and src/test/java gains
`com.in28minutes.calculator.CalculatorTest` with a test of add and one of
subtract.

**How it is shown to work.** `mvn -q test` compiles the WAR at Java 7 and
runs `CalculatorTest` green; the maven suite runs it by name.

## Change 2: documentation comments

**What changes.** Javadoc on `Calculator`, its methods,
`CalculatorServlet` and its `doGet` and `doPost`, and a JSP comment at the
top of calculator.jsp. No code, markup or build file changes.

**How it is shown to work.** `mvn -q test` still compiles and passes, and
the diff contains only comment lines.

## Out of scope

Raising the Java level, a dependency or a plugin; any other page; a
release.
