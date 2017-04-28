- [Instructions](#instructions)
  - [Coding task details](#coding-task-details)
    - [Throne succession rules](#throne-succession-rules)
    - [Your task](#your-task)
  - [Things to do to prepare for the UBS interview](#things-to-do-to-prepare-for-the-ubs-interview)
  - [We value](#we-value)
  - [Our vision of QA](#our-vision-of-qa)
  - [What to expect from our process](#what-to-expect-from-our-process)
  - [Some hints](#some-hints)

# Instructions

## Coding task details

### Throne succession rules
In medieval times, rules of the male primogeniture were the most commonly used as rules for throne succession. 
1. The  throne is inherited by the King's son and his male offspring
2. If King has no male offspring, it is female offspring that inherits the throne
3. In case of having many sons/daughters a rule of age applies, it is always the oldest child that inherits the throne

One assumption that is not captured in these rules is that if someone becomes a king he/she is a king life-long.
 
### Your task
The goal of the task is to create model reflecting throne succession problem and implement `KingSelector` class. 
The `KingSelector` class takes information about king's dynasty and returns information about a person that is the king at the moment of launching this algorithm. 

The selection algorithm should be implemented according to male primogeniture rules.

Please keep the solution as simple as possible. You do not need to involve files, REST, command line, etc. It is perfectly fine if tests use object builders to create Object representing king's dynasty and `KingSelector` takes this object.

Together with the implementation you also need to write tests for the implementation. First you need to come up with
 a set of acceptance tests that you feel would be sufficient to prove that your solution works - the assumption is,
 that these tests would be run on demo session. Obviously acceptance tests do not cover all cases, hence
 they need to be backed up with other tests on other levels (unit, integration, system). Whether you will use all levels of tests or only subset, it depends on your particular model/solution.
 
## Things to do to prepare for the UBS interview
 - ensure that your machine has a Java JDK installed on it (we are assuming Java 8 will be used)
 - install an IDE of your choice to perform the interview (we have used Jet Brains IntelliJ IDEA)
 - included with this archive is an example project that is built using gradle, before the interview you should
   familiarise yourself with working on a Gradle project in the IDE of your choice.
 - when your environment is set up correctly running `gradlew check` from the command line should complete successfully.

## We value
 - simple, elegant code that reads like a narrative
 - thinking about the code more than the writing of the code (we spend a lot of time thinking/debating about what we are
   writing)
 - transparency and feedback to support continuous learning
 - excellent testing that acts as documentation
 - challenging boundaries where necessary
 
## Our vision of QA
 - creating a culture of quality in the team
 - participating in code reviews and pair programming with developers
 - breaking with traditional QA approach and mentoring team to introduce agile QA practices
 - helping the team to discover corner cases and test ideas
 - analysing development and release process to propose improvements
 - working with product owner on issues
 - eliminating waste including manual testing and excessive documentation
 - communicating with project stakeholders to prioritize work to be done
 - helping to deliver quality software, not just blocking poor software with defects from being released
 - being involved in requirement analysis and design of automated test cases
 - coaching developers to make them care about quality
 - challenging proposed business solutions
 - reviewing requirements in order to spot issues as soon as possible
 - creating and choosing right tools that will help the development team deliver things faster and with higher quality
 - applying test-driven development and behaviour-driven development in practice
 - exploratory testing

## What to expect from our process
 - we will not measure how long it takes to complete the exercise, but we expect it back in a reasonable period of time
 - we would like you to think of this as production ready code
 - we will review your solution and feedback to you our thoughts
 - we will additionally feedback to you whether we would like to take the process further

## Some hints
If you are new to Gradle please spend some time and familiarize with it. We are using the Gradle
 Wrapper so `gradlew` from the command line should download everything you need. Most modern IDEs support Gradle
 projects.

Please ensure that you are familiar with our values above. They are important to us.
