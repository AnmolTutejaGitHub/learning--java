public class hashCodeInJava {
    public static void main(String[] args) {

        Students max = new Students("Max", 21);
        System.out.println(max.toString()); // Student@65ab7765
        // 65ab7765 this code in toSting method is hashcode of the object

    }

    class Students {

        private String name;
        private int age;

        Students(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
}
