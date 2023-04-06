public class Main {
    public static void leapYear(int years) {
        int leapYear = years;
        if (leapYear % 4 == 0 && leapYear % 100 != 0 || leapYear % 400 == 0) {
            System.out.println(leapYear + " Год является високосным");
        } else {
            System.out.println(leapYear + " Год не является високосным");
        }
    }
        public static void phoneModel(int phone,int phoneAge){

            int comandPhone =phone ;
            int clientDeviceYear = phoneAge;
            if (comandPhone == 0) {
                if (clientDeviceYear > 2015) {
                    System.out.println("Установите версию для IOS по ссылке");
                } else {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");

                }

            }if (comandPhone == 1){
                if (clientDeviceYear >2015){
                    System.out.println("Установите версию для Android по ссылке");
                }else {
                    System.out.println("Установите облегченную версию Android по ссылке");
                }
            }
        }

    public static void daysDelivery(int distance) {
        int deliveryDistance = distance;
        int dayDelivery = 1;
               if (deliveryDistance > 20) {
                   dayDelivery++;
               }if (deliveryDistance > 60) {
                   dayDelivery++;

               }
                System.out.println("Достака займет " + dayDelivery + " день");





    }

    public static void main(String[] args) {
        System.out.println("task1");
        int year = 2020;
        leapYear(year);

        System.out.println("task2");

        int commandPhone = 1;
        int currentYear = 2016;
        phoneModel(commandPhone,currentYear);
      /*  У


        Напишите метод, куда подаются два параметра: тип операционной системы (0 — iOS, 1 — Android ) и год выпуска устройства.

        Если устройство старше текущего года, предложите ему установить облегченную версию.

        Текущий год можно получить таким способом:

        int currentYear = LocalDate.now().getYear();

        Или самим задать значение вручную — ввести в переменную числовое значение.

                В результате программа должна выводить в консоль сообщение, какую версию приложения (обычную или облегченную) и
                для какой ОС (Android или iOS) установить пользователю.
       */
        System.out.println("task3");
/*Правила доставки такие:

Доставка в пределах 20 км занимает сутки.
Доставка в пределах от 20 км до 60 км добавляет еще один день доставки.
Доставка в пределах от 60 км до 100 км добавляет еще одни сутки.
Свыше 100 км доставки нет.
То есть с каждым следующим интервалом доставки срок увеличивается на 1 день.
                программу, которая выдает сообщение в консоль: "Потребуется дней: " + срок доставки.
                Объявите целочисленную переменную deliveryDistance = 95, которая содержит дистанцию до клиента.
        Ваша задача — дНапишитеоработать код, а именно написать метод, который на вход принимает дистанцию и возвращает
        итоговое количество дней доставки.*/
            int distanceDel = 10;
            daysDelivery(distanceDel);






    }
}








