package lab7.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import lab7.tests.student.StudentBearBucksTest;
import lab7.tests.student.StudentFullNameTest;
import lab7.tests.student.StudentGradePointAverageEdgeCaseTest;
import lab7.tests.student.StudentGradePointAverageTest;
import lab7.tests.student.StudentIdTest;
import lab7.tests.student.StudentLegacyBearBucksTest;
import lab7.tests.student.StudentLegacyNameTest;
import lab7.tests.student.StudentPhiBetaKappaTest;
import lab7.tests.student.StudentStandingTest;
import lab7.tests.student.StudentToStringIsOverriddenTest;
import lab7.tests.student.StudentToStringTest;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({ StudentFullNameTest.class, StudentIdTest.class,
		StudentGradePointAverageTest.class,
		StudentGradePointAverageEdgeCaseTest.class, StudentStandingTest.class, StudentPhiBetaKappaTest.class,
		StudentBearBucksTest.class, StudentLegacyNameTest.class,
		StudentLegacyBearBucksTest.class, StudentToStringIsOverriddenTest.class, StudentToStringTest.class })
public class StudentTestSuite {
}
