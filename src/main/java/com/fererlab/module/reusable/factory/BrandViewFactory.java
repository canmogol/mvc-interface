package com.fererlab.module.reusable.factory;

import com.fererlab.module.reusable.view.swing.BrandView;

import java.util.ArrayList;
import java.util.List;

public class BrandViewFactory {

    private static List<BrandView> brandViewList = new ArrayList<>();
    private static BrandViewFactory instance;

    private BrandViewFactory() {
    }

    public static BrandViewFactory getInstance() {
        if (instance == null) {
            instance = new BrandViewFactory();
        }
        return instance;
    }

    public BrandView createBrandView() {
        for (BrandView brandView : brandViewList) {
            if (brandView.isReusable()) {
                return brandView;
            }
        }
        BrandView brandView = new BrandView();
        brandViewList.add(brandView);
        return brandView;
    }

}
