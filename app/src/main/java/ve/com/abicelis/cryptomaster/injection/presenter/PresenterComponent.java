package ve.com.abicelis.cryptomaster.injection.presenter;

import dagger.Subcomponent;
import ve.com.abicelis.cryptomaster.ui.coindetail.CoinDetailActivity;
import ve.com.abicelis.cryptomaster.ui.coins.CoinsFragment;
import ve.com.abicelis.cryptomaster.ui.coins.CoinsListAdapter;
import ve.com.abicelis.cryptomaster.ui.home.HomeActivity;
import ve.com.abicelis.cryptomaster.ui.market.MarketFragment;

/**
 * Created by abicelis on 25/5/2018.
 */

@Subcomponent(
        modules = {
                PresenterModule.class,
        }
)
public interface PresenterComponent {
    void inject(HomeActivity target);
    void inject(MarketFragment target);
    void inject(CoinsFragment target);
    void inject(CoinsListAdapter target);
    void inject(CoinDetailActivity target);
}
