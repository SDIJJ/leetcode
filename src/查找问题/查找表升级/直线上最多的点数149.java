package 查找问题.查找表升级;

/**
 * @Description: 直线上最多的点数
 * @author: Arnold
 * @since: 2019/3/23 9:53
 * @version: v1.0.0
 */
public class 直线上最多的点数149 {
    //TODO 未完成................
    public int maxPoints(Point[] points) {
        if(points.length==0||points==null)
            return 0;
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < points.length; i++) {
            for (int j = i+1; j <points.length ; j++) {
                double k=(double)(points[i].x-points[j].x)/(double)(points[i].y-points[j].y);
                double b=(double)points[i].y-(double)(k*points[i].x);
                int sum=2;
                for (int l = j+1; l <points.length ; l++) {
                    if(Math.abs(k*points[l].x+b-points[l].y)<0.1)
                        sum+=1;
                }
                max=Math.max(max,sum);
            }

        }
        return max;
    }


}

class Point {
    int x;
    int y;
    Point() { x = 0; y = 0; }
    Point(int a, int b) { x = a; y = b; }
}
