import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int difLetters = scanner.nextInt();
        int length = scanner.nextInt();

        HashMap<String, String> hashMap = new HashMap<>();

        scanner.nextLine();
        for (int i = 0; i < difLetters; i++){
            String currLine = scanner.nextLine();

            String subLine = currLine.charAt(0) + "";
            currLine = currLine.substring(3);
            hashMap.put(currLine, subLine);
        }

        String line = scanner.nextLine();

        String currDecode;

        while (line.length() != 0) {
            currDecode = line.charAt(0) + "";

            while (!hashMap.containsKey(currDecode))
            {
                line = line.substring(1);
                currDecode += line.charAt(0);
            }

            line = line.substring(1);
            System.out.print(hashMap.get(currDecode));
        }

    }
}
