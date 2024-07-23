## 接口
接口是用来定义一个协议或约定，它只声明方法，但不提供方法的具体实现 -> 抽象方法

将接口与具体实现分开

Message sms = new Sms();

        /*
          不管传入的是email还是sms对象。只需要执行Message的方法，不需要关心到底是哪个对象的send方法
          免去了复杂的判断和切换
           面向接口判断
         */
        sendMessage(sms);
        System.out.println("Hello World!");

        sendMessage(() -> {
            System.out.println("this is a sms");
        });
    

    static void sendMessage(Message message) {
        message.send();
    }