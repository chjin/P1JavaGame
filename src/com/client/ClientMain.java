package com.client;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Created by cjw on 2016-02-04.
 */
public class ClientMain extends JFrame implements Runnable, ActionListener, MouseListener {
    //객체 생성
    CardLayout cardLayout=new CardLayout();
    Login login=new Login();
    Register register=new Register();
    WaitRoom waitRoom=new WaitRoom();

    // 소켓 연결을 위한 변수 선언--인스턴스 멤버
    Socket socket;
    BufferedReader bufferedReader;      //데이터 읽어들임
    OutputStream outputStream;          //데이터 출력.

    //게임방에서 나오는 타이틀 문구 변수 선언
    public static String[] bangName={
            "재미있게 즐기자","나와 함께 잼난 게임을 ^^","나한테 지면 바보~",
            "Come on!! Yo!! Boom Boom!!", "우연의 합은 필연!!","다들 버그 잡고 해피주말~"
    };

    String myId;
    String myName;
    int myAvata;
    String myRoom;

    int infoRow=-1;     //사용자 정보 보기


    // 생성자
    public ClientMain(){
        this.setLayout(cardLayout);
        this.setTitle("P1JavaGame 만든 사람: hojinchu");
        this.add("LOGIN",login);
        setSize(1024,768);
        setVisible(true);

        Dimension screenD=Toolkit.getDefaultToolkit().getScreenSize();
        Dimension superFrameD=super.getSize();

        int xPos=(int)(screenD.getWidth()/2 - superFrameD.getWidth()/2);
        int yPos= (int)(screenD.getHeight()/2 - superFrameD.getHeight()/2);

        this.setLocation(xPos,yPos);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        this.setResizable(false);


    }




    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable(){

            @Override
            public void run() {
                try{
                    UIManager.setLookAndFeel("com.jtattoo.plaf.graphite.GraphiteLookAndFeel");
                    JFrame.setDefaultLookAndFeelDecorated(true);
                }catch(Exception e){
                    e.printStackTrace();
                }
                new ClientMain();
            }
        });
    }

    @Override
    public void run() {

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}










































