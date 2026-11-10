# Session plan

> **Purpose:** the numbered sessions this repository runs, in order. The
> first two set the work up; everything after them is the work.
> **Workflow:** Full

---

## Sessions

### Session 1: Author or import the change plan

1. Register.
2. The brief is the prompt this session was started with, or
   `docs/planning/brief.md`: what is to change in this repository and
   why -- the defects, the features or the upgrades wanted, and what is
   out of scope. With neither, ask the person who started the session
   for it and write their answer to that path before any work. The
   plan's substance is theirs: do not search neighbouring directories
   for one, and do not draft one from the code.
3. This repository already holds code: `pom.xml`, and
   `dabbler.yaml` says `posture: maintenance`. Read it before planning --
   its projects, their target frameworks or JDKs, their project formats,
   their build tools, their test frameworks and their folders -- and take
   all of them as the plan's givens. Do not ask how production is split,
   and do not propose new boundaries between projects. Then create — or
   import — `docs/planning/solution-plan.md`, short: one paragraph on the
   repository as found, and one section per change, saying what changes,
   in which project, and how it is shown to work. A repository that
   already has `docs/planning/project-plan.md` amends that file instead.
4. Fit this framework's documents and suites to the projects that exist,
   and change nothing else: where `dabbler.yaml` declares no suite that
   runs the tests these projects have, say which session declares one.
   Restructuring, retargeting or reformatting a project is not a change
   this plan makes unless the person asks for it by name.

The framework then verifies the work cross-provider, runs the suites as
the run of record and closes the session. These are the framework's,
not steps to plan.

This session writes the plan and nothing else: it creates, edits or
deletes no code, project, build file, test, `dabbler.yaml` suite or
packaging.

**Creates:** `docs/planning/solution-plan.md`. A later revision is just
another plan session that amends the same file.

### Session 2: Break the change plan into numbered sessions

1. Register.
2. Read `docs/planning/solution-plan.md` (or `docs/planning/project-plan.md`
   where that is the file this repository keeps its plan in) and break
   each change into numbered sessions appended to this file, each of
   three to six work steps: one `### Session <N>: <title>` heading, and
   its steps as a top-level ordered list. Step 1 registers the session
   and the rest are the work: cross-provider verification, the run of
   record and the close are the framework's, never steps to plan. Never
   write a step that says "run the tests" without saying which run it
   means.
3. No session writes a skeleton, and none proposes restructuring,
   retargeting or reformatting a project: the projects stay as they are,
   and a step that adds a file to a non-SDK project lists it in that
   project's `.csproj`. A release is a session with no steps, headed
   `### Session <N>: Release <version> (release: <version>)`; propose its
   version -- patch, minor or major -- for the person to approve with
   the plan.

The framework then verifies the work cross-provider, runs the suites as
the run of record and closes the session. These are the framework's,
not steps to plan.

This session writes the plan and nothing else: it creates, edits or
deletes no code, project, build file, test, `dabbler.yaml` suite or
packaging.

**Creates:** the numbered session list the rest of this repository runs.

> Do NOT hand-author `sessions.json`. The first `session start`
> bootstraps it from this plan — state files are the writers' job.
