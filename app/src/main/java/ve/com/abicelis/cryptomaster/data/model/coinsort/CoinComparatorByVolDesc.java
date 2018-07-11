package ve.com.abicelis.cryptomaster.data.model.coinsort;

import java.util.Comparator;

import ve.com.abicelis.cryptomaster.data.model.Coin;

/**
 * Created by abicelis on 10/7/2018.
 */
public class CoinComparatorByVolDesc implements Comparator<Coin> {
    @Override
    public int compare(Coin o1, Coin o2) {
        return (Double.compare(o2.getVolume24h(), o1.getVolume24h()));
    }
}
