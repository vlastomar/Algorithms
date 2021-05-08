
import java.util.*;

public class QueenAttackII {
    public static void main(String[] args) {
        int n = 100;
        int k = 100;
        int r_q = 48;
        int c_q = 81;
       /* List<List<Integer>> obstacles = new ArrayList<>();
        List<Integer> a1 = new ArrayList<>();
        List<Integer> a2 = new ArrayList<>();
        List<Integer> a3 = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        a1 = List.of(5,5);
        a2 = List.of(4,2);
        a3 = List.of(2,3);
        obstacles.add(a1);
        obstacles.add(a2);
        obstacles.add(a3);*/



       /* for (int i = 0; i < obstacles.size() ; i++) {
            for (int j = 0; j <obstacles.get(i).size() ; j++) {
                temp.add(obstacles.get(i).get(j));

                }

            }*/
       Map<Integer,Integer> check = new HashMap<>();
        /*for (int i = 0; i < obstacles.size(); i++) {
            check.putIfAbsent(obstacles.get(i).get(0), 0);
            check.put(obstacles.get(i).get(0), obstacles.get(i).get(1));

        }*/

        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(" ");
while (!input[0].equals("END")){
    if (input[0].equals("END")){
        break;
    }else {
        check.put(Integer.parseInt(input[0]), Integer.parseInt(input[1]));
        System.out.printf("%s -  %s\n", input[0], input[1]);
        input = scan.nextLine().split(" ");
    }

}



        int counter = 0;
//up
        for (int i = r_q + 1; i <= n  ; i++) {
            if (check.containsKey(i)){
                if (check.get(i) == c_q){
                    break;
                }

            }
            counter++;
        }
        
        // NE
        int col = c_q + 1;
        for (int i = r_q + 1; i <= n ; i++) {
            if (col <= n){
                if (check.containsKey(i)){
                    if (check.get(i) == col){
                        break;
                    }
                }
                counter++;
                col++;
            }
        }
        //E
        for (int i = c_q+1; i <= n; i++) {
            if (check.containsKey(r_q) ){
                if (check.get(r_q) == i){
                    break;
                }

            }
            counter++;
        }
        //SE
        col = c_q + 1;
        for (int i = r_q - 1; i > 0 ; i--) {
            if (col <= n){
                if (check.containsKey(i)){
                    if (check.get(i) == col){
                        break;
                    }
                }
                counter++;
                col++;
            }
        }

        // S
        for (int i = r_q -1; i > 0 ; i--) {

            if (check.containsKey(i)){
                if (check.get(i) == c_q){
                    break;
                }

            }
            counter++;
        }

        // SW
        col = c_q -1;
        for (int i = r_q - 1; i > 0; i--) {
            if (col > 0){
                if (check.containsKey(i)){
                    if (check.get(i) == col){
                        break;
                    }
                }
                counter++;
                col--;
            }
        }

        //W
        for (int i = c_q - 1; i > 0; i--) {
            if (check.containsKey(r_q)){
                if (check.get(r_q) == i){
                    break;
                }

            }
            counter++;
        }

        //NW

        col = c_q -1;
        for (int i = r_q + 1; i <= n ; i++) {
            if (col > 0){
                if (check.containsKey(i)){
                    if (check.get(i) == col){
                        break;
                    }
                }
                counter++;
                col--;
            }

        }

        System.out.println(counter);


    }

    }

