/**
 * Copyright 2012 Microsoft Corporation
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.microsoft.windowsazure.services.media.entities;

import static org.junit.Assert.*;

import java.util.EnumSet;

import org.junit.Test;

import com.microsoft.windowsazure.services.media.implementation.content.AccessPolicyType;
import com.microsoft.windowsazure.services.media.models.AccessPolicyInfo;
import com.microsoft.windowsazure.services.media.models.AccessPolicyPermission;

/**
 * Tests for access policy entity
 * 
 */
public class AccessPolicyEntityTest {

    @Test
    public void createAccessPolicyProvidesExpectedPayload() throws Exception {
        String name = "some Access Policy";
        double duration = 10;
        EnumSet<AccessPolicyPermission> permissions = EnumSet.of(AccessPolicyPermission.READ,
                AccessPolicyPermission.LIST);

        EntityCreationOperation<AccessPolicyInfo> creator = AccessPolicy.create(name, duration, permissions);

        AccessPolicyType payload = (AccessPolicyType) creator.getRequestContents();

        assertEquals(name, payload.getName());
        assertEquals(duration, payload.getDurationInMinutes(), 0.0);
        assertEquals(AccessPolicyPermission.bitsFromPermissions(permissions), payload.getPermissions());

    }

}
