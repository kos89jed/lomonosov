/*
 * This file is generated by jOOQ.
*/
package io.jedaev.lomonosov.db;


import io.jedaev.lomonosov.db.tables.Securities;
import io.jedaev.lomonosov.db.tables.records.SecuritiesRecord;

import javax.annotation.Generated;

import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;


/**
 * A class modelling foreign key relationships between tables of the <code>public</code> 
 * schema
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<SecuritiesRecord, Integer> IDENTITY_SECURITIES = Identities0.IDENTITY_SECURITIES;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<SecuritiesRecord> SECURITIES_PKEY = UniqueKeys0.SECURITIES_PKEY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 extends AbstractKeys {
        public static Identity<SecuritiesRecord, Integer> IDENTITY_SECURITIES = createIdentity(Securities.SECURITIES, Securities.SECURITIES.ID);
    }

    private static class UniqueKeys0 extends AbstractKeys {
        public static final UniqueKey<SecuritiesRecord> SECURITIES_PKEY = createUniqueKey(Securities.SECURITIES, "securities_pkey", Securities.SECURITIES.ID);
    }
}
