package baitaplon;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;
public class DsBenhNhanNgoaiTru {
    ArrayList<BenhNhanNgoaiTru> DSBNNgoaiTru=new ArrayList<BenhNhanNgoaiTru>();

    public void NhapDSBNNGoaiTru(){
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Nhap so benh nhan ngoai tru: ");
        n = scanner.nextInt();
        BenhNhanNgoaiTru BenhNhan;
        for (int i=0; i<n; i++)
        {
            System.out.println("Nhap thong tin benh nhan ngoai tru thu: " + (i + 1));
            BenhNhan=new BenhNhanNgoaiTru();
            BenhNhan.nhapThongTin();
            DSBNNgoaiTru.add(BenhNhan);
            System.out.println("");
        }
    }
    public void hienDsBNNGoaiTru(){
        for (BenhNhanNgoaiTru benhNhanNgoaiTru : DSBNNgoaiTru) {
            benhNhanNgoaiTru.hienThongTin();
            System.out.println("");
        }
    }
    public void ghiFileDS() throws FileNotFoundException, IOException {
        File fname = new File("NgoaiTru.txt");

        FileOutputStream fout = new FileOutputStream(fname);
        ObjectOutputStream objout = new ObjectOutputStream(fout);

        objout.writeObject(DSBNNgoaiTru);
        
        objout.close();
        fout.close();
    }

    public void docFileDS() throws FileNotFoundException, IOException, ClassNotFoundException {
       
        File fname = new File("NgoaiTru.txt");

        FileInputStream fin = new FileInputStream(fname);
        ObjectInputStream objin = new ObjectInputStream(fin);

        DSBNNgoaiTru = (ArrayList)objin.readObject();

        objin.close();
        fin.close();
        for (BenhNhanNgoaiTru benhNhanNgoaiTru : DSBNNgoaiTru) {
            benhNhanNgoaiTru.hienThongTin();
            System.out.println("");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap Ten Bac Si muon tim DSBN la: ");
        String tenbacsimuontim = scanner.nextLine();
        BenhNhanNgoaiTru BenhNhan= new BenhNhanNgoaiTru();
        for (int i = 0; i < DSBNNgoaiTru.size(); i++) {
            if(BenhNhan instanceof BenhNhanNgoaiTru)
            {
                if(DSBNNgoaiTru.get(i).getBacSiDieuTri().equalsIgnoreCase(tenbacsimuontim)==true){
                    System.out.println("Danh Sach Benh Nhan Cua Bac Si Can Tim la");
                             BenhNhan.hienThongTin();
                }
            }
        }
   
    }
    
}
