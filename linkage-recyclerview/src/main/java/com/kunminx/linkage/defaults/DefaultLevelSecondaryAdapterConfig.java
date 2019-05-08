package com.kunminx.linkage.defaults;
/*
 * Copyright (c) 2018-2019. KunMinX
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


import android.content.Context;

import com.kunminx.linkage.R;
import com.kunminx.linkage.adapter.LinkageLevelSecondaryAdapter;
import com.kunminx.linkage.bean.LinkageItem;
import com.kunminx.linkage.contract.ILevelSecondaryAdapterConfig;

/**
 * Create by KunMinX at 19/5/8
 */
public class DefaultLevelSecondaryAdapterConfig implements ILevelSecondaryAdapterConfig {

    private Context mContext;
    private boolean mIsGridMode;

    @Override
    public void setContext(Context context) {
        mContext = context;
    }

    @Override
    public int getGridLayoutId() {
        return R.layout.default_adapter_linkage_level_secondary_grid;
    }

    @Override
    public int getLinearLayoutId() {
        return R.layout.default_adapter_linkage_level_secondary_linear;
    }

    @Override
    public int getHeaderLayoutId() {
        return R.layout.default_adapter_linkage_level_secondary_header;
    }

    @Override
    public int getTextViewId() {
        return R.id.level_2_title;
    }

    @Override
    public int getRootViewId() {
        return R.id.level_2_item;
    }

    @Override
    public int getHeaderViewId() {
        return R.id.level_2_header;
    }

    @Override
    public boolean isGridMode() {
        return false;
    }

    @Override
    public void setGridMode(boolean isGridMode) {
        mIsGridMode = isGridMode;
    }

    @Override
    public void onBindViewHolder(LinkageLevelSecondaryAdapter.LevelSecondaryViewHolder holder, LinkageItem item, int position) {

    }
}
