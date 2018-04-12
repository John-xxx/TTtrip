package ownhome.top.tttrip.weight;

import android.content.Context;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import ownhome.top.tttrip.R;

/**
 * description：
 * date：2018/4/12 15:09
 * author：ZouChao
 * email：475934874@qq.com
 */
public class DialogHelper {

    public void showFragmentDialog(Context context, String text) {
        DialogFragment dialogFragment = new DialogFragment();
        View view = LayoutInflater.from(context).inflate(R.layout.dialog_layout, null);
        TextView textView = view.findViewById(R.id.dialog_title);
        TextView textView1 = view.findViewById(R.id.dialog_content);
        textView.setText(text);
        dialogFragment.onViewCreated(view, null);

    }
}
