/* Copyright 2010-2013 Norconex Inc.
 * 
 * This file is part of Norconex HTTP Collector.
 * 
 * Norconex HTTP Collector is free software: you can redistribute it and/or 
 * modify it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Norconex HTTP Collector is distributed in the hope that it will be useful, 
 * but WITHOUT ANY WARRANTY; without even the implied warranty of 
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with Norconex HTTP Collector. If not, 
 * see <http://www.gnu.org/licenses/>.
 */
package com.norconex.collector.http.sitemap.impl;

import java.io.IOException;

import org.junit.Test;

import com.norconex.commons.lang.config.ConfigurationUtil;

public class DefaultSitemapResolverTest {

    @Test
    public void testWriteRead() throws IOException {
        DefaultSitemapResolver r = new DefaultSitemapResolver();
        r.setLenient(true);
        r.setSitemapLocations(
                "http://www.example.com/sitemap.xml",
                "http://www.example.com/subdir/sitemap.xml");
        System.out.println("Writing/Reading this: " + r);
        ConfigurationUtil.assertWriteRead(r);
    }

}
