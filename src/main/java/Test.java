
import SoftwareAssignment1a.Course;
import SoftwareAssignment1a.Lecturer;
import SoftwareAssignment1a.Module;
// import SoftwareAssignment1a.Lecturer;

import SoftwareAssignment1a.Student;
import org.joda.time.DateTime;
import java.util.ArrayList;
import java.util.List;


public class Test
{
    public static void main(String[] args)
    {
//        Student s1 = new Student("Tamsin Harvey", 22, "19731719", "18-03-2000");
//        Student s2 = new Student("Tamsin Harvey", 22, "19731719", "18-03-2000");
//        Student s3 = new Student("Tamsin Harvey", 22, "19731719", "18-03-2000");
//
//        ArrayList<Student> students = new ArrayList<Student>(List.of(s1, s2, s3));

        // Create students test cases
        Student s1 = new Student("Tamsin Harvey", 22, "19731719","2000-03-18");

        Student s2 = new Student("Flippo Ruskih", 23, "19757318", "1999-03-18");

        Student s3 = new Student("Paul Hollywood", 52, "87654321", "1970-03-18");

        // Populating students array
        ArrayList<Student> students = new ArrayList<Student>(List.of(s1, s2, s3));


//        // Create module test cases
//        Module m1 = new Module();
//        m1.setModName("Software Engineering");
//        m1.setModID("CT417");
//
//        Module m2 = new Module();
//        m2.setModName("Machine Learning");
//        m2.setModID("CT4101");
//
//        Module m3 = new Module();
//        m3.setModName("Professional Skills");
//        m3.setModID("CT436");
//
//        // Populating modules array
//        ArrayList<Module> modules = new ArrayList<>(List.of(m1, m2, m3));
//
//
//        // Create course test cases
//        Course c1 = new Course();
//        c1.setName("CSIT");
//        c1.setStartDate(DateTime.parse("2020-09-01"));
//        c1.setStartDate(DateTime.parse("2021-04-30"));
//
//        Course c2 = new Course();
//        c2.setName("CSIT");
//        c2.setStartDate(DateTime.parse("2020-09-01"));
//        c2.setStartDate(DateTime.parse("2021-04-30"));
//
//        Course c3 = new Course();
//        c3.setName("CSIT");
//        c3.setStartDate(DateTime.parse("2020-09-01"));
//        c3.setStartDate(DateTime.parse("2021-04-30"));


        // Create test modules
        Module m1 = new Module("Software Engineering", "CT417", );
        Module m2 = new Module("Machine Learning", "CT4101");
        Module m3 = new Module("Professional Skills", "CT436");
        ArrayList<Module> modules = new ArrayList<Module>(List.of(m1, m2, m3));
        // Create test courses
        Course c1 = new Course("CSIT", new ArrayList<>(), new ArrayList<>(), DateTime.parse("2020-09-01"), DateTime.parse("2021-04-30"));
        Course c2 = new Course("BIS", new ArrayList<>(), new ArrayList<>(), DateTime.parse("2020-09-01"), DateTime.parse("2021-04-30"));
        Course c3 = new Course("ENG", new ArrayList<>(), new ArrayList<>(), DateTime.parse("2020-09-01"), DateTime.parse("2021-04-30"));
        ArrayList<Course> courses = new ArrayList<Course>(List.of(c1, c2, c3));


        // Populating courses array
        ArrayList<Course> courses = new ArrayList<>(List.of(c1, c2, c3));

        // Assigning student to a course
        s1.setCourses(new ArrayList<Course>(List.of(c1, c2)));
        s2.setCourses(new ArrayList<Course>(List.of(c2, c3)));
        s3.setCourses(new ArrayList<Course>(List.of(c1, c3)));

        // Assigning modules to students
        s1.setModules(new ArrayList<Module>(List.of(m1, m2)));
        s2.setModules(new ArrayList<Module>(List.of(m2, m3)));
        s3.setModules(new ArrayList<Module>(List.of(m1, m3)));

        // Add students to modules
        m1.setAssignedStudents(new ArrayList<Student>(List.of(s1, s3)));
        m2.setAssignedStudents(new ArrayList<Student>(List.of(s1, s2)));
        m3.setAssignedStudents(new ArrayList<Student>(List.of(s2, s3)));

        // Add course to modules
        m1.setCourseAssociated(new ArrayList<Course>(List.of(c1, c2)));
        m2.setCourseAssociated(new ArrayList<Course>(List.of(c2, c3)));
        m3.setCourseAssociated(new ArrayList<Course>(List.of(c1, c3)));

        // Add students to courses
        c1.setStudents(new ArrayList<Student>(List.of(s1, s3)));
        c2.setStudents(new ArrayList<Student>(List.of(s1, s2)));
        c3.setStudents(new ArrayList<Student>(List.of(s2, s3)));

        // Add modules to courses
        c1.setModules(new ArrayList<Module>(List.of(m1, m3)));
        c2.setModules(new ArrayList<Module>(List.of(m1, m2)));
        c3.setModules(new ArrayList<Module>(List.of(m2, m3)));
    }

}
