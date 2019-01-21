# Soal praktek

1. Buatlah project dengan springboot untuk membuat aplikasi dengan tema e-commerce (Toko online)
2. Ketentuan minimal system yang harus di handle
    - Master data toko
    - Master data produk
    - Transaksi Penjualan (Flow transaksi bebas)
    - Master pelanggan

# Soal teori

1. Apa fungsi Hibernate ORM dan jelaskan mengapa?
Jawab: fungsi dari hibernate untuk memetakan objek-objek yang telah dibuat kedalam database. 
Alasan dipetakannya objek-objek tersebut, agar pada saat proses implementasi nantinya tidak perlu menggunakan query SQL karena sudah dipetakan (mapping). 

2. Jelaskan menurut pendapat anda dari beberapa fungsi annotation di hibernate seperti berikut:
    - ```@Entity```
    Jawab: anotasi dari @Entity berguna untuk menandai objek apapun yang nantinya ingin dikenali oleh hibernate sebagai tabel, dan hibernate akan membuat tabel dari objek tersebut ke dalam database.
    
    - ```@Table```
    Jawab: anotasi dari @Table digunakan untuk menamakan tabel yang akan dibuat oleh hibernate ke dalam database.
    
    - ```@Column```
    Jawab: anotasi dari @Column digunakan untuk menamakan kolom (field) pada tabel yang akan dibuat oleh hibernate ke dalam database.
    
    - ```@OneToOne```
    Jawab: anotasi dari @OneToOne digunakan untuk menggabungkan dua tabel yang memiliki relasi satu-ke-satu, yang mana anotasi @OneToOne dituliskan pada kolom yang sebagai foreign key. Relasi satu-ke-satu yaitu ketika satu baris (record) dalam sebuah tabel hanya dapat dihubungkan dengan satu baris di tabel lain dan sebaliknya.
    
    - ```@ManyToOne```
    Jawab: anotasi dari @ManyToOne digunakan untuk menggabungkan dua tabel yang memiliki relasi banyak-ke-satu, yang mana anotasi @ManyToOne dituliskan pada kolom yang sebagai foreign key. Relasi banyak-ke-satu yaitu ketika beberapa baris (record) dalam sebuah tabel dapat dihubungkan dengan satu baris di tabel lain.
    
    - ```@OneToMany```
    Jawab: anotasi dari @OneToMany digunakan untuk menggabungkan dua tabel yang memiliki relasi satu-ke-banyak, yang mana anotasi @OneToMany dituliskan pada kolom yang sebagai foreign key. Relasi satu-ke-banyak yaitu ketika satu baris (record) dalam sebuah tabel dapat dihubungkan dengan beberapa baris di tabel lain.
    
    - ```@JoinColumn```
    Jawab: anotasi dari @JoinColumn yaitu untuk memetakan kolom tujuan (primary key) yang akan digabungkan dengan kolom asal (foreign key)
    
    - ```@JoinTable```
    Jawab: notasi dari @JoinTable yaitu untuk melakukan penggabungan dua tabel.
    
    - ```@GeneratedValue```
    Jawab: notasi dari @GeneratedValue yaitu untuk menghasilkan nilai (value) dengan generator atau cara tertentu.
    
3. Jelaskan menurut pendapat anda mengenai Dependency injection di springframework?
Jawab: Menurut saya, dependency injection pada spring framework yaitu untuk membantu suatu kelas yang tidak saling terikat (independent)  dengan kelas lainnya dengan cara memberikan/menginjeksikan depedensi antar kelas.

4. Jelaskan menurut pendapat anda mengenai container / context di spring framework?
Jawab: menurut saya, container/context itu sebagai wadah yang digunakan untuk membuat objek yang ditandai dengan anotasi @Bean, menghubungkan objek dengan dengan anotasi @autowired, mengkonfigurasi serta mengatur mulai dari dibentuk hingga dimusnahkan.

5. Jelaskan menurut pendapat anda fungsi dari beberapa fitur annotation di spring frameork seperti berikut:
    - ```@ComponentScan```
    Jawab: anotasi @ComponentScan digunakan untuk memberitahu Springm, package apa saja yang kelas-kelasnya ditandai (annotated) agar Spring dapat mengenali dan digunakan oleh Spring.
    
    - ```@Autowired```
    Jawab: anotasi @Autowired menurut saya digunakan untuk mendapatkan instansiasi (instance) dari suatu kelas yang terdapat anotasi @Bean untuk digunakan pada method ataupun variabel yang ingin menggunakannya.
    
    - ```@Bean```
    Jawab: anotasi @Bean menurut saya digunakan untuk memberitahu Spring untuk mendaftarkan kelas yang dapat diinstansasi melalui anotas @AutoWired.
    
    - ```@Component```
    Jawab: anotasi @Component digunakan untuk menunjukkan/menandakan bahwa kelas tersebut merupakan komponen dari Spring.
    
    - ```@Repository```
    Jawab: anotasi @Repository digunakan untuk menunjukkan/menandakan bahwa kelas tersebut didefinisikan sebagai sebuah tempat data repository.
    
    - ```@Service```
    Jawab: anotasi @Service digunakan untuk menunjukkan/menandakan bahwa kelas tersebut meyimpan logika bisnis/business logic.
    
    - ```@Controller```
    Jawab: anotasi @Service digunakan untuk menunjukkan/menandakan bahwa kelas tersebut berfungsi/berperan sebagai Controller.
    
    - ```@RestController```
    Jawab: anotasi @ResController merupakan versi khusus dari Controller. anotasi ini menyertakaan anotasi @Controller dan @ResponseBody sehingga dapat menyederhanakan implementasi dari Controller
    
    - ```@RequestMapping``
    Jawab: anotasi @RequestMapping digunakan untuk memetakan permintaan web (web request) ke method-method yang ada di dalam kelas.
    
    - ```@GetMapping```
    
    Jawab: anotasi @GetMapping digunakan untuk memetakan permintaan web (web requests) pada request method GET pada method yang dipilih.
        
    - ```@PostMapping```
    Jawab: anotasi @PostMapping digunakan untuk memetakan permintaan web (web requests) pada request method POST pada method yang dipilih.
    
    - ```@PutMapping```
    Jawab: anotasi @PutMapping digunakan untuk memetakan permintaan web (web requests) pada request method PUT pada method yang dipilih.

    - ```@DeleteMapping```
    Jawab: anotasi @DeleteMapping digunakan untuk memetakan permintaan web (web requests) pada request method DELETE pada method yang dipilih.


## Cara mengerjakan

- Fork repository ini, kemudian setelah di fork, clone ke local komputer anda.
- Setelah selesai silahkan di push ke repository masing-masing.
- Selamat mengerjakan :) & good luck
