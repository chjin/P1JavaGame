package com.client;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by cjw on 2016-02-04.
 */
public class ClientMain extends JFrame implements Runnable, ActionListener, MouseListener {
    //객체 생성
    Login login=new Login();
    Register register=new Register();
    WaitRoom waitRoom=new WaitRoom();

    // 소켓 연결을 위한 변수 선언




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










































