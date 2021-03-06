/*
 * Copyright (C) 2016 Glucosio Foundation
 *
 * This file is part of Glucosio.
 *
 * Glucosio is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, version 3.
 *
 * Glucosio is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Glucosio.  If not, see <http://www.gnu.org/licenses/>.
 *
 *
 */

package org.glucosio.android.TeamCorrectFaultInjection;


public class InputFilterMinMax {
    

    private double min, max;
    

    public InputFilterMinMax(double min, double max) {
        this.max = max;
        this.min = min;
    }

    
    //Fault Injection #3
    //Changed operation signs in expression (Original: b > a ? c >= a && c <= b : c >= b && c <= a)
    protected boolean isInRange(double a, double b, double c) {
        return b < a ? c <= a && c >= b : c <= b && c >= a;
    }
}
