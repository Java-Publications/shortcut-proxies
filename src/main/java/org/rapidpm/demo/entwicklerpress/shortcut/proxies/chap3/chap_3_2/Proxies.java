/*
 * Copyright (c) 2015. Heinz Max Kabutz , Sven Ruppert
 *   We licenses
 *   this file to you under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License. You may
 *   obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package org.rapidpm.demo.entwicklerpress.shortcut.proxies.chap3.chap_3_2;

/**
 * Created by sven on 20.01.15.
 */
import java.lang.reflect.*;

public class Proxies {
    public static <P> P makeSimpleProxy(Class<P> clazz, P p) {
        return clazz.cast(Proxy.newProxyInstance(
                clazz.getClassLoader(),
                new Class<?>[] {clazz},
                (proxy, method, args) -> method.invoke(p, args)
        ));
    }
}
