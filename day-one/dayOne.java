///*
// * =====================================================================
// *  JAVA BASICS - MY NOTES (Part 1: Getting started -> Conditionals)
// *  Running example: ManaVidya - a teacher checks one student's
// *  attendance and marks.
// *
// *  HOW TO RUN:
// *    One step (Java 11+):  javac JavaBasicsNotes.java
// *    Two steps:            javac dayOne.java   (creates JavaBasicsNotes.class)
// *                          java dayOne        (runs the compiled class)
// *
// *  Example input to type when the program asks:
// *    Teacher name : Lakshmi
// *    Section      : A
// *    Student name : Ravi
// *    Days present : 18
// *    Total days   : 20
// *    Marks scored : 45
// *    Max marks    : 50
// * =====================================================================
// */
//
//// Scanner lives in the java.util package, so we import it to read keyboard input
//import java.util.Scanner;
//
//// ---------------------------------------------------------------------
//// 1. GETTING STARTED - the shape of every Java program
//// ---------------------------------------------------------------------
//
//// All code lives inside a class.
//// The public class name MUST match the file name: JavaBasicsNotes -> JavaBasicsNotes.java
//public class dayOne {
//
//    // main is the entry point: the JVM always starts running from here.
//    // public = JVM can reach it   | static = runs without creating an object
//    // void   = returns nothing    | String[] args = words typed after the run command
//    public static void main(String[] args) {
//
//        // -----------------------------------------------------------------
//        // 2. PRINTING
//        // -----------------------------------------------------------------
//
//        // println = print the text, THEN press Enter (move to the next line)
//        System.out.println("=== ManaVidya Attendance & Marks Check ===");
//
//        // print = print the text and STAY on the same line
//        System.out.print("Academic year: ");
//        System.out.println("2026-27");          // continues the same line, then Enter
//
//        // An empty println() just presses Enter -> prints a blank line
//        System.out.println();
//
//        // -----------------------------------------------------------------
//        // 3. READING INPUT
//        // -----------------------------------------------------------------
//
//        // Create ONE Scanner that reads from the keyboard (System.in)
//        Scanner scanner = new Scanner(System.in);
//
//        // nextLine() reads everything typed until Enter, as a String
//        System.out.print("Teacher name: ");
//        String teacherName = scanner.nextLine();
//
//        System.out.print("Section: ");
//        String section = scanner.nextLine();
//
//        System.out.print("Student name: ");
//        String studentName = scanner.nextLine();
//
//        // SAFE way to read a number: read the whole line, then convert it.
//        // Integer.valueOf turns the text "18" into the number 18.
//        // If the teacher types "abc" -> NumberFormatException (crash at runtime)
//        System.out.print("Days present: ");
//        int daysPresent = Integer.valueOf(scanner.nextLine());
//
//        System.out.print("Total days: ");
//        int totalDays = Integer.valueOf(scanner.nextLine());
//
//        System.out.print("Marks scored: ");
//        int marksScored = Integer.valueOf(scanner.nextLine());
//
//        System.out.print("Max marks: ");
//        int maxMarks = Integer.valueOf(scanner.nextLine());
//
//        // THE ENTER TRAP (why we don't use nextInt() here):
//        //   int marks = scanner.nextInt();      // reads only "45", leaves the Enter behind
//        //   String name = scanner.nextLine();   // grabs that leftover Enter -> name = ""
//        // Rule: never call nextLine() right after nextInt(). Use Integer.valueOf(nextLine()).
//
//        System.out.println();
//
//        // -----------------------------------------------------------------
//        // 4. VARIABLES
//        // -----------------------------------------------------------------
//
//        // A variable = a named box. Its type decides what the box can hold.
//        int subjects = 1;               // int     -> whole numbers only
//        double passPercent = 35;        // double  -> decimals; 35 is stored as 35.0 (nothing lost)
//        String school = "ZPHS Rajam";   // String  -> text, always inside double quotes
//        boolean feePaid = true;         // boolean -> only true or false
//
//        // Reassigning (changing the value) is fine - don't write the type again
//        subjects = 3;
//        subjects = subjects + 1;        // read old value (3), add 1, store back -> 4
//
//        // NOT ALLOWED (compile errors, so they are commented out):
//        // int marks = 90.5;            // an int box has no room for the .5
//        // int 2ndTerm = 80;            // a name can't start with a digit
//        // int class = 7;               // 'class' is a Java keyword
//        // String subjects = "Maths";   // 'subjects' already exists - can't declare it again
//        //                              // (and a variable's type can never change)
//
//        // Naming: start with a letter, use camelCase, digits allowed later (class7Marks is OK)
//
//        // -----------------------------------------------------------------
//        // 5. CALCULATING WITH NUMBERS
//        // -----------------------------------------------------------------
//
//        // Basic operators: +  -  *  /  %
//        int daysAbsent = totalDays - daysPresent;
//
//        // INTEGER DIVISION: whole / whole = whole. Decimals are CUT, not rounded.
//        // Like sharing 10 notebooks among 4 students -> 2 each, 2 left over.
//        int each = 10 / 4;              // 2
//        int leftOver = 10 % 4;          // 2   (% = the remainder / leftover)
//
//        // TRAP: the division happens BEFORE storing, so the .5 is already gone
//        double wrongAverage = 10 / 4;   // 2.0, not 2.5
//
//        // FIX: make at least one side a decimal AT THE MOMENT of dividing
//        double rightAverage = 10 / 4.0;          // 2.5
//        double castFirst = (double) 10 / 4;      // 2.5 (cast happens first, then divide)
//        double castLate = (double) (10 / 4);     // 2.0 (division already happened)
//
//        // Real use: percentages. Cast first so the decimals are kept.
//        double attendancePercent = (double) daysPresent * 100 / totalDays;
//        double marksPercent = (double) marksScored * 100 / maxMarks;
//
//        // ORDER OF OPERATIONS: * / % first (left to right), then + -. Brackets beat everything.
//        int noBrackets = 47 % 10 + 47 / 10 * 2;      // 7 + 4*2 = 15
//        int withBrackets = (47 % 10 + 47 / 10) * 2;  // (7 + 4) * 2 = 22
//
//        // + JOINS TEXT. It works LEFT TO RIGHT:
//        // number + number = math. Once text appears, everything after it is glued as text.
//        System.out.println("Days absent: " + daysAbsent);
//        System.out.println(40 + 45 + " marks");      // 85 marks     (math first, then text)
//        System.out.println("Marks: " + 40 + 45);     // Marks: 4045  (text first -> glued)
//        System.out.println("Marks: " + (40 + 45));   // Marks: 85    (brackets force math first)
//
//        System.out.println("10 / 4 = " + each + ", leftover = " + leftOver);
//        System.out.println("wrong avg = " + wrongAverage + ", right avg = " + rightAverage);
//        System.out.println("cast first = " + castFirst + ", cast late = " + castLate);
//        System.out.println("no brackets = " + noBrackets + ", with brackets = " + withBrackets);
//        System.out.println("Attendance %: " + attendancePercent);
//        System.out.println("Marks %: " + marksPercent);
//        System.out.println();
//
//        // -----------------------------------------------------------------
//        // 6. CONDITIONALS
//        // -----------------------------------------------------------------
//
//        // Comparison operators give true/false:  ==  !=  >  <  >=  <=
//        // The result of a comparison can be stored in a boolean
//        boolean passed = marksPercent >= passPercent;
//        boolean goodAttendance = attendancePercent >= 75;
//        System.out.println("Passed? " + passed);      // boolean + text -> "Passed? true"
//
//        // IF / ELSE IF / ELSE = ONE chain. Read 'else' as "otherwise".
//        // Java checks top to bottom, runs ONLY the FIRST true block, and skips the rest.
//        // So put the STRICTEST condition first.
//        if (marksPercent >= 90) {
//            System.out.println("Grade: A+");
//        } else if (marksPercent >= 75) {
//            System.out.println("Grade: A");
//        } else if (marksPercent >= 35) {
//            System.out.println("Grade: B");
//        } else {
//            System.out.println("Grade: Fail");
//        }
//
//        // A plain 'if' (no 'else' before it) starts a NEW chain - it is checked on its own
//        if (daysAbsent > 5) {
//            System.out.println("Note: absent more than 5 days");
//        }
//
//        // STRINGS: compare text with .equals(), NEVER with ==
//        // == asks "same sheet of paper?"   .equals() asks "same writing?"
//        // Typed input is a new sheet, so == gives false even when the teacher typed A
//        System.out.println("section == \"A\"      -> " + (section == "A"));
//        System.out.println("section.equals(\"A\") -> " + section.equals("A"));
//
//        if (section.equals("A")) {
//            System.out.println("Section A - class teacher: " + teacherName);
//        } else {
//            System.out.println("Section " + section + " - class teacher: " + teacherName);
//        }
//
//        // LOGICAL OPERATORS: && (AND)   || (OR)   ! (NOT)
//        // ! flips true <-> false
//        if (!feePaid) {
//            System.out.println("Fee pending");
//        }
//
//        // && runs BEFORE || (like * before +). Use brackets to make the meaning clear.
//        // Rule here: can write the exam if fee paid AND (good attendance OR passed)
//        if (feePaid && (goodAttendance || passed)) {
//            System.out.println(studentName + " is ELIGIBLE for the exam");
//        } else {
//            System.out.println(studentName + " is NOT eligible for the exam");
//        }
//
//        // Without brackets:   feePaid && goodAttendance || passed
//        // Java reads it as:   (feePaid && goodAttendance) || passed   <- a different rule!
//
//        // Short-circuit:  in  a || b  -> if a is true,  Java doesn't even check b
//        //                 in  a && b  -> if a is false, Java doesn't even check b
//
//        System.out.println("School: " + school + " | Subjects: " + subjects);
//    }
//}
//
///*
// * =====================================================================
// *  KEY POINTS - WHAT I LEARNED (one line each)
// * =====================================================================
// *  1.  Java flow: write .java -> javac compiles it to .class (bytecode) -> JVM runs it.
// *  2.  Bytecode runs on any OS; only the JVM is OS-specific ("write once, run anywhere").
// *  3.  JDK = dev tools + JRE; JRE = JVM + libraries; you install the JDK.
// *  4.  JAVA_HOME = where the JDK lives; add its bin folder to PATH so "java" works anywhere.
// *  5.  "java File.java" compiles + runs in one step (Java 11+); "java ClassName" runs a compiled class.
// *  6.  All code lives inside a class; the public class name must match the file name.
// *  7.  main(String[] args) is where every program starts.
// *  8.  println prints then moves to a new line; print stays on the same line.
// *  9.  + goes left to right: numbers add until text appears, then everything is glued as text.
// *  10. Use brackets to force math inside a print: "Total: " + (a + b).
// *  11. Read input with Scanner; read numbers with Integer.valueOf(scanner.nextLine()).
// *  12. Never call nextLine() right after nextInt() - it grabs the leftover Enter.
// *  13. Typing text where a number is expected -> NumberFormatException at runtime.
// *  14. int = whole numbers, double = decimals, String = text, boolean = true/false.
// *  15. A double can hold an int (90 -> 90.0); an int can't hold a decimal (compile error).
// *  16. Variable names: start with a letter, camelCase, no keywords, no reusing a name.
// *  17. A variable's type never changes; you can only reassign its value.
// *  18. int / int = int: decimals are cut, not rounded (7 / 2 = 3, 15 / 4 = 3).
// *  19. % gives the remainder (7 % 2 = 1) - the "leftover notebooks".
// *  20. To keep decimals, make one side decimal BEFORE dividing: (double) a / b  or  a / 2.0.
// *  21. * / % run before + -; brackets run first of all.
// *  22. if / else if / else: only the first true block runs, so put the strictest check first.
// *  23. A new plain 'if' starts a separate check that runs on its own.
// *  24. Compare Strings with .equals(), never == (== doesn't crash, it silently gives false).
// *  25. && = both must be true, || = at least one true, ! = flip true/false.
// *  26. && runs before ||; use brackets whenever you mix them.
// *  27. Compile-time errors stop the program from running; runtime errors crash it while running.
// * =====================================================================
// */

import java.util.Scanner;

public class dayOne {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Name: ");
        String name = sc.nextLine();

        // Read numbers safely: whole line first, then convert (avoids the Enter trap)
        System.out.print("Marks 1: ");
        int marks1 = Integer.valueOf(sc.nextLine());

        System.out.print("Marks 2: ");
        int marks2 = Integer.valueOf(sc.nextLine());

        System.out.print("Marks 3: ");
        int marks3 = Integer.valueOf(sc.nextLine());

        int total = marks1 + marks2 + marks3;

        // Divide by 3.0 (not 3) so the decimals are kept
        double average = total / 3.0;

        System.out.println(name + ": total " + total + ", average " + average);
    }
}
