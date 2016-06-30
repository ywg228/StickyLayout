package com.ywg.stickylayout.utils;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.widget.Toast;

import com.ywg.stickylayout.R;


/**
 * Created by Ywg on 2016/6/9.
 */
public class CommonUtil {

    /**
     * 复制链接到系统剪贴板
     *
     * @param url
     */
    public static void copyLink(Context context, String url) {
        // 从API11开始android推荐使用android.content.ClipboardManager
        ClipboardManager cm = (ClipboardManager) context.getSystemService(Context.CLIPBOARD_SERVICE);
        // 将文本内容放到系统剪贴板里。
        ClipData clipData = ClipData.newPlainText("text", url);
        cm.setPrimaryClip(clipData);
        Toast.makeText(context, R.string.copy_success, Toast.LENGTH_LONG).show();
    }

}
