package ecocow.movierecapi.util;

import java.util.UUID;

public class TxidGenerator {

    public static String getTxid(){
        return UUID.randomUUID().toString();
    }
}
