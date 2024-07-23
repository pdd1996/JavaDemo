        // 泛型
        IntegerPrinter printer = new IntegerPrinter(10);
        printer.print();

        StringPrinter printer1 = new StringPrinter("Hello");
        printer1.print();

        Printer<Integer, String> printer2 = new Printer<>(123, "world");
        printer2.print();

        // 集合框架
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        System.out.println(list);

//        Printer<String> printer3 = new Printer<>("Hello World");
//        printer3.print();
// 反射

        print("Hello World", 123);

        List<Integer> list1 = new ArrayList<>();
        list1.add(123);
        list1.add(456);
        System.out.println(list1);
    }

    private static <T, K> void print(T content, K content2) {
        System.out.println(content);
        System.out.println(content2);
    }

    private static void print(List<Integer> content) {
        System.out.println(content);
    }