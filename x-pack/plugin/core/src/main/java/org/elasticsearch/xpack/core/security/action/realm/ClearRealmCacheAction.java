/*
 * Copyright Elasticsearch B.V. and/or licensed to Elasticsearch B.V. under one
 * or more contributor license agreements. Licensed under the Elastic License;
 * you may not use this file except in compliance with the Elastic License.
 */
package org.elasticsearch.xpack.core.security.action.realm;

import org.elasticsearch.action.StreamableResponseAction;

public class ClearRealmCacheAction extends StreamableResponseAction<ClearRealmCacheResponse> {

    public static final ClearRealmCacheAction INSTANCE = new ClearRealmCacheAction();
    public static final String NAME = "cluster:admin/xpack/security/realm/cache/clear";

    protected ClearRealmCacheAction() {
        super(NAME);
    }

    @Override
    public ClearRealmCacheResponse newResponse() {
        return new ClearRealmCacheResponse();
    }
}
