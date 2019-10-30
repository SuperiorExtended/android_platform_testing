/*
 * Copyright (C) 2019 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package android.platform.test.longevity;

import org.junit.runner.Runner;
import org.junit.runners.model.RunnerBuilder;

/** A {@link RunnerBuilder} that uses {@link LongevityClassRunner} to run tests in a suite. */
public class HealthRunnerBuilder extends RunnerBuilder {
    @Override
    public Runner runnerForClass(Class<?> testClass) throws Throwable {
        return new LongevityClassRunner(testClass);
    }
}
