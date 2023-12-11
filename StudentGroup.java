import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student> {

    public StudentGroup(ArrayList<Student> studentList, int i) {
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public StudentGroup(List<Student> studentList) {
        this.studentList = studentList;
    }

    private List<Student> studentList;

    public void addStudent(Student student){
        studentList.add(student);
    }

    @Override
    public Iterator iterator() {
        return new StudentGroupIterator(this);
    }
}
