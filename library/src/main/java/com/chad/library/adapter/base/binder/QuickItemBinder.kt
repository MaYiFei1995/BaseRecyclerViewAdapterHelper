package com.chad.library.adapter.base.binder

import android.support.annotation.LayoutRes
import android.view.ViewGroup
import com.chad.library.adapter.base.util.getItemView
import com.chad.library.adapter.base.viewholder.BaseViewHolder

/**
 * 使用布局 ID 快速构建 Binder
 * @param T item 数据类型
 */
abstract class QuickItemBinder<T> : BaseItemBinder<T, BaseViewHolder>() {

    @LayoutRes
    abstract fun getLayoutId(): Int

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder =
            BaseViewHolder(parent.getItemView(getLayoutId()))

}

