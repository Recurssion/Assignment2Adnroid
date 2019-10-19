package com.example.assignment2adnroid;

import java.util.ArrayList;

public class StudentDateSaurce
{
    private static  StudentDateSaurce instance;
    private ArrayList<Student> arrayList=new ArrayList<>();
    private StudentDateSaurce()
    {

    }
    public static StudentDateSaurce getInstance()
    {
        if(instance==null)
        {
            instance=new StudentDateSaurce();
        }
        return instance;
    }
    public void addStudent(Student student)
    {
        instance.arrayList.add(student);
    }
    public  int getStudentCount()
    {
        return arrayList.size();
    }
    public Student getStudent(int index)
    {
        return arrayList.get(index);
    }
    public ArrayList<Student> getAllStudent()
    {
        return arrayList;
    }
}

