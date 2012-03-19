/**
 * Copyright 2012 Lingering Socket Labs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.lingeringsocket.mobflare;

import android.app.*;

/**
 * Defines the abstraction for the output of a flare, such as a camera flash.
 */
public interface FlareOutput
{
    /**
     * Initializes the output method.
     *
     * @param activity parent activity
     */
    public void initialize(Activity activity);

    /**
     * Begins producing output (e.g. turns on the camera flash).
     */
    public void beginOutput();
    
    /**
     * Ceases producing output (e.g. turns off the camera flash).
     */
    public void endOutput();

    /**
     * Releases any resources.
     */
    public void release();
}
