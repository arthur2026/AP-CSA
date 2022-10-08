public class Main
{
    private String secret = "concatenation";
    public String guess2;
    public int scoreGuess(String guess)
    {
        int occurences = 0;
        for (int i = 0; i < secret.length() - guess.length() + 1; i++)
        {
            if (secret.substring(i, i + guess.length()).equals(guess))
            {
                occurences += 1;
            }
        }
        return occurences * guess.length() * guess.length();
    }
    public String findBetterGuess(String guess1, String guess2)
    {
        String ans = "";
        int x = scoreGuess(guess1);
        int y = scoreGuess(guess2);
        if (x > y)
        {
            ans = guess1;
        } else if (x < y) {
            ans = guess2;
        } else {
            int compare = guess1.compareTo(guess2);
            if (compare > 0)
            {
                ans = guess1;
            }
            if (compare < 0)
            {
                ans = guess2;
            }
        }
        return ans;
    }

    public static void main(String[] args)
    {
        Main s = new Main();
        System.out.println(s.scoreGuess("ten"));
        System.out.println(s.scoreGuess("nation"));
        System.out.println(s.findBetterGuess("ten", "nation"));
        System.out.println(s.scoreGuess("con"));
        System.out.println(s.scoreGuess("cat"));
        System.out.println(s.findBetterGuess("con", "cat"));
    }
}