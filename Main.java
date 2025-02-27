import java.util.Scanner;
class Long1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String newLine = System.getProperty("line.separator");
        System.out.print("1. Count '0' in byte number" + newLine + "2. Count '1' in byte number" + newLine + "Select function: ");
        int fun = scanner.nextInt();
        System.out.print("Print number for count 1/0 in byte number: ");
        long num = scanner.nextLong();
        String bytenum = Long.toBinaryString(num);
        if (fun == 1) {
            String str1 = bytenum.replaceAll("1", "");
            long count1 = str1.length();
            System.out.println("Count '0' in byte number: " + count1);
            }
        if (fun == 2) {
            String str2 = bytenum.replaceAll("0", "");
            long count2 = str2.length();
            System.out.println("Count '1' in byte number: " + count2);
            }
        }
    }

