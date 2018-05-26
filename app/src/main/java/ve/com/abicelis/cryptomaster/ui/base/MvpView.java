package ve.com.abicelis.cryptomaster.ui.base;

import android.support.annotation.Nullable;
import android.support.design.widget.BaseTransientBottomBar;
import android.support.design.widget.Snackbar;

import ve.com.abicelis.cryptomaster.application.Message;

/**
 * Created by abicelis on 25/5/2018.
 *
 * This base interface must be used by any class that wants to act as a View in the MVP (Model View Presenter)
 * pattern. As this is a base interface, you would normally extend it with a more specific interface, which is then
 * implemented by an Activity or Fragment.
 */
public interface MvpView {
    void showMessage(Message message, @Nullable BaseTransientBottomBar.BaseCallback<Snackbar> callback);
}
