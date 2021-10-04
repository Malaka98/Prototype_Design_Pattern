package com.company;

public class Main {

    public static void main(String[] args) {

        StudentRecode obj = new StudentRecode(12345, "root", "Localhost", 20);

        obj.showRecode();

        StudentRecode obj2 = (StudentRecode) obj.getClone();
        obj2.showRecode();

        StudentRecode obj3 = (StudentRecode) obj.getClone();
        obj3.getClone();

        StudentRecode obj4 = (StudentRecode) obj.getClone();
        obj4.showRecode();

        StudentRecode obj5 = (StudentRecode) obj.getClone();
        obj5.showRecode();
    }
}
