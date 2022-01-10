package com.itheima07;

public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("小明");
        s1.setAge(23);
        s1.show();

        Student s2 = new Student("小明",23);
                s2.show();

    }
}
