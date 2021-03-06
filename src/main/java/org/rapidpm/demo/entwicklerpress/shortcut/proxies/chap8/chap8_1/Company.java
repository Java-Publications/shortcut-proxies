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

package org.rapidpm.demo.entwicklerpress.shortcut.proxies.chap8.chap8_1;

import org.rapidpm.demo.entwicklerpress.shortcut.proxies.chap8.chap8_1.moralfibre.MoralFibre;

/**
 * Created by Sven Ruppert on 14.01.14.
 */
public class Company {

    private final String name;
    private final MoralFibre moralFibre;
    private double cash;

    public Company(String name, double cash, MoralFibre moralFibre) {
        this.name = name;
        this.cash = cash;
        this.moralFibre = moralFibre;
        System.out.println("Company constructed: " + this);
    }

    public void damageEnvironment() {
        cash += 4000000;
        System.out.println("Company.damageEnvironment(): " + this);
    }

    public void makeMoney() {
        cash += 1000000;
        System.out.println("Company.makeMoney(): " + this);
    }

    public void becomeFocusOfMediaAttention() {
        cash -= moralFibre.actSociallyResponsibly();
        cash -= moralFibre.cleanupEnvironment();
        cash -= moralFibre.empowerEmployees();
        System.out.println("Look how good we are... " + this);
    }

    public String toString() {
        return String.format("%s has $ %.2f", name, cash);
    }

}
