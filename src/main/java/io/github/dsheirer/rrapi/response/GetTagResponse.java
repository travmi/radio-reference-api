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

package io.github.dsheirer.rrapi.response;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import io.github.dsheirer.rrapi.type.County;
import io.github.dsheirer.rrapi.type.Tag;

import java.util.ArrayList;
import java.util.List;

public class GetTagResponse extends ResponseBody
{
    private List<Tag> mTags = new ArrayList<>();

    public GetTagResponse()
    {
    }

    @JacksonXmlProperty(localName = "return")
    public List<Tag> getTags()
    {
        return mTags;
    }

    public void setTags(List<Tag> tags)
    {
        mTags = tags;
    }
}
