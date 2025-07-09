package com.cleanroommc.relauncher.gui;

import javax.swing.*;

class SupportingFrame extends JFrame {

    SupportingFrame(String title, ImageIcon icon) {
        super(title);
        this.setUndecorated(true);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setIconImage(icon.getImage());
    }

}
