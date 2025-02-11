/****************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one   *
 * or more contributor license agreements.  See the NOTICE file *
 * distributed with this work for additional information        *
 * regarding copyright ownership.  The ASF licenses this file   *
 * to you under the Apache License, Version 2.0 (the            *
 * "License"); you may not use this file except in compliance   *
 * with the License.  You may obtain a copy of the License at   *
 *                                                              *
 *   http://www.apache.org/licenses/LICENSE-2.0                 *
 *                                                              *
 * Unless required by applicable law or agreed to in writing,   *
 * software distributed under the License is distributed on an  *
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY       *
 * KIND, either express or implied.  See the License for the    *
 * specific language governing permissions and limitations      *
 * under the License.                                           *
 ****************************************************************/

package org.apache.james.smtpserver;

import org.apache.james.protocols.api.ProtocolSession;
import org.apache.james.protocols.smtp.SMTPSession;
import org.apache.james.server.core.MimeMessageInputStreamSource;
import org.apache.mailet.Mail;

import io.netty.util.AttributeKey;

/**
 * Constants which are used within SMTP Session
 */
public interface SMTPConstants {

    ProtocolSession.AttachmentKey<MimeMessageInputStreamSource> DATA_MIMEMESSAGE_STREAMSOURCE = ProtocolSession.AttachmentKey.of("org.apache.james.core.DataCmdHandler.DATA_MIMEMESSAGE_STREAMSOURCE", MimeMessageInputStreamSource.class);
    ProtocolSession.AttachmentKey<Mail> MAIL = ProtocolSession.AttachmentKey.of("MAIL", Mail.class);

    AttributeKey<SMTPSession> SMTP_SESSION_ATTRIBUTE_KEY = AttributeKey.valueOf("SmtpSession");

}
