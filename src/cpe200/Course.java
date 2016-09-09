package cpe200;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Course {

    public Course() {
        this("","","",30);
    }

    public Course(String n, String cid) {
         this(n,cid,"",30);
    }

    public Course(String n, String cid, String l) {
        this(n,cid,l,30);
    }

    public Course(String n, String cid, String l, int max) {
        if(n == ""){
            this.course_name = "TBA";
        }
        else {
            this.course_name = n;
        }
        if(cid == ""){
            this.course_id = "000000";
        }
        else {
            this.course_id = cid;
        }
        if(l == ""){
            this.lecturer = "TBA";
        }
        else {
            this.lecturer = l;
        }
        if(max >   10){
            this.max_students = max;
        }
        else {
            this.max_students = 30;
        }
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = !course_name.equalsIgnoreCase("")?course_name:this.course_name;
    }

    public String getCourse_id() {
        return course_id;
    }

    public void setCourse_id(String course_id) {
        this.course_id = isValidCourse_id(course_id)?course_id:this.course_id;
    }

    // implement the other get and set methods here
    public String getLecturer() {
        return lecturer;
    }

    public void setLecturer(String lecturer) {
        if(lecturer != ""){
            this.lecturer = lecturer;
        }
    }

    public int getMax_students(){
        return max_students;
    }

    public void setMax_students(int max_students) {
        if(max_students>=10){
            this.max_students = max_students;
        }
    }

    public int getNo_students() {
        return no_students;
    }

    public void setNo_students(int no_students) {
        if(no_students >= 0 && no_students <= max_students){
            this.no_students = no_students;
        }
    }

    @Override
    public String toString() {
        String o = this.course_name + " ("
                + this.course_id + "), Teacher: "
                + this.lecturer + ", has ";
        if(no_students == 0){
            o += "NO student, ";
        }
        else if(no_students == 1){
            o+= "ONE student, ";
        }
        else if(no_students >1){
            o+= no_students + " students, ";
        }

        o+= "[maximum: " + max_students+ "]";


        return o;
    }

    private boolean isValidCourse_id(String id) {
        Pattern p = Pattern.compile(idREGEX);
        Matcher m = p.matcher(id);

        if(m.matches()==true){
            return true;
        }
        else {
            return false;
        }
    }

    // Regular expression for the Student ID pattern
    private static final String idREGEX = "\\d{6}";

    // all private attributes
    private String course_name;
    private String course_id;
    private String lecturer;
    private int max_students;
    private int no_students;
}
