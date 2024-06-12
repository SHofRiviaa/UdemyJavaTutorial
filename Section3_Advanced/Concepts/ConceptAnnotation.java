package Section3_Advanced.Concepts;

class AB
{
    public void show() {
        System.out.println("In show AB");
    }
}

class BC extends AB
{
    @Override
    public void show() {
        System.out.println("In show BC");
    }
}   

public class ConceptAnnotation 
{
    // Annotation
    // - Metadata about the program
    // - Annotations have no direct effect on the operation of the code they annotate
    // - Annotations are used for providing metadata to the compiler
    // - Annotations can be used by the compiler to detect errors or suppress warnings
    // - Annotations can be processed at compile time or runtime for special processing
    // - Annotations can be used to generate code using annotation processors
    // - There are annotions for classes, methods, fields, parameters, etc.

    public static void main(String[] args) {
        BC obj = new BC();
        obj.show();
    }
}
