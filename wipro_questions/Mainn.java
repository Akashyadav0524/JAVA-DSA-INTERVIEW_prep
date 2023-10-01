import java.io.*;


class Mainn {
    public static void main(String[] args) throws IOException {
        Runner.run();
    }
}

class Runner {
    public static void run() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim()); // Number of test cases

        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine().trim()); // Size of the array
            int[] arr = new int[N];
            String[] input = br.readLine().trim().split(" ");
            
            // Parse array elements
            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(input[i]);
            }

            int evenCount = 0;
            int oddIndex = -1, evenIndex = -1;

            // Check the evenness of each element and count odd and even elements
            for (int i = 0; i < N; i++) {
                if (arr[i] % 2 == 0) {
                    evenCount++;
                    evenIndex = i;
                } else {
                    oddIndex = i;
                }
            }

            if (evenCount == 1) {
                // There is only one even number, so print its index
                System.out.println(evenIndex + 1);
            } else {
                // There is only one odd number, so print its index
                System.out.println(oddIndex + 1);
            }
        }
    }
}
