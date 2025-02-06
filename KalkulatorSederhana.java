
package SimpleFramekalkulator;

//import swing: swing paket untuk GUI
import javax.swing.*;
//import AWT atau abstract window toolkit yang berisi class untuk
//membuat komponen-komponen grafis dasar seperti warna, font dan juga event handling
import java.awt.*;
//digunakan untuk berbagai jenis event seperti klik tombol
import java.awt.event.ActionEvent;
//mengimpor interface yang digunakan untuk menangani aksi-aksi yang dipicu oleh komponen GUI
import java.awt.event.ActionListener;

//mendeklarasikan sebuah public class KalkulatorSederhana yang mewarisi semua sifat dari metode kelas JFrame
//implements di sini menunjukkan bahwa class ini mengimplemetnasikan interface dari ActionListener
public class KalkulatorSederhana extends JFrame implements ActionListener {
    //variabel private dan JTextField merupakan komponen dari Swing yang berfungsi untuk menampilkan dan mengedit teks 
    private JTextField textField;
    //di sini didekleresakikan array dari object JButton yang mengalokasikan ruang ke memori untuk 10 objek JButton
    private JButton[] numberButtons = new JButton[10];
    //di sini disiapkan 8 buah button untuk simbol kalkulator seperti + - / 
    private JButton[] functionButtons = new JButton[8];
    //untuk mendeklarasikan variabel empat operasi matematika dasar
    private JButton addButton, subButton, mulButton, divButton;
    //untuk mendekalarsikan varibael desimal, equation, delete dan clear button
    private JButton decButton, equButton, delButton, clrButton;
    //untuk menampung komponen lainnya
    private JPanel panel;

    //pendeklarasian nomor 
    private double num1 = 0, num2 = 0, result = 0;
    //untuk menyimpan operator + - / *
    private char operator;

   
    public KalkulatorSederhana() {
        // setting Frame: size, title aplikasi
        setTitle("Kalkulator Sederhana");
        //set ukuran aplikasi/frame
        setSize(350, 500);
        //aplikasi akan ditutup bila menekan tombo; exit
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //digunakan untuk mengatur letak container
        setLayout(null);

        // TextField
        textField = new JTextField();
        //menentukan ukuran dari posisi x sudut kiri komponen y atas komponen width dan height   
        textField.setBounds(20, 20, 290, 50);
        //field tidak bisa diedit oleh user
        textField.setEditable(false);
        //teks yang akan muncul rata kanan
        textField.setHorizontalAlignment(JTextField.RIGHT);
        add(textField);

        // Menambahkan button untuk operator +
        addButton = new JButton("+");
        //membuat button simbol kurang
        subButton = new JButton("-");
        //membuat button simbol kali
        mulButton = new JButton("*");
        //membuat botton simbol bagi
        divButton = new JButton("/");
        //membuat button simbol untuk bilangan desimal
        decButton = new JButton(".");
        //membuat button untuk hasil 
        equButton = new JButton("=");
        //membuat button delete untuk menghapus satu karakter
        delButton = new JButton("Del");
        //membuat button untuk menghapus keseluruhan
        clrButton = new JButton("C");
        
        //mengisi fungsi button 0 dengan elemen +  
        functionButtons[0] = addButton;
        //mengisi fungsi button 1 dengan elemen -
        functionButtons[1] = subButton;
        //menigisi fungsi button 2 dengan elemen *
        functionButtons[2] = mulButton;
        //mengisi fungsi button 3 dengan elemen /
        functionButtons[3] = divButton;
        //mengisi fungsi button 4 dengan elemen .
        functionButtons[4] = decButton;
        //mengisi fungsi button 5 dengan tombol =
        functionButtons[5] = equButton;
        //mengisi fungsi button 6 dengan elemen del
        functionButtons[6] = delButton;
        //mengisi fungsi button 7 dengan elemen clr
        functionButtons[7] = clrButton;

        for (int i = 0; i < 8; i++) {
            functionButtons[i].addActionListener(this);
            functionButtons[i].setFont(new Font("Arial", Font.BOLD, 18));
        }

        //ini adalah sebuah perulangan for yang akan berjalan sebanyak 8 kali
        //Variabel i akan digunakan sebagai indeks untuk mengakses elemen-elemen dalam array functionButtons
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            //Di dalam setiap iterasi perulangan, baris ini menambahkan sebuah ActionListener ke tombol pada indeks i dalam array functionButtons. 
            //ActionListener ini akan merespons ketika tombol tersebut ditekan. this di sini merujuk ke objek saat ini (mungkin sebuah kelas yang merepresentasikan kalkulator), 
            //yang berarti ketika tombol ditekan, suatu metode dalam kelas tersebut akan dipanggil.
            numberButtons[i].addActionListener(this);
            //mengatur font dari tombol pada indeks i
            //Font yang digunakan adalah Arial, dengan gaya bold, dan ukuran 18
            numberButtons[i].setFont(new Font("Arial", Font.BOLD, 18));
        }

