import java.util.*;


public class Main {
    public static void main(String[] args) {

        Student student1 = new Student(1, "Alex", "Vladimir", "Griggs");
        Student student2 = new Student(2, "Bob", "Billy", "Tornton");
        Student student3 = new Student(3, "Cillian", "Jack", "Murphy");
        Student student4 = new Student(4, "Dick", "Smith", "Chaney");
        List<Student> studentList = new ArrayList<>();
        StudentGroup studentGroup = new StudentGroup(studentList);
        studentGroup.addStudent(student1);
        studentGroup.addStudent(student2);
        studentGroup.addStudent(student3);
        studentGroup.addStudent(student4);
//        StudentGroupIterator iterator = new StudentGroupIterator(studentGroup);
////        while (iterator.hasNext()){
////            System.out.println(iterator.next());

//        for(Student student : studentGroup){
//            System.out.println(student);

        StudentGroupService service = new StudentGroupService(studentGroup);
        for(Student student : service.getSortedStudentGroup()){
            System.out.println(student);
        }

        StudentGroup studentGroup1 = new StudentGroup(new ArrayList<>(), 1);
        StudentGroup studentGroup2 = new StudentGroup(new ArrayList<>(), 2);
        StudentGroup studentGroup3 = new StudentGroup(new ArrayList<>(), 3);
        StudentGroup studentGroup4 = new StudentGroup(new ArrayList<>(), 4);
        StudentGroup studentGroup5 = new StudentGroup(new ArrayList<>(), 5);
        StudentGroup studentGroup6 = new StudentGroup(new ArrayList<>(), 6);

        Stream stream1 = new Stream("Stream 1", new ArrayList<>());
        stream1.addStudentGroup(studentGroup1);
        stream1.addStudentGroup(studentGroup2);
        stream1.addStudentGroup(studentGroup3);

        Stream stream2 = new Stream("Stream 2", new ArrayList<>());
        stream2.addStudentGroup(studentGroup4);
        stream2.addStudentGroup(studentGroup5);

        Stream stream3 = new Stream("Stream 3", new ArrayList<>());
        stream3.addStudentGroup(studentGroup6);

        StreamService streamService = new StreamService(Arrays.asList(stream1, stream2, stream3));
        for (Stream stream: streamService.getSortedStreamBySize()) {
            System.out.println(stream);
        }
    }
}