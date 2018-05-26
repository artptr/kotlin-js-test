@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:JsQualifier("createServer")
package createServer

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

external interface ServerStackItem {
    var route: String
    var handle: ServerHandle
}
external interface Server : NodeJS.EventEmitter {
    @nativeInvoke
    operator fun invoke(req: http.IncomingMessage, res: http.ServerResponse, next: Function<*>? = definedExternally /* null */)
    var route: String
    var stack: Array<ServerStackItem>
    fun use(fn: (req: http.IncomingMessage, res: http.ServerResponse) -> Unit): Server
    fun use(fn: (req: http.IncomingMessage, res: http.ServerResponse, next: (err: Any? /*= null*/) -> Unit) -> Unit): Server
    fun use(fn: (err: Any, req: http.IncomingMessage, res: http.ServerResponse, next: (err: Any? /*= null*/) -> Unit) -> Unit): Server
    fun use(route: String, fn: (req: http.IncomingMessage, res: http.ServerResponse) -> Unit): Server
    fun use(route: String, fn: (req: http.IncomingMessage, res: http.ServerResponse, next: (err: Any? /*= null*/) -> Unit) -> Unit): Server
    fun use(route: String, fn: (err: Any, req: http.IncomingMessage, res: http.ServerResponse, next: (err: Any? /*= null*/) -> Unit) -> Unit): Server
    fun handle(req: http.IncomingMessage, res: http.ServerResponse, next: Function<*>)
    fun listen(port: Number, hostname: String? = definedExternally /* null */, backlog: Number? = definedExternally /* null */, callback: Function<*>? = definedExternally /* null */): http.Server
    fun listen(port: Number, hostname: String? = definedExternally /* null */, callback: Function<*>? = definedExternally /* null */): http.Server
    fun listen(path: String, callback: Function<*>? = definedExternally /* null */): http.Server
    fun listen(handle: Any, listeningListener: Function<*>? = definedExternally /* null */): http.Server
    fun listen(port: Number): http.Server
}
