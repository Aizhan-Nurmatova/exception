package com.company;

public class Main {

    public static void main(String[] args) {

        Course course = new Course("Peaksoft","Grazhdanskaya 119 ",
                new Student[]{new Student("Aizhan",25,"java",3),
                              new Student("Beks",18,"java",3),
                              new Student("Rayim",15,"java",3),
                              new Student("Ruslan",20,"java",3),
                new Student("Saikal",14,"js",6)});

        System.out.print(course);

        for (Student st : course.getStudents()) {
                  System.out.print("\n"+st.getName() + " ");
                  try{
                      System.out.print(st.getAge() + " ");
                  }catch (InvalidAgeException e){
                      System.err.print(" \n"+st.getName() + " Studenttin jashy 16 kichine kursta okui albait");
                  }
                  System.out.print(st.getGroup() + " ");
                  System.out.print(st.getBatch() + " ");
                }


    }
}