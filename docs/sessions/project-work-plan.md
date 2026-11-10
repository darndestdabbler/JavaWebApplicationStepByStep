# Project work plan — sessions

**Written by `dabbler` as a fold of `activity-log.json`.**
Hand edits are overwritten by the next append. The record is the log;
this page is one view of it.

---

## Sessions

The numbered sessions are declared from `session-plan.md`; each one's task is what its own plan step declared.

| # | Session | Releasable | Declared |
| ---: | --- | --- | --- |
| 1 | Author or import the change plan | no | 2026-11-10 |
| 2 | Break the change plan into numbered sessions | no | 2026-11-10 |

### Session 1 — Author or import the change plan

**Releasable: no.**

Session 1 writes docs/planning/solution-plan.md from docs/planning/brief.md and nothing else: one paragraph on the repository as found -- one Maven WAR at the root (in28Minutes-first-webapp), Java source and target 1.7, javaee-web-api 6.0 provided, servlets mapped with @WebServlet in com.in28minutes.*, JSP views under src/main/webapp/WEB-INF/views, the shared navigation fragment, and no tests -- and one section per change: the calculator page (a Calculator class and a CalculatorServlet at /calculator.do in com.in28minutes.calculator, a calculator.jsp view, a navigation link, and the repository's first test, CalculatorTest under src/test/java with JUnit 4 as a test-scoped dependency, run by the maven suite dabbler.yaml declares), and the documentation comments on what that change added, with nothing else changed.

### Session 2 — Break the change plan into numbered sessions

**Releasable: no.**

Session 2 appends two numbered sessions to docs/sessions/session-plan.md from docs/planning/solution-plan.md and writes nothing else: Session 3, the calculator page -- Calculator and CalculatorServlet in com.in28minutes.calculator, the calculator.jsp view and its navigation link, and the repository's first test, CalculatorTest with JUnit 4.13.2 test-scoped in pom.xml, run by mvn test -- and Session 4, Javadoc on what session 3 added and a JSP comment atop its view, with no code, markup or build file changed. No release session is planned, because the brief names none.
