import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class App {
    public static void main(String[] args) throws Exception {
        String[] nama = new String [100];
        String[] prodi = new String [100];
        int count = 0;

        while(true){
            nama[count] = JOptionPane.showInputDialog("Masukkan Nama = ");
            prodi[count] = JOptionPane.showInputDialog("Masukkan Program Studi = ");

            count++;

            int pilih = JOptionPane.showConfirmDialog(null, "Apakah masih ingin menambahkan Data??", "Konfirmasi", JOptionPane.YES_NO_OPTION);

            if (pilih == JOptionPane.NO_OPTION){
                break;
            }

            
        }

        /*StringBuilder hasil = new StringBuilder("Daftar Data Mahasiswa: \n");
        for (int i = 0; i < count; i++){
            hasil.append((i+1) + ". Nama: " +nama[i] + " | Prodi: " +prodi[i] +"\n");
        }
        JOptionPane.showMessageDialog(null, hasil.toString());*/

        String[] kolom = {"No", "Nama", "Prodi"};

        DefaultTableModel model = new DefaultTableModel(kolom, 0);

        for( int i=0; i < count; i++) {
            Object[] row = {i + 1, nama[i], prodi[i]};
            model.addRow(row);
        }

        JTable tabel = new JTable(model);

        JScrollPane scrollPane = new JScrollPane(tabel);

        JOptionPane.showMessageDialog(null, scrollPane, "Daftar Data Mahasiswa", JOptionPane.INFORMATION_MESSAGE);


    }
}
