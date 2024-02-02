public class ani {
    interface Animal{
        void eat();
        void sleep();
    }
    public static class Monkey implements Animal{
        Monkey(){
            System.out.println("Monkey class is called!");
        }
        void jump(){
            System.out.println("Monkey Jumped!");
        }
        void bite(){
            System.out.println("Monkey bites!");
        }
        public void eat(){
            System.out.println("Monkey eat food!");
        }
        public void sleep(){
            System.out.println("Monkey Sleeps 4 hr. a day!");
        }
    }
    public static class Human implements Animal{
        Human(){
            System.out.println("Human class is called!");
        }
        
        public void eat(){
            System.out.println("Human eats alot!");
        }
        public void sleep(){
            System.out.println("Human Sleeps 8 hr. a day!");
        }
    }
    public static void main(String[] args){
        Monkey m = new Monkey();
        m.jump();
        m.bite();
        m.eat();
        m.sleep();

        Human h = new Human();
        h.eat();
        h.sleep();
    }

}
