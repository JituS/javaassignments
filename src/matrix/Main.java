package matrix;
import java.awt.*;
import javax.swing.*;

public class Main extends JFrame {
    private JLabel l = new JLabel("");
    public Matrix fillMtx(String[] matrix){
        Matrix newMtx = new Matrix(matrix.length, matrix[0].split(" ").length);
        for (String s : matrix) {
            String[] row = s.split(" ");
            for (String s1 : row) {
                newMtx.put(Integer.parseInt(s1));
            }
        }
        return newMtx;
    }

    public Matrix operation(String operation, String mtxInput1, String mtxInput2){
        String[] mtx1 = mtxInput1.split("\n");
        String[] mtx2 = mtxInput2.split("\n");
        Matrix matrix1 = fillMtx(mtx1);
        Matrix matrix2 = fillMtx(mtx2);
        try{
            if(operation == "Add") return matrix1.addWith(matrix2);
            if(operation == "Mult") return matrix1.multiplyWith(matrix2);
        }catch (Exception e){
            l.setText("error");
        }
        return null;
    }

    public void start() throws Exception{
        this.setResizable(false);
        this.setTitle("Matrix Manipulation");
        JTextArea mtxInput1=new JTextArea();
        mtxInput1.setBorder(BorderFactory.createBevelBorder(1));
        JTextArea mtxInput2=new JTextArea();
        mtxInput2.setBorder(BorderFactory.createBevelBorder(1));
        JTextArea mtxInput3=new JTextArea();
        mtxInput3.setBorder(BorderFactory.createBevelBorder(1));
        JLabel jLabel1 = new JLabel("Matrix 1:");
        JLabel jLabel2 = new JLabel("Matrix 2:");
        JLabel jLabel3 = new JLabel("Output:");
        JButton addition=new JButton();
        JButton multiplication=new JButton();
        JButton determinant=new JButton();
        addition.setText("Add");
        multiplication.setText("Mult");
        determinant.setText("Determinant");
        mtxInput1.setBounds(50, 40, 140,100);
        mtxInput2.setBounds(200, 40, 140,100);
        mtxInput3.setBounds(350, 40, 140,100);
        jLabel1.setBounds(60, 20, 150, 20);
        jLabel2.setBounds(210, 20, 150, 20);
        jLabel3.setBounds(360, 20, 150, 20);
        addition.setBounds(100, 200, 100, 20);
        multiplication.setBounds(210, 200, 100, 20);
        determinant.setBounds(320, 200, 100, 20);
        add(jLabel1);
        add(mtxInput1);
        add(jLabel2);
        add(mtxInput2);
        add(jLabel3);
        add(mtxInput3);
        add(addition);
        add(multiplication);
        add(determinant);
        add(l);
        addition.addActionListener(e -> mtxInput3.setText(operation("Add", mtxInput1.getText(), mtxInput2.getText()).toString()));
        multiplication.addActionListener(e -> mtxInput3.setText(operation("Mult", mtxInput1.getText(), mtxInput2.getText()).toString()));
        determinant.addActionListener(e -> mtxInput3.setText(fillMtx(mtxInput1.getText().split("\n")).calculateDiterminent()+""));
        setSize(600,300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
    public static void main(String args[]) throws Exception{
        new Main().start();
    }
}

