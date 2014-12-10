/*
 * Copyright (c) 2014. Heinz Max Kabutz , Sven Ruppert
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

package org.rapidpm.demo.entwicklerpress.shortcut.proxies.old.chap01.chap_1_6_1;

import java.lang.reflect.*;

/**
 * Created by Sven Ruppert on 19.01.14.
 */
public class Warper {

    private static Field stringValue;

    static {
// String has a private char [] called "value"
// if it does not, find the char [] and assign it to value
        try {
            stringValue = String.class.getDeclaredField("value");
        } catch (NoSuchFieldException ex) {
// safety net in case we are running on a VM with a
// different name for the char array.
            Field[] all = String.class.getDeclaredFields();
            for (int i = 0; stringValue == null && i < all.length; i++) {
                if (all[i].getType().equals(char[].class)) {
                    stringValue = all[i];
                }
            }
        }
        if (stringValue != null) {
            stringValue.setAccessible(true); // make field public
        }
    }

    public Warper() {
        try {
            stringValue.set(
                    "Romeo, Romeo, wherefore art thou oh Romero?",
                    "Stop this romance nonsense, or I'll be sick".
                            toCharArray());
            stringValue.set("hi there", "cheers !".toCharArray());
        } catch (IllegalAccessException ex) {
          System.out.println("ex = " + ex);
        } // shhh
    }

}
