package day31_inheritance.animal_MethodOverriding;

public class Lion extends Animal{

    private boolean isAfrican;

    public Lion(String name, String breed, char gender, int age, String size, String color, boolean isAfrican) {
        super(name, breed, gender, age, size, color);
        setAfrican(isAfrican);

    }

    public boolean isAfrican() {
        return isAfrican;
    }

    public void setAfrican(boolean african) {
        isAfrican = african;
    }

    @Override
    public void eat() {
        System.out.println("Lion "+getName()+" is eating lion food");
    }

    public void roar(){
        System.out.println("Lion "+getName()+" is roaring");
    }


    @Override
    public String toString() {
        return super.toString().replace("}","")+
                ", African lion='" + isAfrican + '\'' +
                '}';
    }
}
