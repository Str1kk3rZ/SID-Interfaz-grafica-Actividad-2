package src.app.login;

import java.awt.Color;

import javax.print.DocFlavor.STRING;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class LogicTemplate extends JFrame{
    private static final long serialVersionUID = 1L;

    private JPanel pIzquierda, pDerecha;
    private JLabel lTituloAPP, lEslogan, lTituloLogin, lNotificaciones;
    private JTextField tNombreUsuario;
    private JPasswordField tClaveUsuario;
    private JComboBox<String> cbTipoUsuario;
    private JButton bEntrar, bRegistrarse, bCerrar, bCerrar1;
    private JCheckBox checkSI, checkNO;
    private ButtonGroup grupo; 

    public LogicTemplate() {
        super("Login del usuario - Spotify");

        pIzquierda = new JPanel();
        pIzquierda.setSize(400, 500);
        pIzquierda.setLocation(0, 0);
        pIzquierda.setBackground(Color.GREEN);
        pIzquierda.setLayout(null);
        this.add(pIzquierda);

        pDerecha = new JPanel();
        pDerecha.setSize(600, 500);
        pDerecha.setLocation(400, 0);
        pDerecha.setBackground(Color.BLACK);
        pDerecha.setLayout(null);
        this.add(pDerecha);

        lTituloAPP = new JLabel("Registro de Usuario");
        lTituloAPP.setSize (100, 20);
        lTituloAPP.setLocation((pDerecha.getWidth() - lTituloAPP.getWidth()) / 2, 30);
        lTituloAPP.setForeground(Color.WHITE);
        lTituloAPP.setHorizontalAlignment(SwingConstants.CENTER);
        pDerecha.add(lTituloAPP);

        lEslogan = new JLabel("Inicia Sesion");
        lEslogan.setSize(130, 15);
        lEslogan.setLocation((pIzquierda.getWidth() - lEslogan.getWidth()) / 2, 40);
        lEslogan.setForeground(Color.DARK_GRAY);
        lEslogan.setHorizontalAlignment(SwingConstants.CENTER);
        pIzquierda.add(lEslogan);

        lTituloLogin = new JLabel("Coloca tus datos");
        lTituloLogin.setSize(150, 30);
        lTituloLogin.setLocation((pIzquierda.getWidth() - lTituloLogin.getWidth()) / 2, 60);
        lTituloLogin.setForeground(Color.DARK_GRAY);
        lTituloLogin.setHorizontalAlignment(SwingConstants.CENTER);
        pIzquierda.add(lTituloLogin);

        lNotificaciones = new JLabel("¿Recibir Notificaciones?");
        lNotificaciones.setSize(140, 20);
        lNotificaciones.setLocation((pDerecha.getWidth() - lNotificaciones.getWidth()) / 2, 370);
        lNotificaciones.setForeground(Color.WHITE);
        lNotificaciones.setHorizontalAlignment(SwingConstants.CENTER);
        pDerecha.add(lNotificaciones);

        tNombreUsuario = new JTextField("Nombre Usuario");
        tNombreUsuario.setSize(260, 40);
        tNombreUsuario.setLocation((pIzquierda.getWidth() - tNombreUsuario.getWidth()) / 2, 120);
        tNombreUsuario.setForeground(Color.DARK_GRAY);
        tNombreUsuario.setBackground(Color.WHITE);
        tNombreUsuario.setCaretColor(Color.blue);
        tNombreUsuario.setHorizontalAlignment(SwingConstants.CENTER);
        pIzquierda.add(tNombreUsuario);

        tClaveUsuario= new JPasswordField("Clave Usuario");
        tClaveUsuario.setSize(260, 40);
        tClaveUsuario.setLocation((pIzquierda.getWidth() - tClaveUsuario.getWidth()) / 2, 185);
        tClaveUsuario.setForeground(Color.DARK_GRAY);
        tClaveUsuario.setBackground(Color.WHITE);
        tClaveUsuario.setCaretColor(Color.blue);
        tClaveUsuario.setHorizontalAlignment(SwingConstants.CENTER);
        pIzquierda.add(tClaveUsuario);

        cbTipoUsuario = new JComboBox<String>();
        cbTipoUsuario.addItem("Gratis");
        cbTipoUsuario.addItem("Premiun");
        cbTipoUsuario.addItem("Familiar");
        cbTipoUsuario.setSize(220, 30);
        cbTipoUsuario.setLocation((pIzquierda.getWidth() - cbTipoUsuario.getWidth()) / 2, 240);
        cbTipoUsuario.setForeground(Color.DARK_GRAY);
        cbTipoUsuario.setBackground(Color.WHITE);
        ((JLabel)cbTipoUsuario.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
        pIzquierda.add(cbTipoUsuario);

        bEntrar = new JButton("Entrar");
        bEntrar.setSize(250, 45);
        bEntrar.setLocation((pIzquierda.getWidth() - bEntrar.getWidth()) / 2, 300);
        bEntrar.setBackground(Color.BLACK);
        bEntrar.setForeground(Color.WHITE);
        bEntrar.setFocusable(false);
        pIzquierda.add(bEntrar);

        bRegistrarse = new JButton("Registrarse");
        bRegistrarse.setSize(250, 45);
        bRegistrarse.setLocation((pDerecha.getWidth() - bRegistrarse.getWidth()) / 2, 400);
        bRegistrarse.setBackground(Color.GREEN);
        bRegistrarse.setForeground(Color.BLACK);
        bRegistrarse.setFocusable(false);
        pDerecha.add(bRegistrarse);

        bCerrar = new JButton("X");
        bCerrar.setBounds(330, 10, 45, 30);
        bCerrar.setFocusable(false);
        bCerrar.setBackground(Color.BLACK);
        bCerrar.setForeground(Color.RED);
        pIzquierda.add(bCerrar);

        bCerrar1 = new JButton("X");
        bCerrar1.setBounds(530, 10, 45, 30);
        bCerrar1.setFocusable(false);
        bCerrar1.setBackground(Color.GREEN);
        bCerrar1.setForeground(Color.RED);
        pDerecha.add(bCerrar1);

        checkSI = new JCheckBox("Si");
        checkSI.setSize(45, 25);
        checkSI.setLocation((pDerecha.getWidth() - checkSI.getWidth()) / 2 - 15, 345);
        checkSI.setFocusable(false);
        checkSI.setBackground(Color.BLACK);
        checkSI.setForeground(Color.WHITE);
        pDerecha.add(checkSI);

        checkNO = new JCheckBox("No");
        checkNO.setSize(45, 25);
        checkNO.setLocation((pDerecha.getWidth() - checkNO.getWidth()) / 2 + 30, 345);
        checkNO.setFocusable(false);
        checkNO.setBackground(Color.BLACK);
        checkNO.setForeground(Color.WHITE);
        pDerecha.add(checkNO);

        grupo = new ButtonGroup();
        grupo.add(checkSI);
        grupo.add(checkNO);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setSize(1000, 500);
        setLocationRelativeTo(this);

    }
    
}