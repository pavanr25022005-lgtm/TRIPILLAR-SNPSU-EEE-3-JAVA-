package conditionalstatements;

public class thankyou {


        // ANSI colors for rainbow
        static final String[] COLORS = {
                "\u001B[31m", // Red
                "\u001B[33m", // Yellow
                "\u001B[32m", // Green
                "\u001B[36m", // Cyan
                "\u001B[34m", // Blue
                "\u001B[35m"  // Purple
        };

        static final String RESET = "\u001B[0m";

        // Big THANK YOU using Unicode stars
        static final String[] TEXT = {
                "⭐ ⭐ ⭐ ⭐ ⭐       ⭐           ⭐         ⭐ ⭐ ⭐         ⭐           ⭐     ⭐           ⭐",
                "      ⭐           ⭐           ⭐       ⭐           ⭐     ⭐ ⭐         ⭐     ⭐         ⭐",
                "      ⭐           ⭐ ⭐ ⭐ ⭐ ⭐   ⭐       ⭐ ⭐ ⭐ ⭐ ⭐     ⭐   ⭐           ⭐ ⭐ ⭐",
                "      ⭐           ⭐           ⭐       ⭐           ⭐     ⭐     ⭐           ⭐         ⭐",
                "      ⭐           ⭐           ⭐       ⭐           ⭐     ⭐           ⭐     ⭐           ⭐",
                "",
                "⭐           ⭐         ⭐ ⭐ ⭐         ⭐           ⭐",
                "  ⭐       ⭐       ⭐           ⭐     ⭐           ⭐",
                "    ⭐   ⭐         ⭐           ⭐     ⭐           ⭐",
                "      ⭐           ⭐           ⭐     ⭐           ⭐",
                "      ⭐             ⭐ ⭐ ⭐             ⭐ ⭐ ⭐"
        };

        public static void main(String[] args) throws Exception {

            int colorIndex = 0;

            while (true) { // infinite animation loop
                System.out.print("\033[H\033[2J"); // clear screen
                System.out.flush();

                String color = COLORS[colorIndex % COLORS.length];

                for (String line : TEXT) {
                    System.out.println(color + line + RESET);
                    Thread.sleep(80); // typing effect
                }

                colorIndex++;
                Thread.sleep(500); // pause before color change
            }
        }
    }

