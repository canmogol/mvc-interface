package com.fererlab.spring.reusable.controller;

import com.fererlab.spring.app.controller.BaseController;

import java.awt.event.ActionEvent;

public class ReusableController extends BaseController {

    private CarController carController;

    public CarController getCarController() {
        return carController;
    }

    public void setCarController(CarController carController) {
        this.carController = carController;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        carController.init();
    }
}
