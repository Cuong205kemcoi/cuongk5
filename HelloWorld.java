public class HelloWorld{
    public static void main(String[] args){
        System.out.println("Hello World");
    }
}
/*Cách chạy mã Java
Lưu đoạn mã trên vào file có tên HelloWorld.java.(nêú muốn thay đổi
tên tệp thì vào Refactor -> Remane File để đổi tên
Mở terminal và chuyển đến thư mục chứa file này.
Biên dịch mã nguồn bằng câu lệnh:
bash
javac HelloWorld.java
Lệnh này sẽ tạo ra file HelloWorld.class.
Chạy chương trình với câu lệnh:
bash
java HelloWorld
Kết quả xuất ra sẽ là:

Hello, world!


-JVM (Java Virtual Machine):
*Là môi trường chạy mã Java. JVM chịu trách nhiệm chạy các bytecode Java
 và thực hiện quản lý bộ nhớ, thu gom rác (garbage collection).
*JVM không biên dịch hay phát triển mã nguồn, chỉ đơn giản là chạy các
chương trình đã được biên dịch thành bytecode.

-JRE (Java Runtime Environment):
*Là môi trường thực thi Java, bao gồm JVM và các thư viện Java cần thiết
 để chạy các chương trình Java.
*JRE không có trình biên dịch để phát triển hoặc biên dịch mã nguồn Java
mà chỉ dùng để chạy các ứng dụng Java đã biên dịch.
*Dành cho người dùng cuối muốn chạy ứng dụng Java.

-JDK (Java Development Kit):
*Là bộ công cụ phát triển Java, bao gồm cả JRE và JVM, cùng với các công cụ như
 trình biên dịch (javac), trình gỡ lỗi và nhiều công cụ khác để phát triển ứng dụng Java.
*JDK cần thiết cho lập trình viên để viết, biên dịch và chạy mã nguồn Java.


-Tóm lại:
*VM: Chạy mã bytecode của Java.
*JRE: Cung cấp môi trường cho JVM và các thư viện để chạy ứng dụng.
*JDK: Bộ công cụ đầy đủ để phát triển ứng dụng Java, bao gồm cả JRE và JVM.
 */
