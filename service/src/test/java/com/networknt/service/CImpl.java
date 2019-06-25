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

package com.networknt.service;

/**
 * Created by steve on 2016-11-27.
 */
public class CImpl implements C {
    final A a;
    final B b;

    public CImpl(A a, B b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String c() {
        return a.a() + b.b();
    }
}