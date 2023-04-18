package leetcode.numbers;

public class 배수나누기 {

    // leetcode 2023.04.12
    private void 자리수나누기(int num){
        int[] dig = new int[4]; // For each digit
        int cur = 0;
        String s= new String();
        s.toCharArray();
        s.charAt(0);
        while(num > 0) // Getting each digit
        {
            dig[cur++] = num % 10;
            num /= 10;
        }

        // 나는 10의 배수로 나누려고
        // for문을 사용했지만, 해당 문제에서는 정확하게 4자리라고 제시되었기 때문에 가능했다.
        // while을 사용하는게 더 코드의 양을 줄일 수 있음
    }
}
