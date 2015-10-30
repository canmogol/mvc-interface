package com.fererlab.app.swing.ui;

import com.fererlab.core.model.AlertMessage;
import com.fererlab.core.common.ActionListener;
import com.fererlab.core.model.Model;
import com.fererlab.core.view.View;

import javax.swing.*;

public abstract class SwingInternalFrame extends JInternalFrame implements View {

    private ActionListener listener;
    private int id;

    public SwingInternalFrame(int width, int height, int x, int y) {
        super("", true, false, true, true);
        setSize(width, height);
        setLocation(x, y);
    }

    public void setActionListener(ActionListener listener) {
        this.listener = listener;
    }

    public ActionListener getActionListener() {
        return listener;
    }

    @Override
    public void notify(Model model) {
        if (model instanceof AlertMessage) {
            AlertMessage alertMessage = (AlertMessage) model;
            JOptionPane.showMessageDialog(this, alertMessage.getMessage());
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
