package com.xyoye.dandanplay.mvp.impl;

import android.os.Bundle;

import com.xyoye.dandanplay.base.BaseMvpPresenterImpl;
import com.xyoye.dandanplay.mvp.presenter.AnimePresenter;
import com.xyoye.dandanplay.mvp.view.AnimeView;
import com.xyoye.dandanplay.utils.Lifeful;

/**
 * Created by xyoye on 2018/7/15.
 */

public class AnimePresenterImpl extends BaseMvpPresenterImpl<AnimeView> implements AnimePresenter {

    public AnimePresenterImpl(AnimeView view, Lifeful lifeful) {
        super(view, lifeful);
    }

    @Override
    public void init() {

    }

    @Override
    public void process(Bundle savedInstanceState) {

    }

    @Override
    public void resume() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void destroy() {

    }
}
