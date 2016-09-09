package cpe200;


public class Student {


    private
        String name,id;
        int yob;
        boolean status;

    public Student() {
        name = "John Doe";
        id = "560610000";
        yob = 1990;
        status = false;
    }

    public Student(String name, String id){
        if(name == "") {
            this.name = "John Doe";
        }
        else {
            this.name = name;
        }
        if(isValidStudent_id(id)){
            this.id = id;
        }
        else {
            this.id = "560610000";
        }
        yob = 1990;
        status = true;
    }

    public Student(String name,String id,int yob){
        if(name == "") {
            this.name = "John Doe";
        }
        else {
            this.name = name;
        }
        if(isValidStudent_id(id)){
            this.id = id;
        }
        else {
            this.id = "560610000";
        }
        if(yob <= 1989){
            this.yob = 1990;
        }
        else {
            this.yob = yob;
        }

        status = true;
    }

    public Student(String name,String id,int yob,boolean status){
        if(name == "") {
            this.name = "John Doe";
        }
        else {
            this.name = name;
        }
        if(isValidStudent_id(id)){
            this.id = id;
        }
        else {
            this.id = "560610000";
        }
        if(yob <= 1989){
            this.yob = 1990;
        }
        else {
            this.yob = yob;
        }

        this.status = status;
    }

    public String getName(){
        return name;
    }

    public String getStudent_id(){
        return id;
    }

    public int getYearOfBirth(){
        return yob;
    }

    public boolean isActive() {
        if(status == true){
            return true;
        }
        return  false;
    }
    public void setName(String name){
        if(name != ""){
            this.name = name;
        }
    }

    public void setStudent_id(String id){
        if(isValidStudent_id(id)){
           this.id = id;
        }
    }
    public void setYearOfBirth(int yob){
        if(yob >1989){
            this.yob = yob;
        }
    }

    @Override
    public String toString() {
        String o = name +" (" +id+ ") "+ "was born in " + yob + " is an ";
        if(status==true){
            o = o+"ACTIVE student.";
        }
        else {
            o = o+"INACTIVE student.";
        }
        return o;
    }

    private boolean isValidStudent_id(String id) {
        if(id.matches("5[6-9]{1}061[0-2]{1}[0-9]{3}")) {
            return true;
        }
        return false;
    }

    private boolean isValidYOB(int yob) {
        return true;
    }

    // declare your attributes here
}
