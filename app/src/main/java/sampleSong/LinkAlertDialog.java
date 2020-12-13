package sampleSong;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;

import com.example.simplesaxaphone.R;


public class LinkAlertDialog {

    public static void createAlert(final Context context, final String url)
    {
        final AlertDialog.Builder builder = new AlertDialog.Builder(context);

        builder.setMessage(R.string.to_link)
                .setTitle(R.string.title)
                .setPositiveButton(R.string.yes, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        context.startActivity( new Intent(android.content.Intent.ACTION_VIEW).setData(Uri.parse(url)));
                    }
                })
                .setNegativeButton(R.string.no, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });

        builder.show();
    }
}
