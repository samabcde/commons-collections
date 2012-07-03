/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * This package contains implementations of the
 * {@link org.apache.commons.collections.Buffer Buffer} interface.
 * <p>
 * The following implementations are provided in the package:
 * <ul>
 *   <li>PriorityBuffer - provides for removal based on a comparator ordering
 *   <li>BoundedFifoBuffer - implements a buffer with a fixed size that throws exceptions when full
 *   <li>CircularFifoBuffer - implements a buffer with a fixed size that discards oldest when full
 *   <li>UnboundedFifoBuffer - implements a buffer that grows in size if necessary
 * </ul>
 * <p>
 * The following decorators are provided in the package:
 * <ul>
 *   <li>Synchronized - synchronizes method access for multi-threaded environments
 *   <li>Unmodifiable - ensures the collection cannot be altered
 *   <li>Predicated - ensures that only elements that are valid according to a predicate can be added
 *   <li>Typed - ensures that only elements that are of a specific type can be added
 *   <li>Transformed - transforms elements added to the buffer
 *   <li>Blocking - blocks on get and remove until an element is available
 * </ul>
 * 
 * @version $Id$
 */
package org.apache.commons.collections.buffer;