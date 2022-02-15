public class Main {
    public static void main(String[] args) {
        Shape[] shape = new Shape[2];
        shape[0] = new Circle(98);
        shape[1] = new Rectangle(16,7);

        System.out.println("Pre reSize(): ");
        System.out.println(shape[0]);
        System.out.println(shape[1]);

        for (Shape s : shape){
            if (s instanceof Circle)
                ((Circle) s).reSize(Math.random());
            if (s instanceof Rectangle)
                ((Rectangle) s).reSize(Math.random());
        }

        System.out.println("Post reSize(): ");
        System.out.println(shape[0]);
        System.out.println(shape[1]);
    }
}
