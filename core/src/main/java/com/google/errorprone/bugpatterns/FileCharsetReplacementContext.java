/*
 * Copyright 2016 The Error Prone Authors.
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
package com.google.errorprone.bugpatterns;
public class FileCharsetReplacementContext {

    private VisitorState state;

    private Tree toReplace;

    private com.google.errorprone.bugpatterns.DefaultCharset.CharsetFix charset;

    public VisitorState getState() {
        return state;
    }

    public Tree getToReplace() {
        return toReplace;
    }

    public com.google.errorprone.bugpatterns.DefaultCharset.CharsetFix getCharset() {
        return charset;
    }

    public void setState(VisitorState state) {
        this.state=state;
    }

    public void setToReplace(Tree toReplace) {
        this.toReplace=toReplace;
    }

    public void setCharset(com.google.errorprone.bugpatterns.DefaultCharset.CharsetFix charset) {
        this.charset=charset;
    }

    public FileCharsetReplacementContext    (VisitorState state,Tree toReplace,com.google.errorprone.bugpatterns.DefaultCharset.CharsetFix charset){
        this.state    =    state;
        this.toReplace    =    toReplace;
        this.charset    =    charset;
}
}
