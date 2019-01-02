/*
 * Copyright 2010-2019 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.android;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("plugins/android-extensions/android-extensions-idea/testData/android/parcel/checker")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class ParcelCheckerTestGenerated extends AbstractParcelCheckerTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
    }

    public void testAllFilesPresentInChecker() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("plugins/android-extensions/android-extensions-idea/testData/android/parcel/checker"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
    }

    @TestMetadata("constructors.kt")
    public void testConstructors() throws Exception {
        runTest("plugins/android-extensions/android-extensions-idea/testData/android/parcel/checker/constructors.kt");
    }

    @TestMetadata("customCreator.kt")
    public void testCustomCreator() throws Exception {
        runTest("plugins/android-extensions/android-extensions-idea/testData/android/parcel/checker/customCreator.kt");
    }

    @TestMetadata("customParcelers.kt")
    public void testCustomParcelers() throws Exception {
        runTest("plugins/android-extensions/android-extensions-idea/testData/android/parcel/checker/customParcelers.kt");
    }

    @TestMetadata("customWriteToParcel.kt")
    public void testCustomWriteToParcel() throws Exception {
        runTest("plugins/android-extensions/android-extensions-idea/testData/android/parcel/checker/customWriteToParcel.kt");
    }

    @TestMetadata("delegate.kt")
    public void testDelegate() throws Exception {
        runTest("plugins/android-extensions/android-extensions-idea/testData/android/parcel/checker/delegate.kt");
    }

    @TestMetadata("emptyPrimaryConstructor.kt")
    public void testEmptyPrimaryConstructor() throws Exception {
        runTest("plugins/android-extensions/android-extensions-idea/testData/android/parcel/checker/emptyPrimaryConstructor.kt");
    }

    @TestMetadata("kt20062.kt")
    public void testKt20062() throws Exception {
        runTest("plugins/android-extensions/android-extensions-idea/testData/android/parcel/checker/kt20062.kt");
    }

    @TestMetadata("modality.kt")
    public void testModality() throws Exception {
        runTest("plugins/android-extensions/android-extensions-idea/testData/android/parcel/checker/modality.kt");
    }

    @TestMetadata("notMagicParcel.kt")
    public void testNotMagicParcel() throws Exception {
        runTest("plugins/android-extensions/android-extensions-idea/testData/android/parcel/checker/notMagicParcel.kt");
    }

    @TestMetadata("properties.kt")
    public void testProperties() throws Exception {
        runTest("plugins/android-extensions/android-extensions-idea/testData/android/parcel/checker/properties.kt");
    }

    @TestMetadata("simple.kt")
    public void testSimple() throws Exception {
        runTest("plugins/android-extensions/android-extensions-idea/testData/android/parcel/checker/simple.kt");
    }

    @TestMetadata("unsupportedType.kt")
    public void testUnsupportedType() throws Exception {
        runTest("plugins/android-extensions/android-extensions-idea/testData/android/parcel/checker/unsupportedType.kt");
    }

    @TestMetadata("withoutParcelableSupertype.kt")
    public void testWithoutParcelableSupertype() throws Exception {
        runTest("plugins/android-extensions/android-extensions-idea/testData/android/parcel/checker/withoutParcelableSupertype.kt");
    }

    @TestMetadata("wrongAnnotationTarget.kt")
    public void testWrongAnnotationTarget() throws Exception {
        runTest("plugins/android-extensions/android-extensions-idea/testData/android/parcel/checker/wrongAnnotationTarget.kt");
    }
}
