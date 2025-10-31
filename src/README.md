#  Sistem Sewa Motor – Java OOP (Tugas 3)

Program ini adalah simulasi sederhana sistem sewa motor yang dibuat dengan bahasa Java.  
Tujuannya adalah untuk mempraktikkan konsep **Object-Oriented Programming (OOP)** seperti abstraksi, interface, inheritance, dan polymorphism.  
Setiap motor memiliki atribut seperti nama, plat nomor, dan harga sewa per hari, serta bisa menampilkan informasi detailnya.

Program terdiri dari beberapa bagian utama:
- `AbstractMotor` → kelas abstrak yang berisi atribut dasar motor dan method abstrak `tampilkanInfo()`.
- `displayMotor` → interface yang berisi kontrak method untuk menampilkan informasi motor.
- `Motor` → kelas turunan yang mengimplementasikan interface dan mengisi logika `tampilkanInfo()`.
- `Main` → kelas utama untuk menjalankan program dan memanggil proses sewa.

Untuk menjalankan program, buka project di IDE seperti IntelliJ atau NetBeans, pastikan semua file berada dalam paket `Tugas3`, lalu jalankan file `Main.java`. Program akan menampilkan informasi motor yang disewa di konsol.

Program ini juga dilengkapi dokumentasi **JavaDoc**.  
Untuk membuat dokumentasinya, jalankan perintah berikut di terminal:
