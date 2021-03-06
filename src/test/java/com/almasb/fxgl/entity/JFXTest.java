/*
 * The MIT License (MIT)
 *
 * FXGL - JavaFX Game Library
 *
 * Copyright (c) 2015 AlmasB (almaslvl@gmail.com)
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.almasb.fxgl.entity;

import javafx.scene.Parent;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import org.junit.Test;

public class JFXTest {

    @Test
    public void createParent() {
        Parent parent = new Parent() {
        };

        Circle circle = new Circle(5);
        Rectangle rect = new Rectangle(40, 40);
    }

    @Test
    public void createText() {
        Text text = new Text();
    }

    @Test
    public void createEntity() {
        //Entity entity = Entity.noType();
    }

    // private enum Type implements EntityType {
    // TEST_ENTITY
    // }
    //
    // private static GameApplication app;
    // private Entity testEntity;
    //
    // @BeforeClass
    // public static void setupFramework() {
    // Thread t = new Thread(() ->
    // Application.launch(TestGameApplication.class, new String[] {}));
    // t.setDaemon(true);
    // t.start();
    //
    // while ((app = TestGameApplication.getInstance()) == null) {
    // try {
    // Thread.sleep(10);
    // }
    // catch (InterruptedException e) {
    // e.printStackTrace();
    // }
    // }
    // }
    //
    // @AfterClass
    // public static void exitFramework() {
    // Platform.exit();
    // }
}
