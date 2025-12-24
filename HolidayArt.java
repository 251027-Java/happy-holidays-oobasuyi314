public class HolidayArt {

    public static void main(String[] args) {
        // TODO: Parse command-line argument for tree height (default: 5)
        int height = 5;

        if (args.length == 1) {
            try {
                height = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid height. Using default height of 5.");
            }
        }

        // TODO: Print the tree
        printTree(height);
    }

    /**
     * Prints a Christmas tree with the given height.
     * 
     * @param height Number of branch levels (not including star and trunk)
     */
    public static void printTree(int height) {
        int maxWidth = 2 * height - 1;
        // Steps:
        // 1. Print the star on top (centered)
        int starSpaces = (maxWidth - 1) / 2;
        System.out.println(" ".repeat(starSpaces) + "*");
        // 2. Loop through each level of branches
        for (int i = 1; i <= height; i++) {
            int stars = 2 * i - 1;
            int spaces = (maxWidth - stars) / 2;
            System.out.println(" ".repeat(spaces) + "*".repeat(stars));
        }
        // 3. Print the trunk (centered)
        int trunkSpaces = (maxWidth - 3) / 2;
        System.out.println(" ".repeat(trunkSpaces) + "|||");
        System.out.println("Merry Christmas & Happy Holidays!");

    }
}
