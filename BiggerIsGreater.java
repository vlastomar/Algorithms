import java.util.Arrays;

public class BiggerIsGreater {
    public static void main(String[] args) {

        String w = "dkhc";


                char[] charArr = w.toCharArray();
                int n = charArr.length;
                int i = 0;
                for (i = n - 1; i > 0; i--)
                {
                    if (charArr[i] > charArr[i - 1])
                    {
                        break;
                    }
                }
                if (i == 0)
                {
                   // return "no answer";
                    System.out.println("no answer");
                }
                else
                {
                    int small = charArr[i - 1], next = i;

                    for (int j = i + 1; j < n; j++)
                    {
                        if (charArr[j] > small && charArr[j] < charArr[next])
                        {
                            next = j;
                        }
                    }
                    swap(charArr, i - 1, next);
                    Arrays.sort(charArr, i , n);
                }
                //return new String(charArr);
        String bbb = Arrays.toString(charArr);
        System.out.println(bbb);
            }
            static void swap(char charArr[], int i, int j)
            {
                char temp = charArr[i];
                charArr[i] = charArr[j];
                charArr[j] = temp;
            }
    }

