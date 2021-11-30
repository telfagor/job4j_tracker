package pojo;

public class College {
    public static void main(String[] args) {
        Student vasile = new Student();
        vasile.setName("Vasile");
        vasile.setGroup("B");
        vasile.setReceiptDate("21.08.19");

        System.out.println("Student: " + vasile.getName()
                + " Group: " + vasile.getGroup() + " Receipt date: " + vasile.getReceiptDate());
    }
}
