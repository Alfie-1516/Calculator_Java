import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Calculator_Window extends JFrame {
    private int win_width = 600;
    private int win_height = 400;
    private int gridrows = 5;
    private int gridcols = 5;
    private double total_1 = 0.0;
    private double total_2 = 0.0;
    private char math_operator;
    private JButton j_btnOne;
    private JButton j_btnTwo;
    private JButton j_btnThree;
    private JButton j_btnFour;
    private JButton j_btnFive;
    private JButton j_btnSix;
    private JButton j_btnSeven;
    private JButton j_btnEight;
    private JButton j_btnNine;
    private JButton j_btnZero;
    private JButton j_btnClear;
    private JButton btnDivide;
    private JButton btnEquals;
    private JButton btnMultiply;
    private JButton btnPoint;
    private JButton btnPlus;
    private JButton btnAllClear;
    private JButton btnMinus;
    private JButton btnOpenPara;
    private JButton btnClosePara;
    private TextField textDisplay;
    public Calculator_Window(){
        this.setTitle("Scientific Calculator");
        this.setSize(win_width, win_height);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        north_pan();
        center_pan();
        east_pan();
        this.setResizable(false);
        Action_listeners();
        this.setVisible(true);
    }

    public void north_pan(){
        JPanel northPan = new JPanel();
        textDisplay = new TextField();
        textDisplay.setColumns(40);
        northPan.add(textDisplay);
        this.add(northPan, BorderLayout.NORTH);
    }


    public void center_pan(){
        JPanel center_sec = new JPanel(new GridLayout(4,3));
        Border back_line = BorderFactory.createBevelBorder(1, Color.BLACK, Color.BLACK);

        Font big_font = new Font("Arial",1,40);

        JPanel button_one = new JPanel();
        j_btnOne = new JButton("1");
        button_one.add(j_btnOne);
        j_btnOne.setFont(big_font);
        j_btnOne.setPreferredSize(new Dimension(130,70));


        JPanel button_two = new JPanel();
        j_btnTwo = new JButton("2");
        button_two.add(j_btnTwo);
        j_btnTwo.setFont(big_font);
        j_btnTwo.setPreferredSize(new Dimension(130,70));

        JPanel button_three = new JPanel();
        j_btnThree = new JButton("3");
        button_three.add(j_btnThree);
        j_btnThree.setFont(big_font);
        j_btnThree.setPreferredSize(new Dimension(130,70));

        JPanel button_four = new JPanel();
        j_btnFour = new JButton("4");
        button_four.add(j_btnFour);
        j_btnFour.setFont(big_font);
        j_btnFour.setPreferredSize(new Dimension(130,70));

        JPanel button_five = new JPanel();
        j_btnFive = new JButton("5");
        button_five.add(j_btnFive);
        j_btnFive.setFont(big_font);
        j_btnFive.setPreferredSize(new Dimension(130,70));

        JPanel button_six = new JPanel();
        j_btnSix = new JButton("6");
        button_six.add(j_btnSix);
        j_btnSix.setFont(big_font);
        j_btnSix.setPreferredSize(new Dimension(130,70));

        JPanel button_seven = new JPanel();
        j_btnSeven = new JButton("7");
        button_seven.add(j_btnSeven);
        j_btnSeven.setFont(big_font);
        j_btnSeven.setPreferredSize(new Dimension(130,70));

        JPanel button_eight = new JPanel();
        j_btnEight = new JButton("8");
        button_eight.add(j_btnEight);
        j_btnEight.setFont(big_font);
        j_btnEight.setPreferredSize(new Dimension(130,70));

        JPanel button_nine = new JPanel();
        j_btnNine = new JButton("9");
        button_nine.add(j_btnNine);
        j_btnNine.setFont(big_font);
        j_btnNine.setPreferredSize(new Dimension(130,70));

        JPanel button_zero = new JPanel();
        j_btnZero = new JButton("0");
        button_zero.add(j_btnZero);
        j_btnZero.setFont(big_font);
        j_btnZero.setPreferredSize(new Dimension(130,70));

        JPanel button_clear = new JPanel();
        j_btnClear = new JButton("<--");
        button_clear.add(j_btnClear);
        j_btnClear.setFont(big_font);
        j_btnClear.setPreferredSize(new Dimension(130,70));

        center_sec.add(button_one);
        center_sec.add(button_two);
        center_sec.add(button_three);
        center_sec.add(button_four);
        center_sec.add(button_five);
        center_sec.add(button_six);
        center_sec.add(button_seven);
        center_sec.add(button_eight);
        center_sec.add(button_nine);
        center_sec.add(button_zero);
        center_sec.add(button_clear);

        center_sec.setBorder(back_line);
        this.add(center_sec, BorderLayout.CENTER);

    }
    public  void east_pan(){
        JPanel eastPan_Sec = new JPanel(new GridLayout(3, 2));

        JPanel jbutton_divide = new JPanel();
        btnDivide = new JButton();
        jbutton_divide.add(btnDivide);
        btnDivide.setText("/");

        JPanel jbutton_equals = new JPanel();
        btnEquals = new JButton();
        jbutton_equals.add(btnEquals);
        btnEquals.setText("=");

        JPanel jbutton_multiply = new JPanel();
        btnMultiply = new JButton();
        jbutton_multiply.add(btnMultiply);
        btnMultiply.setText("*");

        JPanel jbutton_point = new JPanel();
        btnPoint = new JButton();
        jbutton_point.add(btnPoint);
        btnPoint.setText(".");

        JPanel jbutton_plus = new JPanel();
        btnPlus = new JButton();
        jbutton_plus.add(btnPlus);
        btnPlus.setText("+");

        JPanel jbutton_all_clear = new JPanel();
        btnAllClear = new JButton();
        jbutton_all_clear.add(btnAllClear);
        btnAllClear.setText("AC");

        JPanel jbutton_minus = new JPanel();
        btnMinus = new JButton();
        jbutton_minus.add(btnMinus);
        btnMinus.setText("-");

        JPanel jbutton_Open_parathesis = new JPanel();
        btnOpenPara = new JButton();
        jbutton_Open_parathesis.add(btnOpenPara);
        btnOpenPara.setText("(");

        JPanel jbutton_Close_parathesis = new JPanel();
        btnClosePara = new JButton();
        jbutton_Close_parathesis.add(btnClosePara);
        btnClosePara.setText(")");


        eastPan_Sec.add(jbutton_divide);
        eastPan_Sec.add(jbutton_equals);
        eastPan_Sec.add(jbutton_multiply);
        eastPan_Sec.add(jbutton_point);
        eastPan_Sec.add(jbutton_plus);
        eastPan_Sec.add(jbutton_all_clear);
        eastPan_Sec.add(jbutton_minus);
        eastPan_Sec.add(jbutton_Open_parathesis);
        eastPan_Sec.add(jbutton_Close_parathesis);

        this.add(eastPan_Sec, BorderLayout.EAST);
    }
    public void Action_listeners(){
        j_btnOne.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Action_performer(j_btnOne.getText());
            }
        });
        j_btnTwo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Action_performer(j_btnTwo.getText());
            }
        });
        j_btnThree.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Action_performer(j_btnThree.getText());
            }
        });
        j_btnFour.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Action_performer(j_btnFour.getText());
            }
        });
        j_btnFive.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Action_performer(j_btnFive.getText());
            }
        });
        j_btnSix.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Action_performer(j_btnSix.getText());
            }
        });
        j_btnSeven.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Action_performer(j_btnSeven.getText());
            }
        });
        j_btnEight.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Action_performer(j_btnEight.getText());
            }
        });
        j_btnNine.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Action_performer(j_btnNine.getText());
            }
        });
        j_btnZero.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Action_performer(j_btnZero.getText());
            }
        });
        btnPlus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Action_performer(btnPlus.getText());
            }
        });
        btnMinus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Action_performer(btnMinus.getText());
            }
        });
        btnDivide.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Action_performer(btnDivide.getText());
            }
        });
        btnMultiply.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Action_performer(btnMultiply.getText());
            }
        });
        btnAllClear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Action_performer(btnAllClear.getText());
            }
        });
        btnPoint.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Action_performer(btnPoint.getText());
            }
        });
        btnEquals.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Action_performer(btnEquals.getText());
            }
        });
        btnClosePara.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Action_performer(btnClosePara.getText());
            }
        });
        btnOpenPara.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Action_performer(btnOpenPara.getText());
            }
        });
        j_btnClear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Action_performer(j_btnClear.getText());
            }
        });
    }
    public void Action_performer(String b_name){
        String text = textDisplay.getText();
        if(b_name == j_btnOne.getText())
        {
            text += j_btnOne.getText();
            textDisplay.setText(text);
        }
        else if (b_name == j_btnTwo.getText())
        {
            text += j_btnTwo.getText();
            textDisplay.setText(text);
        }
        else if (b_name == j_btnThree.getText())
        {
            text += j_btnThree.getText();
            textDisplay.setText(text);
        }
        else if (b_name == j_btnFour.getText())
        {
            text += j_btnFour.getText();
            textDisplay.setText(text);
        }
        else if (b_name == j_btnFive.getText())
        {
            text += j_btnFive.getText();
            textDisplay.setText(text);
        }
        else if (b_name == j_btnSix.getText())
        {
            text += j_btnSix.getText();
            textDisplay.setText(text);
        }
        else if (b_name == j_btnSeven.getText())
        {
            text += j_btnSeven.getText();
            textDisplay.setText(text);
        }
        else if (b_name == j_btnEight.getText())
        {
            text += j_btnEight.getText();
            textDisplay.setText(text);
        }
        else if (b_name == j_btnNine.getText())
        {
            text += j_btnNine.getText();
            textDisplay.setText(text);
        }
        else if (b_name == j_btnZero.getText())
        {
            text += j_btnZero.getText();
            textDisplay.setText(text);
        }
        else if (b_name == btnDivide.getText())
        {
            text += btnDivide.getText();
            textDisplay.setText(text);
        }
        else if (b_name == btnPlus.getText())
        {
            text += btnPlus.getText();
            textDisplay.setText(text);
        }
        else if (b_name == btnMinus.getText())
        {
            text += btnMinus.getText();
            textDisplay.setText(text);
        }
        else if (b_name == btnMultiply.getText())
        {
            text += btnMultiply.getText();
            textDisplay.setText(text);
        }
        else if (b_name == btnPoint.getText())
        {
            if(textDisplay.getText().equals("")){
                text += "0.";
                textDisplay.setText(text);
            } else if (textDisplay.getText().contains(".")) {
                btnPoint.setEnabled(false);
            }else {
                text += btnPoint.getText();
                textDisplay.setText(text);
            }
            btnPoint.setEnabled(true);
        }
        else if (b_name == btnAllClear.getText())
        {
            text = "";
            textDisplay.setText("");
        }
        else if (b_name == btnEquals.getText()){
            text = String.valueOf(separator(text));
            textDisplay.setText(text);
        } else if (b_name == btnClosePara.getText()) {
            text += btnClosePara.getText();
            textDisplay.setText(text);
        } else if (b_name == btnOpenPara.getText()) {
            text += btnOpenPara.getText();
            textDisplay.setText(text);
        } else if (b_name == j_btnClear.getText()) {
            System.out.println(text.length());
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.deleteCharAt(text.length()-1);
            text = sb.toString();
            textDisplay.setText(text);
        }


    }
    private double separator(String text){
        String number = "";
        ArrayList numbers = new ArrayList();
        ArrayList<Character> signs = new ArrayList();
        double answer = 0;
        for(int dex = 0; dex < text.length(); dex++){
            if(text.charAt(dex) != '+' &&  text.charAt(dex) != '-' && text.charAt(dex) != '*' && text.charAt(dex) != '/' &&
                    text.charAt(dex) != '(' && text.charAt(dex) != ')'){
                number += text.charAt(dex);
            }

            if(text.charAt(dex) == '+' ||  text.charAt(dex) == '-' || text.charAt(dex) == '*' || text.charAt(dex) == '/'
                    || text.charAt(dex) == '(' || text.charAt(dex) == ')'){
                if(number != "")
                    numbers.add(number);
                number = "";
                signs.add(text.charAt(dex));
            }
        }
        if(number != "")
            numbers.add(number);
        answer = calculate(numbers, signs);
        return answer;
    }
    private double calculate(ArrayList num, ArrayList sign){
        double answer = Double.parseDouble((String) num.get(0));

       Character[] bodmas = new Character[]{'(', '/', '*', '-', '+'};
        if(num.size() > 1){

            for(int bodmas_signs =0; bodmas_signs < bodmas.length; bodmas_signs++){
                for (int dex = 0; dex < sign.size(); dex++){
                    if(bodmas[bodmas_signs].equals(sign.get(dex))){
                        if(sign.get(dex).equals('(')){
                            String inner_number = "";
                            int index = dex;
                            sign.remove(dex);
                            while (!sign.get(dex).equals(')')){
                                inner_number += num.get(dex);
                                num.remove(dex);
                                if(!sign.get(index).equals(')')){
                                    inner_number += sign.get(dex);
                                    sign.remove(dex);
                                }
                            }
                            sign.remove(dex);
                            inner_number += num.get(dex);
                            System.out.println(inner_number);
                            answer = separator(inner_number);
                            num.set(dex, Double.toString(answer));
                        }
                        else if(sign.get(dex).equals('/')){
                            answer = Double.parseDouble((String) num.get(dex)) / Double.parseDouble((String) num.get(dex+1));
                            sign.remove(dex);
                            num.remove(dex+1);
                            num.set(dex, Double.toString(answer));
                        }
                        else if(sign.get(dex).equals('+')){
                            answer = Double.parseDouble((String) num.get(dex)) + Double.parseDouble((String) num.get(dex+1));
                            sign.remove(dex);
                            num.remove(dex+1);
                            num.set(dex, Double.toString(answer));
                        }
                        else if(sign.get(dex).equals('-')){
                            answer = Double.parseDouble((String) num.get(dex)) - Double.parseDouble((String) num.get(dex+1));
                            sign.remove(dex);
                            num.remove(dex+1);
                            num.set(dex, Double.toString(answer));
                        }
                        else if(sign.get(dex).equals('*')){
                            answer = Double.parseDouble((String) num.get(dex)) * Double.parseDouble((String) num.get(dex+1));
                            sign.remove(dex);
                            num.remove(dex+1);
                            num.set(dex, Double.toString(answer));
                        }
                        calculate(num, sign);


                        System.out.println(num);
                        answer = Double.parseDouble((String) num.get(0));

                    }
                }
            }
        }
        if(num.size() <= 1){
            answer = Double.parseDouble((String) num.get(0));
        }

       return answer;
    }
    public static void main(String[] args) {
        new Calculator_Window();
    }
}
