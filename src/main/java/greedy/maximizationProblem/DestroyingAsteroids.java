package greedy.maximizationProblem;

import java.util.Arrays;

public class DestroyingAsteroids {
    public static void main(String[] args) {
        int arr[]={3,9,19,5,21};
        int mass=10;
        System.out.println(asteroidsDestroyed(mass,arr));
    }
    public static boolean asteroidsDestroyed(int mass, int[] asteroids) {
        boolean bool=true;
        long m=mass;
        Arrays.sort(asteroids);
        for(int i=0;i<asteroids.length;i++){
            if(m<asteroids[i]){
                bool=false;
                break;
            }
            m+=asteroids[i];
        }
        return bool;
    }
}
