package lab_questions;

abstract class Animals
{
    abstract void cats();
    abstract void dogs();
}
class Cats extends Animals
{
    void cats()
    {
        System.out.println("Cats Meow");
    }
    void dogs()
    {
    }
}
class Dogs extends Animals
{
    void cats()
    {
    }
    void dogs()
    {
        System.out.println("Dogs Bark");
    }
}
class AbstractAnimal
{
    public static void main(String[]args)
    {
        Cats catobj1=new Cats();
        catobj1.cats();
        Dogs dogobj2 = new Dogs();
        dogobj2.dogs();
    }
}