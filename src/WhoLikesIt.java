public class WhoLikesIt {
    /**
     * You probably know the "like" system from Facebook and other pages.
     * People can "like" blog posts, pictures or other items.
     * We want to create the text that should be displayed next to such an item.
     * Implement the function which takes an array containing the names of people that like an item.
     * It must return the display text as shown in the examples:
     * []                                -->  "no one likes this"
     * ["Peter"]                         -->  "Peter likes this"
     * ["Jacob", "Alex"]                 -->  "Jacob and Alex like this"
     * ["Max", "John", "Mark"]           -->  "Max, John and Mark like this"
     * ["Alex", "Jacob", "Mark", "Max"]  -->  "Alex, Jacob and 2 others like this"
     * Note: For 4 or more names, the number in "and 2 others" simply increases.
     */

    public static void main(String[] args) {
        String[] names = {"Alex", "Jacob", "Mark", "Max"};
        int likes = 0;
        for (String like : names) {
            likes++;
        }
        String result = "";
        if (likes >= 4) {
            result = names[0] + ", " + names[1] + " and " + (likes - 2) + " others like this";
        } else if (likes == 3) {
            result = names[0] + ", " + names[1] + " and " + names[2] + " like this";
        } else if (likes == 2) {
            result = names[0] + " and " + names[1] + " like this";
        } else if (likes == 1) {
            result = names[0] + " likes this";
        } else {
            result = "no one likes this";
        }
        System.out.println(result);
    }
}
