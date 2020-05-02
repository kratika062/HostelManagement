import javax.swing.*;
import java.io.*;
import javax.swing.table.TableModel;
public class Exporter {
    
FeeRecord h=new FeeRecord();


public void exportTable(JTable table,File file) throws IOException{
    
    TableModel mode=h.table1.getModel();
    FileWriter out=new FileWriter(file);
    BufferedWriter bw=new BufferedWriter(out);
    for(int i=0;i<mode.getColumnCount();i++){
        bw.write(mode.getColumnName(i)+"\t");
    }
    bw.write("\n");
    for(int i=0;i<mode.getColumnCount();i++){
    for(int j=0;j<mode.getColumnCount();j++){
        bw.write(mode.getValueAt(i, j)+"\t");
    }
    bw.write("\n");
}
bw.close();
}
}
