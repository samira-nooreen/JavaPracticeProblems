public class NumberToWord {
    public static void main(String[] args) {
        numberToWords(123);
    }

    public static int getDigitCount(int number) {
        if (number == 0) {
            return 1;
        }
        if (number < 0) {
            return -1;
        }
        int count = 0;
        while (number > 0) {
            number /= 10;
            count++;
        }
        return count;
    }

    public static int reverse(int number) {
        int remainder, reverseNumber = 0;
        boolean isNegative = false;
        if (number < 0) {
            number = Math.abs(number);
            isNegative = true;
        }
        while (number > 0) {
            remainder = number % 10;
            reverseNumber = reverseNumber * 10 + remainder;
            number /= 10;
        }
        if (isNegative) {
            return -reverseNumber;
        }
        return reverseNumber;
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid value");
        } else if (number == 0) {
            System.out.println("Zero");
        } else {
            int reverseNumber = reverse(number);
            int numberDigitCount = getDigitCount(number);
            int reverseNumberDigitCount = getDigitCount(reverseNumber);
            StringBuilder s = new StringBuilder();
            int remainder;
            while (reverseNumber > 0) {
                remainder = reverseNumber % 10;
                switch (remainder) {
                    case 0:
                        s.append("Zero ");
                        break;
                    case 1:
                        s.append("One ");
                        break;
                    case 2:
                        s.append("Two ");
                        break;
                    case 3:
                        s.append("Three ");
                        break;
                    case 4:
                        s.append("Four ");
                        break;
                    case 5:
                        s.append("Five ");
                        break;
                    case 6:
                        s.append("Six ");
                        break;
                    case 7:
                        s.append("Seven ");
                        break;
                    case 8:
                        s.append("Eight ");
                        break;
                    case 9:
                        s.append("Nine ");
                        break;
                    default:
                        break;
                }
                reverseNumber /= 10;
            }
            while (numberDigitCount > reverseNumberDigitCount) {
                s.append("Zero ");
                reverseNumberDigitCount++;
            }
            System.out.println(s);
        }
    }
}
