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

package org.rapidpm.demo.entwicklerpress.shortcut.proxies.chap2.c_2_3.bank;

/**
 * Created by Alexander Bischof on 03.09.14.
 */
//Note: IntelliJ Console.readLine Problem, so start it with terminal
public class KontoMitPasswort implements IKonto {
    private Konto konto;
    private String passwort;

    public KontoMitPasswort(Konto konto, String passwort) {
        this.konto = konto;
        this.passwort = passwort;
    }

    @Override
    public void einzahlen(double betrag) {

        char[] chars = System.console().readPassword("Passwort: ");
        if (passwort.equals(new String(chars))) {
            konto.einzahlen(betrag);
        } else {
            System.out.println("falsches Passwort");
        }
    }

    @Override
    public void auszahlen(double betrag) {
        char[] chars = System.console().readPassword("Passwort: ");
        if (passwort.equals(new String(chars))) {
            konto.auszahlen(betrag);
        } else {
            System.out.println("falsches Passwort");
        }
    }

    @Override
    public double getKontostand() {
        return konto.getKontostand();
    }
}
