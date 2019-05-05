package 剑指offer;

/**
 * @Description:
 * @author: Arnold
 * @since: 2019/5/5 7:50
 * @version: v1.0.0
 */
public class 二维数组中的查找01 {
    public boolean Find(int target, int[][] array) {
        int xSize = array.length;
        int ySize = array[0].length;
        if (xSize == 0 || ySize == 0)
            return false;
        if (target < array[0][0] || target > array[xSize - 1][ySize - 1])
            return false;
        int i = 0, j = ySize - 1;
        while (i < xSize && j >= 0) {
            if (target > array[i][j])
                i++;
            else if (target < array[i][j])
                j--;
            else
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new 二维数组中的查找01().Find(7, new int[][]{{}}));
    }
}
