package SwordForOffer;

/*
Problem 3
题目描述
在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */

/*
每次将二维数组矩阵的中最右上角的数字与要查找的数字比较，基于二维数组从左到右从上到下递增，
那么当最右上角的数字大于目标数字就可以去掉该列，当最右边的数字小于目标数字的时候就去掉该行，如此遍历查找
 */

public class Find {
    public boolean find(int target, int[][] array) {
        int column = array[0].length - 1;
        int row = 0;
        while (row <= array.length - 1 && column >= 0) {
            if (target == array[row][column]) {
                return true;
            } else if (target > array[row][column]) {
                row++;
            } else {
                column--;
            }
        }
        return false;
    }
}
