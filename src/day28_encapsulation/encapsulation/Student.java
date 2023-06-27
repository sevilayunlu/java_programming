package day28_encapsulation.encapsulation;

public class Student {


   private String name;//the disadvantage of the public is that you can access it anytime and you can modify it anyway you want.

    private int age;//to be able to have more control over the data
    // , we should use private ac. mod.If the variable is public, we cannot add any conditions to set the variable.


    public String getName() {

        if(name==null){
            System.err.println("Name has not been set");
            System.exit(1);
        }
        return name;
    }

    public void setName(String name) {
        boolean hasDigit = false, hasSpecialChar = false;
        for (char each : name.toCharArray()) {
            if (Character.isDigit(each)) {
                hasDigit = true;
                break;
            }
        }

     if (hasDigit) {

      System.err.println("Invalid name: " + name);
      System.exit(1);
     }

     this.name = name;
    }

    public int getAge() {//Read only,then returns the instance variable. That's why, it is a return method.

        if (age == 0) {
            System.err.println("Age has not been set");
            System.exit(1);//something went wrong
        }


        return age;
    }

    public void setAge(int age) {//Write only,setter needs to pass an argument. It is  a void method.

        if (age < 1 || age > 100) {
            System.err.println("Invalid Age: " + age);
            //return;//exiting the method
            System.exit(1);//the entire program gets terminated
        }
        this.age = age;
    }//we can give conditions before we write the data in getter or setter.


}
