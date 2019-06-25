/*
 * Copyright (c) 2016 Network New Technologies Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * You may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.networknt.db;

/**
 * Another popular open source database.
 *
 * @author Steve Hu
 */
public class PostgresDataSource extends GenericDataSource {
    private static final String POSTGRES_DS = "PostgresDataSource";
    private static final String POSTGRES_PASSWORD = "postgresPassword";

    @Override
    public String getDsName() {
        if(dsName != null) {
            return dsName;
        } else {
            return POSTGRES_DS;
        }
    }

    @Override
    public String getDbPassKey() {
        return POSTGRES_PASSWORD;
    }

    public PostgresDataSource(String dsName) {
        super(dsName);
    }

    public PostgresDataSource() {
        super();
    }

}