package net.insomniakitten.mvillage.module.furniture;

/*
 *  Copyright 2017 InsomniaKitten
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

import net.insomniakitten.mvillage.module.ModuleMV;

public class ModuleFurniture extends ModuleMV {

    private static final String NAME = "furniture";

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }

}