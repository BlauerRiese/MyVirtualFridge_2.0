package bjoernbinzer.myvirtualfridge;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by Felix on 02.11.15.
 */
public class CategoryTextView extends TextView {


    public CategoryTextView(Context context) {
        super(context);
        init();
    }

    public CategoryTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public CategoryTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

   private void init() {
       Typeface robotoThin = Typeface.createFromAsset(getContext().getAssets(), "fonts/Roboto-Thin.ttf");
       setTypeface(robotoThin);
   }

}
