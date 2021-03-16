import javax.swing.*;

public class List extends JPanel {
    public static DefaultListModel data;
    JList lst;

    List(){
        data = new DefaultListModel();

        lst = new JList(data);
        lst.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        lst.setLayoutOrientation(JList.VERTICAL);
        lst.setSelectedIndex(2);
        lst.setVisibleRowCount(6);

        JScrollPane scrLst = new JScrollPane(lst);
        this.add(scrLst);

    }
    private String openFile(String name){
        String content="";

        return content;
    }

}
