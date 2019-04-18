/*-
 * #%L
 * Fizz-Buzz Kata
 * %%
 * Copyright (C) 2019 Chrysocode
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-3.0.html>.
 * #L%
 */

package kata;

import static java.lang.String.valueOf;

public class FizzBuzz {

    private static final String NOTHING = "";
    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";

    public String fizzbuzzify(int number) {
        StringBuilder fizzbuzzified = new StringBuilder();
        fizzbuzzified
                .append(multipleOf3(number) ? FIZZ : NOTHING)
                .append(multipleOf5(number) ? BUZZ : NOTHING)
                .append(fizzbuzzified.length() == 0 ? valueOf(number) : NOTHING);
        return fizzbuzzified.toString();
    }

    private boolean multipleOf3(int number) {
        return number % 3 == 0;
    }

    private boolean multipleOf5(int number) {
        return number % 5 == 0;
    }
}