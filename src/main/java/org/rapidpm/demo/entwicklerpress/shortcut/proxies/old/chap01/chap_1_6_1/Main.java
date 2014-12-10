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

/**
 * Created by Sven Ruppert on 19.01.14.
 */
public class Main {
    private static final String OH_ROMEO ="Romeo, Romeo, wherefore art thou oh Romero?";
    private static final String HI_THERE ="hi there";
    private static final Warper warper = new Warper();

    public static void main(String[] args) {
//      Warper warper = new Warper();
      System.out.println(OH_ROMEO);
      System.out.println(HI_THERE);
      System.out.println("Romeo, Romeo, wherefore art thou oh Romero?");
      System.out.println("hi there");
      System.out.println("warper = " + warper);
    }
}
