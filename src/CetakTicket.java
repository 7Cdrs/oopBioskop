import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * CetakTicket - Form untuk menampilkan informasi tiket yang telah dipesan.
 */
public class CetakTicket extends javax.swing.JFrame {

    private JLabel labelNama;
    private JLabel labelFilm;
    private JLabel labelJenisTiket;
    private JLabel labelJumlahTiket;
    private JLabel labelTotalHarga;
    private JLabel labelRuangan;
    private JLabel labelSisaKapasitas;
    private JButton buttonTutup;

    public CetakTicket(String nama, String film, String jenisTiket, int jumlahTiket, int totalHarga, String ruangan, int sisaKapasitas) {
        initComponents(nama, film, jenisTiket, jumlahTiket, totalHarga, ruangan, sisaKapasitas);
    }

    // Inisialisasi komponen form
    private void initComponents(String nama, String film, String jenisTiket, int jumlahTiket, int totalHarga, String ruangan, int sisaKapasitas) {

        // Membuat label dan button
        labelNama = new JLabel("Nama: " + nama);
        labelFilm = new JLabel("Film: " + film);
        labelJenisTiket = new JLabel("Jenis Tiket: " + jenisTiket);
        labelJumlahTiket = new JLabel("Jumlah Tiket: " + jumlahTiket);
        labelTotalHarga = new JLabel("Total Harga: Rp " + totalHarga);
        labelRuangan = new JLabel("Ruangan: " + ruangan);
        labelSisaKapasitas = new JLabel("Sisa Kapasitas: " + sisaKapasitas);
        buttonTutup = new JButton("Tutup");

        // ActionListener untuk tombol tutup
        buttonTutup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTutupActionPerformed(evt);
            }
        });

        // Menambahkan komponen ke panel
        JPanel panel = new JPanel();
        panel.setLayout(new java.awt.GridLayout(8, 1));
        panel.add(labelNama);
        panel.add(labelFilm);
        panel.add(labelJenisTiket);
        panel.add(labelJumlahTiket);
        panel.add(labelTotalHarga);
        panel.add(labelRuangan);
        panel.add(labelSisaKapasitas);
        panel.add(buttonTutup);

        // Menambahkan panel ke frame
        this.add(panel);
        this.setTitle("Cetak Tiket");
        this.setSize(300, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null); // Posisikan ke tengah layar
    }

    // Tombol tutup untuk menutup form CetakTicket
    private void buttonTutupActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose(); // Tutup form
    }

    // Main method untuk test form secara mandiri
    public static void main(String[] args) {
        CetakTicket cetakTicket = new CetakTicket("Anas", "EndGame", "VIP", 2, 200000, "C-102", 48);
        cetakTicket.setVisible(true);
    }
}
