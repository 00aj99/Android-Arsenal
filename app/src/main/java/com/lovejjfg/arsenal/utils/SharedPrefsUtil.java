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

package com.lovejjfg.arsenal.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;


class SharedPrefsUtil {
    private static final String SHARE_PRESNAME = "SharedPreferences";

    /**
     * 向SharedPreferences中写入int类型数据
     *
     * @param context 上下文环境
     * @param key     键
     * @param value   值
     */
    public static void putValue(Context context, String key,
                                int value) {
        Editor sp = getEditor(context);
        sp.putInt(key, value);
        sp.commit();
    }

    /**
     * 向SharedPreferences中写入boolean类型的数据
     *
     * @param context 上下文环境
     * @param key     键
     * @param value   值
     */
    public static void putValue(Context context, String key,
                                boolean value) {
        Editor sp = getEditor(context);
        sp.putBoolean(key, value);
        sp.commit();
    }

    /**
     * 向SharedPreferences中写入String类型的数据
     *
     * @param context 上下文环境
     * @param key     键
     * @param value   值
     */
    public static void putValue(Context context, String key,
                                String value) {
        Editor sp = getEditor(context);
        sp.putString(key, value);
        sp.commit();
    }

    /**
     * 向SharedPreferences中写入float类型的数据
     *
     * @param context 上下文环境
     * @param key     键
     * @param value   值
     */
    public static void putValue(Context context, String key,
                                float value) {
        Editor sp = getEditor(context);
        sp.putFloat(key, value);
        sp.commit();
    }

    /**
     * 向SharedPreferences中写入long类型的数据
     *
     * @param context 上下文环境
     * @param key     键
     * @param value   值
     */
    public static void putValue(Context context, String key,
                                long value) {
        Editor sp = getEditor(context);
        sp.putLong(key, value);
        sp.commit();
    }

    /**
     * 从SharedPreferences中读取int类型的数据
     *
     * @param context  上下文环境
     * @param key      键
     * @param defValue 如果读取不成功则使用默认值
     * @return 返回读取的值
     */
    public static int getValue(Context context, String key,
                               int defValue) {
        SharedPreferences sp = getSharedPreferences(context);
        return sp.getInt(key, defValue);
    }

    /**
     * 从SharedPreferences中读取boolean类型的数据
     *
     * @param context  上下文环境
     * @param defValue 如果读取不成功则使用默认值
     * @return 返回读取的值
     */
    public static boolean getValue(Context context, String key,
                                   boolean defValue) {
        SharedPreferences sp = getSharedPreferences(context);
        return sp.getBoolean(key, defValue);
    }

    /**
     * 从SharedPreferences中读取String类型的数据
     *
     * @param context  上下文环境
     * @param key      键
     * @param defValue 如果读取不成功则使用默认值
     * @return 返回读取的值
     */
    public static String getValue(Context context, String key,
                                  String defValue) {
        SharedPreferences sp = getSharedPreferences(context);
        return sp.getString(key, defValue);
    }

    /**
     * 从SharedPreferences中读取float类型的数据
     *
     * @param context  上下文环境
     * @param key      键
     * @param defValue 如果读取不成功则使用默认值
     * @return 返回读取的值
     */
    public static float getValue(Context context, String key,
                                 float defValue) {
        SharedPreferences sp = getSharedPreferences(context);
        return sp.getFloat(key, defValue);
    }

    /**
     * 从SharedPreferences中读取long类型的数据
     *
     * @param context  上下文环境
     * @param key      键
     * @param defValue 如果读取不成功则使用默认值
     * @return 返回读取的值
     */
    public static long getValue(Context context, String key,
                                long defValue) {
        SharedPreferences sp = getSharedPreferences(context);
        return sp.getLong(key, defValue);
    }

    //获取Editor实例
    private static Editor getEditor(Context context) {
        return getSharedPreferences(context).edit();
    }

    //获取SharedPreferences实例
    private static SharedPreferences getSharedPreferences(Context context) {
        return context.getSharedPreferences(SHARE_PRESNAME, Context.MODE_PRIVATE);
    }

    /**
     * 删除SharedPref文件
     *
     * @param context
     */
    public static void deletePref(Context context) {
        Editor editor = getEditor(context);
        editor.clear();
        editor.commit();
    }

    /**
     * 由key删除value
     *
     * @param context
     * @param key
     */
    public static void removeKey(Context context, String key) {
        Editor editor = getEditor(context);
        editor.remove(key);
        editor.commit();
    }
}
