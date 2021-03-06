package com.fererlab.module.prototype.view.swing;

import com.fererlab.app.swing.ui.SwingInternalFrame;
import com.fererlab.module.prototype.model.PrototypeModel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PrototypeView extends SwingInternalFrame  {

    public PrototypeView() {
        // set dimensions and location
        super(200, 70, 10, 10);

        // create UI
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        JButton openUserView = new JButton();
        openUserView.setText("Open User View");
        openUserView.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getActionListener().actionPerformed(new PrototypeModel());
            }
        });
        panel.add(openUserView);
        add(panel);
    }

    @Override
    public void init() {
        // do something time consuming
    }

}