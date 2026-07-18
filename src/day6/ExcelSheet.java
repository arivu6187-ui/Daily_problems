package day6;

public class ExcelSheet {
    static void main() {
        int columnNumber=28;
                StringBuilder result = new StringBuilder();

                while (columnNumber > 0) {
                    columnNumber--;
                    int remainder = columnNumber % 26;
                    char currentChar = (char) ('A' + remainder);
                    result.append(currentChar);
                    columnNumber /= 26;
                }
                System.out.println(result.reverse().toString());
            }
        }