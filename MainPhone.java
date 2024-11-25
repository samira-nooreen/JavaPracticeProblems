public class MainPhone {
    public static void main(String[] args) {
        Telephone timsPhone;
        timsPhone =  new DeskPhone(123456);
        timsPhone.powerOn();
        timsPhone.callPhone(1213456);
        timsPhone.answer();

        timsPhone = new MobilePhone(23456);
         timsPhone.callPhone(23456);
        timsPhone.answer();
    }
}
