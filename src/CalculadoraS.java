import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

class VentanaCalcu extends JFrame implements ActionListener, KeyListener{


	GridBagConstraints gbc = new GridBagConstraints();
	GridBagLayout gbl = new GridBagLayout();
	JTextField res;
	JButton sum, rest,div,multi,delete,deleteAll,pot,frac,raiz,porcent,igual,puntoDecimal,potNeg,masMenos;
	JButton cero, uno, dos, tres, cuatro, cinco, seis, siete, ocho, nueve;
	String cad="";
	boolean band=true;

	public VentanaCalcu() {

		getContentPane().setLayout(gbl);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Calculadora");
		setVisible(true);
		setResizable(false);



		res=new JTextField();
		res.addKeyListener(this);
		res.setHorizontalAlignment(JTextField.RIGHT);
		gbc.fill=GridBagConstraints.HORIZONTAL;
		metodoLlenado(res, 0, 0, 4, 1);

		porcent = new JButton(" % ");
		metodoLlenado(porcent, 0, 2, 1, 1);
		porcent.addActionListener(this);

		raiz = new JButton(" sqrt ");
		metodoLlenado(raiz, 1, 2, 1, 1);
		raiz.addActionListener(this);

		pot= new JButton(" ^2 ");
		metodoLlenado(pot, 2, 2, 1, 1);
		pot.addActionListener(this);

		potNeg= new JButton(" 1/x ");
		metodoLlenado(potNeg, 3, 2, 1, 1);
		potNeg.addActionListener(this);

		deleteAll = new JButton("CE");
		metodoLlenado(deleteAll, 0, 3, 2, 1);
		deleteAll.addActionListener(this);

		delete = new JButton("<");
		metodoLlenado(delete, 2, 3, 1, 1);
		delete.addActionListener(this);

		div = new JButton("/");
		metodoLlenado(div, 3, 3, 1, 1);
		div.addActionListener(this);

		siete= new JButton("7");
		metodoLlenado(siete, 0, 4, 1, 1);
		siete.addActionListener(this);

		ocho= new JButton("8");
		metodoLlenado(ocho, 1, 4, 1, 1);
		ocho.addActionListener(this);

		nueve= new JButton("9");
		metodoLlenado(nueve, 2, 4, 1, 1);
		nueve.addActionListener(this);

		multi = new JButton("x");
		metodoLlenado(multi, 3, 4, 1, 1);
		multi.addActionListener(this);

		cuatro = new JButton("4");
		metodoLlenado(cuatro, 0, 5, 1, 1);
		cuatro.addActionListener(this);

		cinco = new JButton("5");
		metodoLlenado(cinco, 1, 5, 1, 1);
		cinco.addActionListener(this);

		seis = new JButton("6");
		metodoLlenado(seis, 2, 5, 1, 1);
		seis.addActionListener(this);

		rest= new JButton(" - ");
		metodoLlenado(rest, 3, 5, 1, 1);
		rest.addActionListener(this);

		uno = new JButton("1");
		metodoLlenado(uno, 0, 6, 1, 1);
		uno.addActionListener(this);

		dos = new JButton("2");
		metodoLlenado(dos, 1, 6, 1, 1);
		dos.addActionListener(this);

		tres = new JButton("3");
		metodoLlenado(tres, 2, 6, 1, 1);
		tres.addActionListener(this);

		sum= new JButton(" + ");
		metodoLlenado(sum, 3, 6, 1, 1);
		sum.addActionListener(this);

		masMenos = new JButton(" +/- ");
		metodoLlenado(masMenos, 0, 7, 1, 1);
		masMenos.addActionListener(this);

		cero = new JButton("0");
		metodoLlenado(cero, 1, 7, 1, 1);
		cero.addActionListener(this);

		puntoDecimal = new JButton(".");
		metodoLlenado(puntoDecimal, 2, 7, 1, 1);
		puntoDecimal.addActionListener(this);



		igual= new JButton(" = ");
		metodoLlenado(igual, 3, 7, 1, 1);
		igual.addActionListener(this);


		pack();
		setLocationRelativeTo(null);
	}//Constructor 

