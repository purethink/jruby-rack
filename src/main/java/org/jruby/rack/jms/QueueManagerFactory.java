/*
 * Copyright (c) 2010 Engine Yard, Inc.
 * Copyright (c) 2007-2009 Sun Microsystems, Inc.
 * This source code is available under the MIT license.
 * See the file LICENSE.txt for details.
 */

package org.jruby.rack.jms;

/**
 *
 * @author nicksieger
 */
public interface QueueManagerFactory {
    QueueManager newQueueManager();
}
