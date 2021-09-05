public class homework5 {
    public static class Employee {

        String name;
        String position;
        String email;
        String phone_number;
        int salary;
        int age;

        public Employee(String name, String position, String email, String phone_number, int salary, int age) {
            this.name = name;
            this.position = position;
            this.email = email;
            this.phone_number = phone_number;
            this.salary = salary;
            this.age = age;
        }

        @Override
        public String toString(){
            return String.format("Имя: %s \tДолжность: %s \nEmail: %s \t Номер телефона: %s \n Зарплата: %d \t Возраст: %d \n",
                    name, position, email, phone_number, salary, age);}

        public void print(){
            System.out.println(this);
        }


        public static void main(String[] args)  {

            Employee[] persArray = new Employee[5];
            persArray[0] = new Employee("Владимир Владимирович", "GrandMaster", "vv@kreml',ru", "+1111111111", 250000, 50);
            persArray[1] = new Employee("Сергей Кужугетович", "Главный по ЧП", "sk@kreml,ru", "+123321123321", 127000, 42);
            persArray[2] = new Employee("Татьяна Алексеевна", "Главный врач", "ta@kreml,ru", "+12121212121212", 190000, 21);
            persArray[3] = new Employee("Эльвира Сахипзадовна" , "Главный по денежкам", "es@kreml,ru", "+2121212121211", 120000, 28);
            persArray[4] = new Employee("Андрей Александрович", "Главный по культуре", "aa@kreml,ru", "+1234567890", 138000, 48);

            for (int i=0; i < persArray.length; i++)
                if (persArray[i].age > 40) persArray[i].print();

        }
    }
}
