package com.chad.library.adapter.base.diff;

import android.support.annotation.NonNull;

/**
 * 使用java接口定义方法
 * @param <T>
 */
public interface DifferImp<T> {
    void addListListener(@NonNull ListChangeListener<T> listChangeListener);
}
