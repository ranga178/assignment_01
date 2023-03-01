package com.example.assignment_01;

import javafx.scene.image.Image;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class student {

    //instance variables
    private String firstName;
    private String lastName;
    private String studentNum;
    private String activity;


/**
 *  constructor
 */

    public student(String firstName, String lastName, String studentNum,
                   String activity) {
       setFirstName(firstName);
       setLastName(lastName);
       setStudentNum(studentNum);
       setActivity(activity);

    }

    /**
     * get/set for first name
     *
     */
    public String getFirstName() {
        return firstName;
    }


    public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

    /**
     * get/set for last name
     *
     */
    public String getLastName() {
        return lastName;
    }
// set last name
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * get/set for student number
     *
     */
    public String getStudentNum() {
        return studentNum;
    }

    //set student number
    public void setStudentNum(String studentNum) {
        this.studentNum = studentNum;
    }

    /**
     * get/set for activity with validation
     *
     */
    public String getActivity() {
        return activity;
    }

    public static List<String> getValidActivity()
    {
        return Arrays.asList("Coding","Video Games","Reading","Swimming");
    }
    public void setActivity(String activity) {
        if (getValidActivity().contains(activity))
            this.activity = activity;
        else
            throw new IllegalArgumentException(activity + "invalid, must be one of " + getValidActivity());
    }

    /**
     *
     * get image method
     */
    public Image getImage()
    {
        String pathName = "images/"+firstName+".jpg";
       return new  Image(student.class.getResourceAsStream(pathName));
    }


    /**
     *
     * Concatenates first name and last name together
     */
    public String toString()
    {
        return firstName + " " + lastName;
    }


}
