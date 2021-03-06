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

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import io.github.dsheirer.rrapi.type.AuthorizationInformation;

/**
 * Payload for a Radio Reference SOAP envelope body element
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.WRAPPER_OBJECT)
@JsonSubTypes({
    @JsonSubTypes.Type(value = FccGetCallsign.class, name = "fccGetCallsign"),
    @JsonSubTypes.Type(value = GetAgencyInfo.class, name = "getAgencyInfo"),
    @JsonSubTypes.Type(value = GetCountryInfo.class, name = "getCountryInfo"),
    @JsonSubTypes.Type(value = GetCountryList.class, name = "getCountryList"),
    @JsonSubTypes.Type(value = GetCountiesByList.class, name = "getCountiesByList"),
    @JsonSubTypes.Type(value = GetCountyInfo.class, name = "getCountyInfo"),
    @JsonSubTypes.Type(value = GetMode.class, name = "getMode"),
    @JsonSubTypes.Type(value = GetStatesByList.class, name = "getStatesByList"),
    @JsonSubTypes.Type(value = GetStateInfo.class, name = "getStateInfo"),
    @JsonSubTypes.Type(value = GetTag.class, name = "getTag"),
    @JsonSubTypes.Type(value = GetTrsBySysid.class, name = "getTrsBySysid"),
    @JsonSubTypes.Type(value = GetTrsDetails.class, name = "getTrsDetails"),
    @JsonSubTypes.Type(value = GetTrsSites.class, name = "getTrsSites"),
    @JsonSubTypes.Type(value = GetTrunkedSystemFlavor.class, name = "getTrsFlavor"),
    @JsonSubTypes.Type(value = GetTrunkedSystemTalkgroupCategories.class, name = "getTrsTalkgroupCats"),
    @JsonSubTypes.Type(value = GetTrunkedSystemTalkgroups.class, name = "getTrsTalkgroups"),
    @JsonSubTypes.Type(value = GetTrunkedSystemType.class, name = "getTrsType"),
    @JsonSubTypes.Type(value = GetTrunkedSystemVoice.class, name = "getTrsVoice"),
    @JsonSubTypes.Type(value = GetUserData.class, name = "getUserData"),
    @JsonSubTypes.Type(value = GetUserFeedBroadcasts.class, name = "getUserFeedBroadcasts"),
    @JsonSubTypes.Type(value = GetZipcodeInfo.class, name = "getZipcodeInfo"),
})
public class RequestBody
{
    private AuthorizationInformation mAuthorizationInformation;

    public RequestBody()
    {
    }

    public RequestBody(AuthorizationInformation authorizationInformation)
    {
        mAuthorizationInformation = authorizationInformation;
    }

    @JacksonXmlProperty(localName = "authInfo")
    public AuthorizationInformation getAuthorizationInformation()
    {
        return mAuthorizationInformation;
    }

    /**
     * Sets the authorization information for this request
     * @param authorizationInformation
     */
    public void setAuthorizationInformation(AuthorizationInformation authorizationInformation)
    {
        mAuthorizationInformation = authorizationInformation;
    }

    public static RequestEnvelope create(RequestBody requestBody)
    {
        return RequestEnvelope.create(requestBody);
    }
}
