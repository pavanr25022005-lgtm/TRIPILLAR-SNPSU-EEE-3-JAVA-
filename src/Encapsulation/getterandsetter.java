package Encapsulation;

public class getterandsetter {


        // 🔒 Private variables (Data Hiding)
        private String name;
        private int usn;
        private static String college = "sapthagiri";

        // 🧱 Constructor
        getterandsetter(String name, int usn) {
            this.name = name;
            this.usn = usn;
        }

        // ✅ Getters (Read access)
        public String getName() {
            return name;
        }

        public int getUsn() {
            return usn;
        }

        public static String getCollege() {
            return college;
        }

        // ✅ Setters (Controlled write access)
        public void setName(String name) {
            this.name = name;
        }

        public void setUsn(int usn) {
            this.usn = usn;
        }

        public static void setCollege(String collegeName) {
            college = collegeName;
        }
    }

    class Driver {
        public static void main(String[] args) {

            getterandsetter s1 = new getterandsetter("pavan", 83);
            getterandsetter s2 = new getterandsetter("raj", 123);

            // Using setters to modify data
            s1.setName("Pavan Raj");
            s2.setUsn(321);
            getterandsetter.setCollege("Sapthagiri Institute");

            // Using getters to read data
            System.out.println(s1.getName());
            System.out.println(s1.getUsn());
            System.out.println(getterandsetter.getCollege());

            System.out.println();

            System.out.println(s2.getName());
            System.out.println(s2.getUsn());
            System.out.println(getterandsetter.getCollege());
        }
    }