        // membuat panel untuk tombol baru
        panel = new JPanel();
        //settings ukuran x, y, wiidth, dan height
        panel.setBounds(20, 90, 290, 300);
        //menentukan layout manager, 5 untuk baris dalam grid, 4 kolom dalam grid
        //10 untuk jarak horizontal dan 10 untuk jarak vertikal
        panel.setLayout(new GridLayout(5, 4, 10, 10));

        // Tambahkan tiap tombol ke  dalam panel
        panel.add(numberButtons[1]); //menambahkan number button 1
        panel.add(numberButtons[2]); //menambahkan numbber button 2
        panel.add(numberButtons[3]); //menambahkan numbber button 3
        panel.add(addButton); //menambahkan numbber button +
        panel.add(numberButtons[4]); //menambahkan numbber button 4
        panel.add(numberButtons[5]); //menambahkan numbber button 5
        panel.add(numberButtons[6]); //menambahkan numbber button 6
        panel.add(subButton); //menambahkan numbber button -
        panel.add(numberButtons[7]); //menambahkan numbber button 7
        panel.add(numberButtons[8]); //menambahkan numbber button 8
        panel.add(numberButtons[9]); //menambahkan numbber button 9
        panel.add(mulButton); //menambahkan numbber button *
        panel.add(decButton); //menambahkan numbber button .
        panel.add(numberButtons[0]); //menambahkan numbber button 0
        panel.add(equButton); //menambahkan numbber button =
        panel.add(divButton); //menambahkan numbber button /
        panel.add(delButton);//menambahkan numbber button del
        panel.add(clrButton); //menambahkan numbber button clr

        add(panel);

        // menampilkan Frame
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Mendapatkan teks yang saat ini ditampilkan pada textField
        String currentText = textField.getText();
         // Loop untuk memeriksa apakah tombol angka yang ditekan
        for (int i = 0; i < 10; i++) {
            // Memeriksa apakah tombol yang ditekan adalah tombol angka ke-i
            if (e.getSource() == numberButtons[i]) {
                // Jika iya, tambahkan angka ke teks yang sudah ada
                textField.setText(currentText + i);
            }
        }
        // Memeriksa apakah tombol desimal yang ditekan
        if (e.getSource() == decButton) {
            // Tambahkan titik desimal jika belum ada
            if (!currentText.contains(".")) {
                textField.setText(currentText + ".");
            }
        }
        
        if (e.getSource() == addButton || e.getSource() == subButton ||
            e.getSource() == mulButton || e.getSource() == divButton) {
            num1 = Double.parseDouble(currentText);
            operator = e.getActionCommand().charAt(0);
            textField.setText(currentText + " " + operator + " ");
        }
        // Memeriksa apakah tombol operator (+, -, *, /) yang ditekan
        if (e.getSource() == equButton) {
            try {
                 // Memisahkan string input menjadi array berdasarkan spasi
                String[] parts = currentText.split(" ");
                if (parts.length < 3) return; // Jika format input tidak valid, keluar dari metode
                // Mengambil angka pertama, operator, dan angka kedua dari array
                num1 = Double.parseDouble(parts[0]);
                operator = parts[1].charAt(0);
                num2 = Double.parseDouble(parts[2]);
                
                // Melakukan perhitungan berdasarkan operator
                switch (operator) {
                    case '+':
                        result = num1 + num2;
                        break;
                    case '-':
                        result = num1 - num2;
                        break;
                    case '*':
                        result = num1 * num2;
                        break;
                    case '/':
                        result = num1 / num2;
                        break;
                }
    // Menampilkan hasil perhitungan pada textField
                textField.setText(String.valueOf(result));
            } catch (Exception ex) {
                 // Menampilkan pesan kesalahan jika terjadi error
                textField.setText("Error");
            }
        }
     // Memeriksa apakah tombol clear (C) yang ditekan
        if (e.getSource() == clrButton) {
               // Menghapus teks pada textField dan mereset nilai-nilai
            textField.setText("");
            num1 = num2 = result = 0;
        }
         // Memeriksa apakah tombol hapus (Del) yang ditekan
        if (e.getSource() == delButton) {
            // Menghapus karakter terakhir dari teks pada textField
            if (!currentText.isEmpty()) {
                textField.setText(currentText.substring(0, currentText.length() - 1));
            }
        }
        
    }
    //class main
    public static void main(String[] args) {
        new KalkulatorSederhana();
    }
}




