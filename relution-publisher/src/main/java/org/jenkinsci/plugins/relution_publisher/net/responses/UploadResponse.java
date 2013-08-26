/*
 * Copyright (c) 2013 M-Way Solutions GmbH
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jenkinsci.plugins.relution_publisher.net.responses;

import org.jenkinsci.plugins.relution_publisher.entities.Asset;

import java.util.ArrayList;
import java.util.List;


public class UploadResponse extends ApiResponse {

    private final List<Asset> results = new ArrayList<Asset>();

    public List<Asset> getAssets() {
        return this.results;
    }
}