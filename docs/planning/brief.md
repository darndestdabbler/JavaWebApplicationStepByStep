# Brief

Two changes to this servlet and JSP web application, each its own session,
inside the repository's existing shape: one Maven WAR at the root, Java
source and target 1.7, servlets mapped with `@WebServlet` in
`com.in28minutes.*`, views under src/main/webapp/WEB-INF/views, and the
shared navigation in src/main/webapp/WEB-INF/common/navigation.jspf. It
has no tests today.

1. **An online calculator page.** A page that takes two numbers and shows
   their sum and their difference (add and subtract): a servlet mapped to
   `/calculator.do` in a new `com.in28minutes.calculator` package, the
   arithmetic in its own class, a JSP view in the existing style, and a
   link in the navigation. Its tests are the repository's first: JUnit 4
   (which runs on Java 7) as a `test`-scoped dependency in `pom.xml`, and a
   test of the arithmetic under src/test/java, run by `mvn test`.
2. **Documentation comments.** Javadoc on the classes and public methods
   the calculator change added, and a JSP comment at the top of its view.
   Nothing else changes: no code, no markup, no build file.

Out of scope: raising the Java level or any dependency; any other page; a
release. The project builds on a JDK that still compiles Java 7 (JDK 11
here), as its owners' would.
