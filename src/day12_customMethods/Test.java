package day12_customMethods;

import java.lang.module.ModuleDescriptor;

public class Test {
    public static void main(String[] args) {

        int number=300;
        CustomMethodsWithParameters.oddOrEven(300);

        String firstName="Vasyl",
                lastName="Dobrianski";

        CustomMethodsWithParametersPractice.initial(firstName,lastName);

    }
}
