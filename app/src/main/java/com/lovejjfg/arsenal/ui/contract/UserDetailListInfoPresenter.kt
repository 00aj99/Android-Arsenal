/*
 *  Copyright (c) 2017.  Joe
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package com.lovejjfg.arsenal.ui.contract

/**
 * Created by Joe on 2017/3/9.
 * Email lovejjfg@gmail.com
 */

class UserDetailListInfoPresenter(view: ListInfoContract.View) : BaseListInfoPresenter(view) {

    override fun onRefresh() {
    }

    override fun onLoadMore() {
    }

    override fun onViewPrepared() {
        mView.setPullRefreshEnable(false)
        mView.atEnd()
        mView.closeLoadingDialog()
    }
}
