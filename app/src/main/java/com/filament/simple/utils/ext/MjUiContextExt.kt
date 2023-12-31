package com.filament.simple.utils.ext

import androidx.lifecycle.LiveData
import com.foundation.widget.utils.ui.IUIContext
import com.filament.simple.core.base.loading.LoadingEventHelper
import com.filament.simple.core.base.loading.LoadingProgress
import com.filament.simple.core.base.loading.SimpleLoadingDialog

/**
 * 每次都绑定一个新的
 * 如果想绑定多个，请先合并多个liveData：[LoadingEventHelper.mergeMultiLiveData]
 */
fun IUIContext.bindLoadingEvent(ld: LiveData<LoadingProgress>, cancelable: Boolean = false) {
    SimpleLoadingDialog(this)
        .apply { setCancelable(cancelable) }
        .bindLoadingEvent(ld)
}
