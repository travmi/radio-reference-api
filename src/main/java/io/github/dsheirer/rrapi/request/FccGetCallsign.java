/*
 * *****************************************************************************
 * Copyright (C) 2019 Dennis Sheirer
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 * ****************************************************************************
 */

package io.github.dsheirer.rrapi.request;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import io.github.dsheirer.rrapi.type.AuthorizationInformation;

/**
 * Country information
 */
public class FccGetCallsign extends RequestBody
{
    private String mCallsign;

    /**
     * Constructs the request
     * @param authorizationInformation for the user
     * @param stateIds to request
     */
    public FccGetCallsign(AuthorizationInformation authorizationInformation, String callsign)
    {
        super(authorizationInformation);
        mCallsign = callsign;
    }

    @JacksonXmlProperty(localName = "request")
    public String getCallsign()
    {
        return mCallsign;
    }

    public void setCallsign(String callsign)
    {
        mCallsign = callsign;
    }

    public static RequestEnvelope create(AuthorizationInformation authorizationInformation, String callsign)
    {
        return RequestBody.create(new FccGetCallsign(authorizationInformation, callsign));
    }
}
