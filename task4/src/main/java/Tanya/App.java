package Tanya;

import Tanya.servise.ServiseUserCommunication;

public class App {

//    Создайте программу, которая будет получать число и печатать его в следующем формате
//    (формы цифр можно придумать свои, главное, чтобы они читались на экране):
//    (*) Дополнительно: сделайте так, чтобы наибольшая цифра состояла не из ‘*’,
//    а из соответствующих маленьких (обычных) цифр.

    public static void main(String[] args) {

        ServiseUserCommunication serviseUserCommunication = new ServiseUserCommunication();
        serviseUserCommunication.processingUserCommunication();

    }
}
