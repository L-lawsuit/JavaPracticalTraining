package com.hp.demo1;

public class hello {

    public static void main(String[] args) {
        Book book1 = new Book("B001", "《西游记》", "吴承恩", 23);
        Book book2 = new Book("B002", "《红楼梦》", "曹雪芹", 26);
        Book book3 = new Book("B003", "《三国演义》", "罗贯中", 21);
        Book book4 = new Book("B004", "《水浒传》", "施耐庵", 16);

        Book[] books = {book1,book2,book3,book4};

        System.out.println("编号\t\t名称\t\t作者\t\t库存");
        for (Book bk : books){
            System.out.println(bk.getId() + "\t\t" + bk.getName() + "\t\t" + bk.getAuthor() + "\t\t" + bk.getNum());

        }

    }
}
