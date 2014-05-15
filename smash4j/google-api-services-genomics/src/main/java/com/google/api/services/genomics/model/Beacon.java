/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://code.google.com/p/google-apis-client-generator/
 * Modify at your own risk.
 */

package com.google.api.services.genomics.model;

/**
 * A beacon represents whether any variant call in a dataset has a specific allele at a particular
 * position.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Genomics API. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Beacon extends com.google.api.client.json.GenericJson {

  /**
   * True if the allele exists on any variant call, false otherwise.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean exists;

  /**
   * True if the allele exists on any variant call, false otherwise.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getExists() {
    return exists;
  }

  /**
   * True if the allele exists on any variant call, false otherwise.
   * @param exists exists or {@code null} for none
   */
  public Beacon setExists(java.lang.Boolean exists) {
    this.exists = exists;
    return this;
  }

  @Override
  public Beacon set(String fieldName, Object value) {
    return (Beacon) super.set(fieldName, value);
  }

  @Override
  public Beacon clone() {
    return (Beacon) super.clone();
  }

}
