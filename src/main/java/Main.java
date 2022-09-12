public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        FormDate birthday = new FormDate();
        birthday.day = 13;
        birthday.month = 6;
        birthday.year = 1999;
        post.name = "Иван";
        post.passport = "4444 № 44444444";
        post.patronymic = "Иванович";
        post.surname = "Иванов";
        post.subscription = true;

        // заполните другие поля
    }
}
