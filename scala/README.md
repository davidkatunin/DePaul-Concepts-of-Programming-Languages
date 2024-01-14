// GENERATED

# Testing #

For the assignments using Scala, you must install scala-cli as described in <https://fpl.cs.depaul.edu/cpitcher/courses/csc347/worksheets/ws02.html>.

You can run a Read-Eval-Print Loop that loads the contents of file `factorial.sc` then run the factorial function and show its type as follows:

    $ scala-cli repl factorial.sc -S 2
    
    Compiling project (Scala 2.13.10, JVM)
    Compiled project (Scala 2.13.10, JVM)
    Welcome to Scala 2.13.10 (OpenJDK 64-Bit Server VM, Java 19.0.1).
    Type in expressions for evaluation. Or try :help.
    
    scala> import factorial._
    import factorial._
    
    scala> factorial (5)
    val res0: Int = 120
    
    scala> List (1,2,3,4).map (factorial)
    val res1: List[Int] = List(1, 2, 6, 24)
    
    scala> :t factorial (_)
    Int => Int
    
Note that this will fail initially until you complete the definition of the "factorial" function in `factorial.sc`.

When you have completed exercises, run the tests as follows (from the `intro-scala` directory) as follows:

    $ scala-cli test .
    Compiling project (Scala 2.13.10, JVM)
    Compiled project (Scala 2.13.10, JVM)
    Compiling project (test, Scala 2.13.10, JVM)
    Compiled project (test, Scala 2.13.10, JVM)
    Tests_factorial:
      + factorial 0.015s
    Tests_triple:
      + triple 0.003s
    Tests_sum_list_tail_recursive:
      + sum_llst_tail_recursive 0.003s
    Tests_max_list_tail_recursive:
      + max_list_tail_recursive 0.002s
    Tests_max_list:
      + max_list 0.003s
    Tests_otpu:
      + otpu 0.002s
    Tests_swap:
      + swap 0.001s
    Tests_fibonacci:
      + fibonacci 0.005s
    Tests_sum_list:
      + sum_list 0.002s

Again, the tests will fail until you have completed the exercises in each file ending in ".sc".

If the output from all tests is distracting, you can limit to an individual test by adding the name of the test with the `--test-only` option as follows (this is an example of the output when the test fails:

    $ scala-cli test . --test-only Tests_triple 
    Tests_triple:
    ==> X Tests_triple.triple  0.024s munit.FailException: /tmp/main/scala/intro-scala/triple.test.scala:13 assertion failed
    12:    Future {
    13:      assert (t1    != null)
    14:      assert (t1._1 == 7)
        at munit.FunSuite.assert(FunSuite.scala:11)
        at Tests_triple.$anonfun$new$2(triple.test.scala:13)
        at scala.concurrent.Future$.$anonfun$apply$1(Future.scala:678)
        at scala.concurrent.impl.Promise$Transformation.run(Promise.scala:467)
        at java.util.concurrent.ForkJoinTask$RunnableExecuteAction.exec(ForkJoinTask.java:1423)
        at java.util.concurrent.ForkJoinTask.doExec(ForkJoinTask.java:387)
        at java.util.concurrent.ForkJoinPool$WorkQueue.topLevelExec(ForkJoinPool.java:1311)
        at java.util.concurrent.ForkJoinPool.scan(ForkJoinPool.java:1840)
        at java.util.concurrent.ForkJoinPool.runWorker(ForkJoinPool.java:1806)
        at java.util.concurrent.ForkJoinWorkerThread.run(ForkJoinWorkerThread.java:177)

If you want to have the compilation/test run automatically when you save the ".sc" file, add the `-w` (watch) option:

    $ scala-cli test . --test-only Tests_triple -w

or to watch and then run all tests

    $ scala-cli test . -w

This allows you to edit/save the ".sc" file and then switch to the terminal window to see the result of running the compilation/test.

# Grading #

 * You MUST run the automated tests to check that your code compiles and test it.

 * You MUST NOT edit the files with names ending in ".test.scala".
   Altering those files will result in 0 points for this assignment.
   You can read those files, and may want to do so in order to see what the tests do.
 
 * Submissions MUST compile using scala-cli with UNCHANGED configuration and tests with no compilation errors. 
   Submissions with compilation errors will receive 0 points.
   Note that refactoring the code will cause the tests to fail.

# Submission #

 * Push your local repository to the repository created for you on GitHub before the deadline.
 
 * Late submissions will not be permitted because solutions may be discussed in class or office hours.