	public void metodoLlenado(Component a, int gx, int gy, int gw, int gh) {
		gbc.gridx=gx;
		gbc.gridy=gy;
		gbc.gridwidth=gw;
		gbc.gridheight=gh;
		gbl.setConstraints(a, gbc);
		a.setFont(new Font("Arial", 1/2, 22));
		add(a);
	}//metodoLlenado


	@Override
	public void actionPerformed(ActionEvent e) {
		Component c = (Component)e.getSource();

		if(c== uno) {
			cad=cad+ uno.getText();
			res.setText(cad);
		}else if(c== cero) {
			cad=cad+cero.getText();
			res.setText(cad);
		}else if(c== dos) {
			cad=cad+dos.getText();
			res.setText(cad);
		}else if(c== tres) {
			cad=cad+tres.getText();
			res.setText(cad);
		}else if(c== cuatro) {
			cad=cad+cuatro.getText();
			res.setText(cad);
		}else if(c== cinco) {
			cad=cad+cinco.getText();
			res.setText(cad);
		}else if(c== seis) {
			cad=cad+seis.getText();
			res.setText(cad);
		}else if(c== siete) {
			cad=cad+siete.getText();
			res.setText(cad);
		}else if(c== ocho) {
			cad=cad+ocho.getText();
			res.setText(cad);
		}else if(c== nueve) {
			cad=cad+nueve.getText();
			res.setText(cad);
		}else if(c== deleteAll) {
			cad="";
			res.setText(cad);
		}else if(c== delete) {
			cad=cad.substring(0, cad.length()-1);
			res.setText(cad);
		}else if(c== puntoDecimal) {
			if(band==true) {
				res.setText(".");
				cad=cad+ res.getText();
				res.setText(cad);
				band=false;
			}
		}else if(c==masMenos) {
			if(cad!="") {
				if(cad.charAt(0)=='-') {
					cad= cad.substring(1, cad.length());
					res.setText(cad);
				}else {
					cad= "-"+cad;
					res.setText(cad);
				}
			}
		}else if(c==sum) {
			if(cad!="") {	
				if(cad.contains("*")||cad.substring(1,cad.length()).contains("-")||cad.contains("+")||cad.contains("/")) {

				}else {
					cad=cad+ "+";
					res.setText(cad);
					cad=res.getText();
					band=true;
				}}
		}else if(c==rest) {
			if(cad!="") {	
				if(cad.contains("*")||cad.substring(1,cad.length()).contains("-")||cad.contains("+")||cad.contains("/")) {

				}else {
					cad=cad+ "-";
					res.setText(cad);
					cad=res.getText();
					band=true;
				}}
		}else if(c==multi) {
			if(cad!="") {	
				if(cad.contains("*")||cad.substring(1,cad.length()).contains("-")||cad.contains("+")||cad.contains("/")) {

				}else {
					cad=cad+ "*";
					res.setText(cad);
					cad=res.getText();
					band=true;
				}}
		}else if(c==div) {
			if(cad!="") {
				if(cad.contains("*")||cad.substring(1,cad.length()).contains("-")||cad.contains("+")||cad.contains("/")) {

				}else {
					cad=cad+ "/";
					res.setText(cad);
					cad=res.getText();
					band=true;
				}}
		}else if(c==igual) {
			boolean bandera=true;
			if(cad.charAt(0)=='-') {
				cad=cad.substring(1,cad.length());
				bandera=false;
			}
			for(int i=0; i<cad.length(); i++) {
				char car= cad.charAt(i);
				String num1,num2;
				double res1;

				switch(car) {
				case '+':
					num1= cad.substring(0,i);
					num2= cad.substring(i+1,cad.length());
					if(bandera==false) {
						res1= Double.parseDouble(num2) - Double.parseDouble(num1);
						res.setText(String.valueOf(res1));
						cad=String.valueOf(res1);
					}else {
						res1= Double.parseDouble(num1) + Double.parseDouble(num2);
						res.setText(String.valueOf(res1));
						cad=String.valueOf(res1);
					}
					break;
				case'-':
					num1= cad.substring(0,i);
					num2= cad.substring(i+1,cad.length());
					if(bandera==false) {
						res1= Double.parseDouble(num1)+Double.parseDouble(num2);
						res.setText(String.valueOf("-"+res1));
						cad=String.valueOf("-"+res1);
					}else {
						res1= Double.parseDouble(num1) - Double.parseDouble(num2);
						res.setText(String.valueOf(res1));
						cad=String.valueOf(res1);
					}
					break;
				case'*':
					num1= cad.substring(0,i);
					num2= cad.substring(i+1,cad.length());
					if(bandera==false) {
						res1= Double.parseDouble(num1) * Double.parseDouble(num2);
						res.setText(String.valueOf("-"+res1));
						cad=String.valueOf("-"+res1);
					}else {
						res1= Double.parseDouble(num1) * Double.parseDouble(num2);
						res.setText(String.valueOf(res1));
						cad=String.valueOf(res1);
					}
					break;
				case'/':
					num1= cad.substring(0,i);
					num2= cad.substring(i+1,cad.length());

					if(Double.parseDouble(num2)==0) {
						JOptionPane.showMessageDialog(this, "ERROR");
						cad="";
						res.setText(cad);
					}else if(bandera==false){
						res1= Double.parseDouble(num1) / Double.parseDouble(num2);
						res.setText(String.valueOf("-"+res1));
						cad=String.valueOf("-"+res1);
					}else {
						res1= Double.parseDouble(num1) / Double.parseDouble(num2);
						res.setText(String.valueOf(res1));
						cad=String.valueOf(res1);
					}
					break;
				}
			}
		}else if(c==porcent) {
			if(cad!="") {

				if(cad.contains("*")||cad.substring(1,cad.length()).contains("-")||cad.contains("+")||cad.contains("/")) {
					boolean bandera1=true;
					for(int i=0; i<cad.length(); i++) {
						double num4;
						if(cad.charAt(0)=='-') {
							cad=cad.substring(1,cad.length());
							bandera1=false;
						}
						if(cad.charAt(i)=='+'||cad.charAt(i)=='-'||cad.charAt(i)=='*'||cad.charAt(i)=='/') {
							if(cad.substring(i+1,cad.length())=="") {

							}else {
								String cad2=cad.substring(i+1,cad.length());
								double num3= Double.parseDouble(cad2)/100;
								if(bandera1==false) {
									num4= (Double.parseDouble(cad.substring(0,i)));
									double num5= (num3)*(num4);
									cad=cad.substring(0, i+1)+String.valueOf(num5);
									res.setText("-"+cad);
								}else if(bandera1==true){
									num4= (Double.parseDouble(cad.substring(0,i)));
									double num5= (num3)*(num4);
									cad=cad.substring(0, i+1)+String.valueOf(num5);
									res.setText(cad);
								}
								;
							}
						}
					}
				}else {
					String num3= res.getText();
					double num= Double.parseDouble(num3)/100;
					cad=String.valueOf(num);
					res.setText(cad);
					cad=res.getText();

				}
			}
		}else if(c==potNeg) {
			if(cad!="") {

				if(cad.contains("*")||cad.substring(1,cad.length()).contains("-")||cad.contains("+")||cad.contains("/")) {
					boolean bandera1=true;
					for(int i=0; i<cad.length(); i++) {
						double num4;
						if(cad.charAt(0)=='-') {
							cad=cad.substring(1,cad.length());
							bandera1=false;
						}
						if(cad.charAt(i)=='+'||cad.charAt(i)=='-'||cad.charAt(i)=='*'||cad.charAt(i)=='/') {
							if(cad.substring(i+1,cad.length())=="") {

							}else {
								String cad2=cad.substring(i+1,cad.length());
								double num3= 1/Double.parseDouble(cad2);
								if(bandera1==false) {
									num4= (Double.parseDouble(cad.substring(0,i)));
									double num5= (num4)-(num3);
									cad=String.valueOf(num5);
									res.setText("-"+cad);
								}else if(bandera1==true){
									num4= (Double.parseDouble(cad.substring(0,i)));
									double num5= (num3)+(num4);
									cad=String.valueOf(num5);
									res.setText(cad);
								}
								;
							}
						}
					}
				}else {
					String num3= res.getText();
					double num= 1/Double.parseDouble(num3);
					cad=String.valueOf(num);
					res.setText(cad);
					cad=res.getText();

				}
			}
		}else if(c==pot) {
			if(cad!="") {

				if(cad.contains("*")||cad.substring(1,cad.length()).contains("-")||cad.contains("+")||cad.contains("/")) {
					boolean bandera1=true;
					for(int i=0; i<cad.length(); i++) {
						double num4;
						if(cad.charAt(0)=='-') {
							cad=cad.substring(1,cad.length());
							bandera1=false;
						}
						if(cad.charAt(i)=='+'||cad.charAt(i)=='-'||cad.charAt(i)=='*'||cad.charAt(i)=='/') {
							if(cad.substring(i+1,cad.length())=="") {

							}else {
								String cad2=cad.substring(i+1,cad.length());
								double num3= Double.parseDouble(cad2);
								if(bandera1==false) {
									num4= (Double.parseDouble(cad.substring(0,i)));
									double num5= (Math.pow(num3, 2))-(num4);
									cad=String.valueOf(num5);
									res.setText(cad);
								}else if(bandera1==true){
									num4= (Double.parseDouble(cad.substring(0,i)));
									double num5= (Math.pow(num3, 2))+(num4);
									cad=String.valueOf(num5);
									res.setText(cad);
								}
								;
							}
						}
					}
				}else {
					String num3= res.getText();
					double num= Double.parseDouble(num3);
					cad=String.valueOf(Math.pow(num, 2));
					res.setText(cad);
					cad=res.getText();

				}
			}
		}else if(c==raiz) {
			if(cad!="") {

				if(cad.contains("*")||cad.substring(1,cad.length()).contains("-")||cad.contains("+")||cad.contains("/")) {
					boolean bandera1=true;
					for(int i=0; i<cad.length(); i++) {
						double num4;
						if(cad.charAt(0)=='-') {
							cad=cad.substring(1,cad.length());
							bandera1=false;
						}
						if(cad.charAt(i)=='+'||cad.charAt(i)=='-'||cad.charAt(i)=='*'||cad.charAt(i)=='/') {
							if(cad.substring(i+1,cad.length())=="") {

							}else {
								String cad2=cad.substring(i+1,cad.length());
								double num3= Double.parseDouble(cad2);
								if(bandera1==false) {
									num4= (Double.parseDouble(cad.substring(0,i)));
									double num5= (Math.sqrt(num3))-(num4);
									cad=String.valueOf(num5);
									res.setText(cad);
								}else if(bandera1==true){
									num4= (Double.parseDouble(cad.substring(0,i)));
									double num5= (Math.sqrt(num3))+(num4);
									cad=String.valueOf(num5);
									res.setText(cad);
								}
								;
							}
						}
					}
				}else {
					String num3= res.getText();
					double num= Double.parseDouble(num3);
					if(cad.charAt(0)=='-') {
						JOptionPane.showMessageDialog(this, "NO SE PUEDEN RAICES NEGATIVAS");
						cad="";
						res.setText(cad);
					}else {
					cad=String.valueOf(Math.sqrt(num));
					res.setText(cad);
					cad=res.getText();
					}
				}
			}
		}

		}//Action

		@Override
		public void keyTyped(KeyEvent e) {
			char caracter = e.getKeyChar();
			if(caracter<'0'||caracter>'9') {
				e.consume();
			}
		}

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub

		}

	}//Class




	public class CalculadoraS {

		public static void main(String[] args) {
			SwingUtilities.invokeLater(new Runnable() {
				@Override
				public void run() {
					new VentanaCalcu();
				}
			});

		}

	}
