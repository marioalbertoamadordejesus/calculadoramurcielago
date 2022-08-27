import javax.swing.*; // en esta importamos la paqueteria que nos permitira la interfas grafica de la caluladora
import java.awt.event.*; // paqueteria de eventos

public class calcuadora extends JFrame implements ActionListener{ //heredamos el metodo en la paqueteria grafica

    JButton botonSuma, botonResta, botonMult, botonDiv,
            igual, limpiar, nueve, ocho, siete, seis, cinco, cuatro, tres,
            dos, uno,punto, botoncero;

    private JTextField textfield;// con este operador me va a permitir precinar un boton al ingresar
    public double num1, num2, resultado;
    public String oper = "nula", cadenaNum = "";
    private boolean activado = false;

    public calcuadora() {
        setTitle("MI Calculadora Murcielago DE malberto"); // le pongo titulo a mi ventana
        setSize(500, 500); // le doy un tamaño a la ventana
        setLayout(null); //posicionamiento de mi ventana centar
        setLocationRelativeTo(null); // establecemos la venta
        setVisible(true); // hago visible mi ventana
        setResizable(false); //no permite moverla la ventan
        setDefaultCloseOperation(EXIT_ON_CLOSE); // no agoto memoria

        // acontinuacom vamos agreando la pocison de la venya

        textfield = new JTextField();
        textfield.setBounds(15, 10, 245, 35);
        add(textfield);

        igual = new JButton("RESULT");
        igual.setBounds(10, 40, 100, 25);
        add(igual);
        igual.addActionListener(this);

        botonDiv = new JButton("/");
        botonDiv.setBounds(278, 70, 80, 80);
        add(botonDiv);
        botonDiv.addActionListener(this);

        botonMult = new JButton("*");
        botonMult.setBounds(278, 155, 80, 80);
        add(botonMult);
        botonMult.addActionListener(this);

        botonResta = new JButton("-");
        botonResta.setBounds(278, 240, 80, 80);
        add(botonResta);
        botonResta.addActionListener(this);

        botonSuma = new JButton("+");
        botonSuma.setBounds(278, 325, 80, 80);
        add(botonSuma);
        botonSuma.addActionListener(this);

        nueve = new JButton("9");
        nueve.setBounds(191, 70, 80, 80);
        add(nueve);
        nueve.addActionListener(this);

        seis = new JButton("6");
        seis.setBounds(191, 155, 80, 80);
        add(seis);
        seis.addActionListener(this);

        tres = new JButton("3");
        tres.setBounds(191, 240, 80, 80);
        add(tres);
        tres.addActionListener(this);

        ocho = new JButton("8");
        ocho.setBounds(103, 70, 80, 80);
        add(ocho);
        ocho.addActionListener(this);;

        cinco = new JButton("5");
        cinco.setBounds(103, 155, 80, 80);
        add(cinco);
        cinco.addActionListener(this);

        dos = new JButton("2");
        dos.setBounds(103, 240, 80, 80);
        add(dos);
        dos.addActionListener(this);

        botoncero = new JButton("0");
        botoncero.setBounds(103, 325, 80, 80);
        add(botoncero);
        botoncero.addActionListener(this);

        punto= new JButton(".");
        punto.setBounds(191, 325, 80, 80);
        add(punto);
        punto.addActionListener(this);

        siete = new JButton("7");
        siete.setBounds(15, 70, 80, 80);
        add(siete);
        siete.addActionListener(this);//
        cuatro = new JButton("4");
        cuatro.setBounds(15, 155, 80, 80);
        add(cuatro);
        cuatro.addActionListener(this);

        uno = new JButton("1");
        uno.setBounds(15, 240, 80, 80);
        add(uno);
        uno.addActionListener(this); //

        limpiar = new JButton("C");
        limpiar.setBounds(15, 325, 80, 80);
        add(limpiar);
        limpiar.addActionListener(this);

}
    @Override  //El concepto de Java Override y como permite encapsular una jerarquía
    public void actionPerformed(ActionEvent e) { // vamos a generar la accion de cada operacion
        if (e.getSource() == uno) {
            cadenaNum += "1";
            textfield.setText(cadenaNum);
            activado = true;
        }
        if (e.getSource() == dos) {
            cadenaNum += "2";
            textfield.setText(cadenaNum);
            activado = true;
        }
        if (e.getSource() == punto) {
            cadenaNum += ".";
            textfield.setText(cadenaNum);
            activado = true;
        }
        if (e.getSource() == tres) {
            cadenaNum += "3";
            textfield.setText(cadenaNum);
            activado = true;
        }
        if (e.getSource() == cuatro) {
            cadenaNum += "4";
            textfield.setText(cadenaNum);
            activado = true;
        }
        if (e.getSource() == cinco) {
            cadenaNum += "5";
            textfield.setText(cadenaNum);
            activado = true;
        }
        if (e.getSource() == seis) {
            cadenaNum += "6";
            textfield.setText(cadenaNum);
            activado = true;
        }
        if (e.getSource() == siete) {
            cadenaNum += "7";
            textfield.setText(cadenaNum);
            activado = true;
        }
        if (e.getSource() == ocho) {
            cadenaNum += "8";
            textfield.setText(cadenaNum);
            activado = true;
        }


        if (e.getSource() == nueve) {
            cadenaNum += "9";
            textfield.setText(cadenaNum);
            activado = true;
        }

        if (e.getSource() == botoncero) {
            if (cadenaNum != "" || cadenaNum != oper && num1>0) {
                cadenaNum += "0";
                textfield.setText(cadenaNum);
                activado = true;
            }
        }

        if(e.getSource()==limpiar){
            if(cadenaNum ==""){
                activado = false;
            }
            cadenaNum ="";
            textfield.setText("");
        }
        if(e.getSource()==botonSuma){
            if(cadenaNum==""){
                activado = false;
            }


            if(activado == true){
                num1 = (int) Double.parseDouble(cadenaNum);
                textfield.setText("+");
                cadenaNum = "";
                oper="sumar";

                activado = false;
            }
        }
        if(e.getSource()==botonResta){
            if(cadenaNum==""){
                activado = false;
            }
            if(activado == true){
                num1 = (int) Double.parseDouble(cadenaNum);
                textfield.setText("-");
                cadenaNum = "";
                oper="restar";

                activado = false;
            }
        }
        if (e.getSource() == botonMult) {
            if (cadenaNum == "") {
                activado = false;
            }
            if (activado == true) {
                num1 = (int) Double.parseDouble(cadenaNum);
                textfield.setText("*");
                cadenaNum = "";
                oper = "multiplicar";
            }
        }
        if (e.getSource() == botonDiv) {
            if (cadenaNum == "") {
                activado = false;
            }
            if (activado == true) {
                num1 = (int) Double.parseDouble(cadenaNum);
                textfield.setText("/");
                cadenaNum = "";
                oper = "dividir";
            }
        }



        if(e.getSource()==igual){

            double num2;
            num2 = (int) Double.parseDouble(cadenaNum);
            if(activado == true){
                if(oper.equals("nula")){
                    textfield.setText(cadenaNum);

                }else if(oper.equals("sumar")){
                    resultado = num1 + num2;
                    textfield.setText(String.valueOf(resultado));
                    cadenaNum = String.valueOf(resultado);
                    activado = true;
                    oper = "nula";
                }else if (oper.equals("restar")) {
                    resultado = num1 - num2;
                    textfield.setText(String.valueOf(resultado));
                    cadenaNum = String.valueOf(resultado);
                    activado = true;
                    oper = "nula";
                } else if (oper.equals("multiplicar")) {
                    resultado = num1 * num2;
                    textfield.setText(String.valueOf(resultado));
                    cadenaNum = String.valueOf(resultado);
                    activado = true;
                    oper = "nula";
                } else if(oper.equals("dividir")){
                    if(num2!=0){
                        resultado = num1 / num2;
                        textfield.setText(String.valueOf(resultado));
                        activado = true;
                        oper = "nula";
                        cadenaNum="";
                    }else{
                        String mensaje = "El segundo numero tiene que ser diferente de cero";
                        textfield.setText(mensaje);
                        cadenaNum="";
                    }
                }
            }

            activado = false;
        }
    }

}