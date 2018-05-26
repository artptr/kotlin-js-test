@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:JsModule("http")
package http

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

external interface IncomingHttpHeaders {
    @nativeGetter
    operator fun get(header: String): dynamic /* String | Array<String> | Nothing? */
    @nativeSetter
    operator fun set(header: String, value: String)
    @nativeSetter
    operator fun set(header: String, value: Array<String>)
    @nativeSetter
    operator fun set(header: String, value: Nothing?)
}
external interface OutgoingHttpHeaders {
    @nativeGetter
    operator fun get(header: String): dynamic /* String | Number | Array<String> | Nothing? */
    @nativeSetter
    operator fun set(header: String, value: String)
    @nativeSetter
    operator fun set(header: String, value: Number)
    @nativeSetter
    operator fun set(header: String, value: Array<String>)
    @nativeSetter
    operator fun set(header: String, value: Nothing?)
}
external interface ClientRequestArgs {
    var protocol: String? get() = definedExternally; set(value) = definedExternally
    var host: String? get() = definedExternally; set(value) = definedExternally
    var hostname: String? get() = definedExternally; set(value) = definedExternally
    var family: Number? get() = definedExternally; set(value) = definedExternally
    var port: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var defaultPort: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var localAddress: String? get() = definedExternally; set(value) = definedExternally
    var socketPath: String? get() = definedExternally; set(value) = definedExternally
    var method: String? get() = definedExternally; set(value) = definedExternally
    var path: String? get() = definedExternally; set(value) = definedExternally
    var headers: OutgoingHttpHeaders? get() = definedExternally; set(value) = definedExternally
    var auth: String? get() = definedExternally; set(value) = definedExternally
    var agent: dynamic /* Boolean | Agent */ get() = definedExternally; set(value) = definedExternally
    var _defaultAgent: Agent? get() = definedExternally; set(value) = definedExternally
    var timeout: Number? get() = definedExternally; set(value) = definedExternally
    var createConnection: ((options: ClientRequestArgs, oncreate: (err: Error, socket: net.Socket) -> Unit) -> net.Socket)? get() = definedExternally; set(value) = definedExternally
}
external open class Server(requestListener: ((req: IncomingMessage, res: ServerResponse) -> Unit)? = definedExternally /* null */) : net.Server {
    open fun setTimeout(msecs: Number? = definedExternally /* null */, callback: (() -> Unit)? = definedExternally /* null */): Server /* this */ = definedExternally
    open fun setTimeout(callback: () -> Unit): Server /* this */ = definedExternally
    open var maxHeadersCount: Number = definedExternally
    open var timeout: Number = definedExternally
    open var keepAliveTimeout: Number = definedExternally
}
external open class ServerRequest : IncomingMessage {
    override var connection: net.Socket = definedExternally
}
external open class OutgoingMessage : stream.internal.Writable {
    open var upgrading: Boolean = definedExternally
    open var chunkedEncoding: Boolean = definedExternally
    open var shouldKeepAlive: Boolean = definedExternally
    open var useChunkedEncodingByDefault: Boolean = definedExternally
    open var sendDate: Boolean = definedExternally
    open var finished: Boolean = definedExternally
    open var headersSent: Boolean = definedExternally
    open var connection: net.Socket = definedExternally
    open fun setTimeout(msecs: Number, callback: (() -> Unit)? = definedExternally /* null */): OutgoingMessage /* this */ = definedExternally
    override fun destroy(error: Error): Unit = definedExternally
    open fun setHeader(name: String, value: String): Unit = definedExternally
    open fun setHeader(name: String, value: Number): Unit = definedExternally
    open fun setHeader(name: String, value: Array<String>): Unit = definedExternally
    open fun setHeader(name: String, value: Nothing?): Unit = definedExternally
    open fun getHeader(name: String): dynamic /* String | Number | Array<String> | Nothing? */ = definedExternally
    open fun getHeaders(): OutgoingHttpHeaders = definedExternally
    open fun getHeaderNames(): Array<String> = definedExternally
    open fun hasHeader(name: String): Boolean = definedExternally
    open fun removeHeader(name: String): Unit = definedExternally
    open fun addTrailers(headers: OutgoingHttpHeaders): Unit = definedExternally
    open fun addTrailers(headers: Array<dynamic /* JsTuple<String, String> */>): Unit = definedExternally
    open fun flushHeaders(): Unit = definedExternally
}
external open class ServerResponse(req: IncomingMessage) : OutgoingMessage {
    open var statusCode: Number = definedExternally
    open var statusMessage: String = definedExternally
    open fun assignSocket(socket: net.Socket): Unit = definedExternally
    open fun detachSocket(socket: net.Socket): Unit = definedExternally
    open fun writeContinue(callback: (() -> Unit)? = definedExternally /* null */): Unit = definedExternally
    open fun writeHead(statusCode: Number, reasonPhrase: String? = definedExternally /* null */, headers: OutgoingHttpHeaders? = definedExternally /* null */): Unit = definedExternally
    open fun writeHead(statusCode: Number, headers: OutgoingHttpHeaders? = definedExternally /* null */): Unit = definedExternally
    open fun writeHead(statusCode: Number): Unit = definedExternally
}
external open class ClientRequest : OutgoingMessage {
    constructor(url: String, cb: ((res: IncomingMessage) -> Unit)? = definedExternally /* null */)
    constructor(url: ClientRequestArgs, cb: ((res: IncomingMessage) -> Unit)? = definedExternally /* null */)
    constructor(url: url.URL, cb: ((res: IncomingMessage) -> Unit)? = definedExternally /* null */)
    override var connection: net.Socket = definedExternally
    open var socket: net.Socket = definedExternally
    open var aborted: Number = definedExternally
    open fun abort(): Unit = definedExternally
    open fun onSocket(socket: net.Socket): Unit = definedExternally
    open fun setTimeout(timeout: Number, callback: (() -> Unit)? = definedExternally /* null */): ClientRequest /* this */ = definedExternally
    open fun setNoDelay(noDelay: Boolean? = definedExternally /* null */): Unit = definedExternally
    open fun setSocketKeepAlive(enable: Boolean? = definedExternally /* null */, initialDelay: Number? = definedExternally /* null */): Unit = definedExternally
}
external interface `T$9` {
    @nativeGetter
    operator fun get(key: String): String?
    @nativeSetter
    operator fun set(key: String, value: String?)
}
external open class IncomingMessage(socket: net.Socket) : stream.internal.Readable {
    open var httpVersion: String = definedExternally
    open var httpVersionMajor: Number = definedExternally
    open var httpVersionMinor: Number = definedExternally
    open var connection: net.Socket = definedExternally
    open var headers: IncomingHttpHeaders = definedExternally
    open var rawHeaders: Array<String> = definedExternally
    open var trailers: `T$9` = definedExternally
    open var rawTrailers: Array<String> = definedExternally
    open fun setTimeout(msecs: Number, callback: () -> Unit): IncomingMessage /* this */ = definedExternally
    open var method: String = definedExternally
    open var url: String = definedExternally
    open var statusCode: Number = definedExternally
    open var statusMessage: String = definedExternally
    open var socket: net.Socket = definedExternally
    override fun destroy(error: Error?): Unit = definedExternally
}
external open class ClientResponse : IncomingMessage
external interface AgentOptions {
    var keepAlive: Boolean? get() = definedExternally; set(value) = definedExternally
    var keepAliveMsecs: Number? get() = definedExternally; set(value) = definedExternally
    var maxSockets: Number? get() = definedExternally; set(value) = definedExternally
    var maxFreeSockets: Number? get() = definedExternally; set(value) = definedExternally
}
external open class Agent(opts: AgentOptions? = definedExternally /* null */) {
    open var maxSockets: Number = definedExternally
    open var sockets: Any = definedExternally
    open var requests: Any = definedExternally
    open fun destroy(): Unit = definedExternally
}
external var METHODS: Array<String> = definedExternally
external object STATUS_CODES {
    @nativeGetter
    operator fun get(errorCode: Number): String?
    @nativeSetter
    operator fun set(errorCode: Number, value: String?)
    @nativeGetter
    operator fun get(errorCode: String): String?
    @nativeSetter
    operator fun set(errorCode: String, value: String?)
}
external fun createServer(requestListener: ((request: IncomingMessage, response: ServerResponse) -> Unit)? = definedExternally /* null */): Server = definedExternally
external fun createClient(port: Number? = definedExternally /* null */, host: String? = definedExternally /* null */): Any = definedExternally
external interface RequestOptions : ClientRequestArgs
external fun request(options: String, callback: ((res: IncomingMessage) -> Unit)? = definedExternally /* null */): ClientRequest = definedExternally
external fun request(options: url.URL, callback: ((res: IncomingMessage) -> Unit)? = definedExternally /* null */): ClientRequest = definedExternally
external fun request(options: RequestOptions, callback: ((res: IncomingMessage) -> Unit)? = definedExternally /* null */): ClientRequest = definedExternally
external fun get(options: String, callback: ((res: IncomingMessage) -> Unit)? = definedExternally /* null */): ClientRequest = definedExternally
external fun get(options: url.URL, callback: ((res: IncomingMessage) -> Unit)? = definedExternally /* null */): ClientRequest = definedExternally
external fun get(options: RequestOptions, callback: ((res: IncomingMessage) -> Unit)? = definedExternally /* null */): ClientRequest = definedExternally
external var globalAgent: Agent = definedExternally
