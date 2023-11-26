class Box {
    double width;
    double height;
    double depth;
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    public String toString() {
        return "Размеры " + width + " на "
                + depth + " на " + height + ".";
    }
}


class toStringDemo{
    public static void main(String[] args) {
        Box b = new Box(10, 12, 14);
        String s = "Объект b типа Box: " + b;
        System.out.println(b);
        System.out.println(s);



    }

}
