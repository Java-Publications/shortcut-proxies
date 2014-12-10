/*
 * Copyright (c) 2013. Heinz Max Kabutz , Sven Ruppert
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

package org.rapidpm.demo.entwicklerpress.shortcut.proxies.model;

import static java.lang.System.out;

/**
 * Created by Sven Ruppert on 18.12.13.
 */
public class MethodClass {
    public void method01() {
        out.println("called method01");
    }

    public void method02(String txt) {
        out.println("called method02 " + txt);
    }

    public String method03() {
        out.println("called method03");
        return " -> Method03"; }

    private void method04() {
        out.println("called method04");
    }

}

