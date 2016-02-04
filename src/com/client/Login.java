package com.client;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.geom.Area;

/**
 * Created by cjw on 2016-02-04.
 */
public class Login extends JPanel {
    //객체 생성
    JTextField jTextField=new HintedTextField(12, "     아이디를 입력하세요.");

    //inner 클래스 선언 - 로그인 텍스트 필드들의 힌트 텍스트 필드
    private static class HintedTextField extends JTextField{
        private final JTextField jTextHintField;

        public HintedTextField(int columns, String hint){
            super(columns);
            setBorder(new RoundedRectableBorder(true, false));
            jTextHintField=new JTextField(hint);
            jTextHintField.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        }

        @Override
        protected void printComponent(Graphics g) {
            super.printComponent(g);
        }
    }

    //inner class-로그인 패널의 테두리 담당.
    private static class RoundedRectableBorder implements Border{
        private final boolean top;
        private final boolean bottom;

        private RoundedRectableBorder(boolean top, boolean bottom) {
            this.top = top;
            this.bottom = bottom;
        }


        @Override
        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            Area area=new Area(new Rectangle(x,y,width,height));
        }

        @Override
        public Insets getBorderInsets(Component c) {
            return null;
        }

        @Override
        public boolean isBorderOpaque() {
            return false;
        }
    }


}

























