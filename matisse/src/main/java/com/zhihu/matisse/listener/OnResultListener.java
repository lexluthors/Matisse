/*
 * Copyright 2017 Zhihu Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.zhihu.matisse.listener;

import com.zhihu.matisse.internal.entity.Item;

import java.util.List;

import androidx.annotation.NonNull;

public interface OnResultListener {
    /**
     * @param uriList the selected item {@link Item} list.
     * @param pathList the selected item file path list.
     */
    void onResult(@NonNull List<Item> uriList, @NonNull List<String> pathList);
}
