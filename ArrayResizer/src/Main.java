import java.util.Arrays;

public class Main {
    public static int[][] resize(int[][] array2D)
    {
        int l = array2D.length;
        int num = 0;
        for (int i = 0; i < l; i++)
        {
            if (isNonZeroRow(array2D, i))
            {
                num += 1;
            }
        }
        int[][] ans = new int[num][array2D[0].length];
        int idx = 0;
        for (int i = 0; i < l; i++)
        {
            if (isNonZeroRow(array2D, i))
            {
                ans[idx] = array2D[i];
                idx += 1;
            }
        }
        return ans;
    }
    public static boolean isNonZeroRow(int[][] array2D, int r)
    {
        boolean ans = true;
        int zeroC = 0;
        for (int j = 0; j < array2D[0].length; j++)
        {
            if (array2D[r][j] == 0)
            {
                zeroC += 1;
            }
        }
        if (zeroC > 0)
        {
            ans = false;
        }
        return ans;
    }

    public static void main(String[] args)
    {
        int[][] array2D = new int[4][3];
        array2D[0][0] = 2;
        array2D[0][1] = 1;
        array2D[0][2] = 0;
        array2D[1][0] = 1;
        array2D[1][1] = 3;
        array2D[1][2] = 2;
        array2D[2][0] = 0;
        array2D[2][1] = 0;
        array2D[2][2] = 0;
        array2D[3][0] = 4;
        array2D[3][1] = 5;
        array2D[3][2] = 6;
        System.out.println(isNonZeroRow(array2D, 0));
        System.out.println(isNonZeroRow(array2D, 1));
        System.out.println(isNonZeroRow(array2D, 2));
        System.out.println(isNonZeroRow(array2D, 3));

        System.out.println(Arrays.deepToString(resize(array2D)));
    }
}