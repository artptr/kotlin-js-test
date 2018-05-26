@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:JsModule("https")
package https

import kotlin.js.*
import kotlin.js.Json
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.events.*
import org.w3c.dom.parsing.*
import org.w3c.dom.svg.*
import org.w3c.dom.url.*
import org.w3c.fetch.*
import org.w3c.files.*
import org.w3c.notifications.*
import org.w3c.performance.*
import org.w3c.workers.*
import org.w3c.xhr.*

external interface AgentOptions : http.AgentOptions, tls.ConnectionOptions {
    override var rejectUnauthorized: Boolean? get() = definedExternally; set(value) = definedExternally
    var maxCachedSessions: Number? get() = definedExternally; set(value) = definedExternally
}
external open class Agent(options: AgentOptions? = definedExternally /* null */) : http.Agent {
    open var options: AgentOptions = definedExternally
}
external open class Server : tls.Server {
    open fun setTimeout(callback: () -> Unit): Server /* this */ = definedExternally
    open fun setTimeout(msecs: Number? = definedExternally /* null */, callback: (() -> Unit)? = definedExternally /* null */): Server /* this */ = definedExternally
    open var timeout: Number = definedExternally
    open var keepAliveTimeout: Number = definedExternally
}
external fun createServer(options: tls.SecureContextOptions /* tls.SecureContextOptions & tls.TlsOptions */, requestListener: ((req: http.IncomingMessage, res: http.ServerResponse) -> Unit)? = definedExternally /* null */): Server = definedExternally
external interface `T$17` {
    var rejectUnauthorized: Boolean? get() = definedExternally; set(value) = definedExternally
    var servername: String? get() = definedExternally; set(value) = definedExternally
}
external fun request(options: String, callback: ((res: http.IncomingMessage) -> Unit)? = definedExternally /* null */): http.ClientRequest = definedExternally
external fun request(options: url.URL, callback: ((res: http.IncomingMessage) -> Unit)? = definedExternally /* null */): http.ClientRequest = definedExternally
external fun request(options: http.RequestOptions /* http.RequestOptions & tls.SecureContextOptions & `T$17` */, callback: ((res: http.IncomingMessage) -> Unit)? = definedExternally /* null */): http.ClientRequest = definedExternally
external fun get(options: String, callback: ((res: http.IncomingMessage) -> Unit)? = definedExternally /* null */): http.ClientRequest = definedExternally
external fun get(options: url.URL, callback: ((res: http.IncomingMessage) -> Unit)? = definedExternally /* null */): http.ClientRequest = definedExternally
external fun get(options: http.RequestOptions /* http.RequestOptions & tls.SecureContextOptions & `T$17` */, callback: ((res: http.IncomingMessage) -> Unit)? = definedExternally /* null */): http.ClientRequest = definedExternally
external var globalAgent: Agent = definedExternally
