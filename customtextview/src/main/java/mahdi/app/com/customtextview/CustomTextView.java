package mahdi.app.com.customtextview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.support.annotation.Nullable;
import android.util.AttributeSet;

public class CustomTextView extends android.support.v7.widget.AppCompatTextView
{
    public CustomTextView (Context context)
    {
        super(context);
    }
    
    public CustomTextView (Context context, @Nullable AttributeSet attrs)
    {
        super(context, attrs);
        setFont(context,attrs);
    }
    
    public CustomTextView (Context context, @Nullable AttributeSet attrs, int defStyleAttr)
    {
        super(context, attrs, defStyleAttr);
        setFont(context,attrs);
    }
    
    private void setFont (Context context, AttributeSet attributeSet)
    {
        TypedArray typedArray = context.obtainStyledAttributes(attributeSet, R.styleable.CustomTextView);
        
        String fontPath = typedArray.getString(R.styleable.CustomTextView_fontPath);
        
        if (!fontPath.trim().isEmpty() || fontPath.trim().length() != 0 ||
            !fontPath.trim().equals(""))
        {
            Typeface font = Typeface.createFromAsset(context.getAssets(),fontPath);
            
            setTypeface(font);
        }
        
        
        typedArray.recycle();
    }
}
