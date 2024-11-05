import java.util.ArrayList;
import java.util.Collections;
void display(int n) {
    String[] segments = {
        " -- \n|  |\n|  |\n    \n|  |\n|  |\n -- ", // 0
        "    \n   |\n   |\n    \n   |\n   |\n    ", // 1
        " -- \n   |\n   |\n -- \n|   \n|   \n -- ", // 2
        " -- \n   |\n   |\n -- \n   |\n   |\n -- ", // 3
        "    \n|  |\n|  |\n -- \n   |\n   |\n    ", // 4
        " -- \n|   \n|   \n -- \n   |\n   |\n -- ", // 5
        " -- \n|   \n|   \n -- \n|  |\n|  |\n -- ", // 6
        " -- \n   |\n   |\n    \n   |\n   |\n    ", // 7
        " -- \n|  |\n|  |\n -- \n|  |\n|  |\n -- ", // 8
        " -- \n|  |\n|  |\n -- \n   |\n   |\n -- ", // 9
    };
    ArrayList<String> output = new ArrayList<>();
    do {
        int digit = n % 10; 
        output.add(segments[digit]);
        n /= 10; 
    } while (n > 0);
    Collections.reverse(output);
    StringBuilder[] finalOutput = new StringBuilder[7]; 
    for (int i = 0; i < 7; i++) {
        finalOutput[i] = new StringBuilder(); 
    }

    for (String segment : output) {
        String[] lines = segment.split("\n"); 
        for (int i = 0; i < 7; i++) {
            finalOutput[i].append(lines[i]).append("  "); 
        }
    }
    for (StringBuilder line : finalOutput) {
        System.out.println(line.toString()); 
    }
}
