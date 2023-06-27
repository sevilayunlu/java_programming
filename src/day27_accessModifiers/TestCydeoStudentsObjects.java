package day27_accessModifiers;

public class TestCydeoStudentsObjects {
    public static void main(String[] args) {

        System.out.println(CydeoStudent.schoolName);

        CydeoStudent student1=new CydeoStudent("Ekaterina",28,'F');
        CydeoStudent student2=new CydeoStudent("Alena",27,'F');

        System.out.println(student1);
        System.out.println(student2);

        System.out.println(student1.schoolName);//the static is not supposed to be called thorough the object
        // but through the class name.
        System.out.println(student2.schoolName);

        System.out.println(student1.secretCode);
        System.out.println(student2.secretCode);


    }
}
