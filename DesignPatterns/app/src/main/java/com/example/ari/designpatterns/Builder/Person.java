package com.example.ari.designpatterns.Builder;

/**
 * Created by Ari on 6/25/2017.
 */
/*
****IMPORTANT!!!!!!: THE BUILDER DESIGN PATTERN CREATES IMMUTABLE OBJECTS
THIS IS THE CLASS WHOSE OBJECT WE WILL BE CREATING
USING OUR BUILDER.
 */
public class Person {

    private String firstName;
    private String lastName;
    private String motherName;
    private String fatherName;
    private String address;
    private String city;
    private String state;

    /*OUR CONSTRUCTOR TAKES IN A BUILDER CLASS AND SETS THE PERSON VARIABLES WE WILL BE SETTING
     WITH IT*/
    private Person(PersonBuilder builder) {
        firstName = builder.firstName;
        lastName = builder.lastName;
        motherName = builder.motherName;
        fatherName = builder.fatherName;
        address = builder.address;
        city = builder.city;
        state = builder.state;
    }

    //WE STILL NEED GETTERS, BUT THE SETTERS WILL BE ACCESSED IN THE BUILDER CLASS
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMotherName() {
        return motherName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    //MUST BE STATIC TO BE ACCESSED FROM OUTSIDE THE CLASS, AND EACH METHOD CALLED
    public static class PersonBuilder {
        private String firstName;
        private String lastName;
        private String motherName;
        private String fatherName;
        private String address;
        private String city;
        private String state;

        /*
        THE PERSONBUILDER WILL CONTAIN ALL THE SETTER METHODS.
        IT IS COMMON PRACTICE FOR THE (set) PREFIX TO BE DROPPED
        TO INCREASE READABILITY. ADDITIONALLY, EACH SETTER WILL RETURN
        THE PERSONBUILDER OBJECT BEING CREATED, AND HAVE THAT OBJECT
        SERVE AS THE CONSTRUCTOR PARAMETER IN CREATING A NEW PERSON OBJECT
         */
        public PersonBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public PersonBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public PersonBuilder motherName(String motherName) {
            this.motherName = motherName;
            return this;
        }

        public PersonBuilder fatherName(String fatherName) {
            this.fatherName = fatherName;
            return this;
        }

        public PersonBuilder address(String address) {
            this.address = address;
            return this;
        }

        public PersonBuilder city(String city) {
            this.city = city;
            return this;
        }

        public PersonBuilder state(String state) {
            this.state = state;
            return this;
        }

        /*
        THIS IS THE KEY METHOD. IT ALLOWS YOU TO SET EACH VARIABLE BY CLAIMING THE
        (.METHOD) CALL, AS WELL AS MAKE SURE OMITTED AT RUNTIME THAT ITEMS AREN'T ,
         BY THROWING ILLEGALSTATEEXCEPTION IF THEY ARE...
         */
        public Person build() {
            if (firstName == null) {
                throw new IllegalStateException("Need First Name");
            }
            if (lastName == null) {
                throw new IllegalStateException("Need Last Name");
            }
            if (motherName == null) {
                throw new IllegalStateException("Need First Name");
            }
            if (fatherName == null) {
                throw new IllegalStateException("Need First Name");
            }
            if (address == null) {
                throw new IllegalStateException("Need Address");
            }
            if (city == null) {
                throw new IllegalStateException("Need City");
            }
            if (state == null) {
                throw new IllegalStateException("Need State");
            }
            return new Person(this);
        }
    }
}
